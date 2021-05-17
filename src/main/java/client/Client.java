package client;

import com.google.gson.JsonObject;
import pojo.requests.LoginBody;
import pojo.requests.SendMessageBody;
import pojo.response.account.AccountData;
import pojo.response.ndc_account.NdcAccount;
import pojo.response.sub_clients.CommunitiesData;
import pojo.response.thread_list.ThreadList;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import utils.TimeUtils;

import java.io.IOException;

import static headers.Headers.*;

public class Client {
    static RestClientService client = getClient();
    public String SID;
    public String comId;

    public AccountData login(String email, String password) {
        int unixTime = TimeUtils.unixInstant();
        LoginBody body = new LoginBody();
        body.email = email;
        body.v = 2;
        body.secret = "0 " + password;
        body.deviceID = deviceId;
        body.clientType = 100;
        body.action = "normal";
        body.timestamp = unixTime;
        Call<AccountData> res = client.getAccountData(
                headersMap,
                body
        );
        try {
            Response<AccountData> accountData = res.execute();
            if (accountData.isSuccessful()) {
                SID = accountData.body().getSid();
                return accountData.body();
            } else {
                System.out.println(accountData.errorBody().string());
                System.exit(0);
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public CommunitiesData getSubClients(int start, int size) {
        headersMap.put("NDCAUTH", "sid=" + SID);
        Call<CommunitiesData> res = client.getSubClients(
                headersMap,
                start,
                size
        );
        try {
            return res.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public NdcAccount getUserInfo(String userId) {
        if (comId == null){
            System.out.println("Invalid comId");
            return null;
        }
        headersMap.put("NDCAUTH", "sid=" + SID);
        Call<NdcAccount> res = client.ndcAccountData(
                headersMap,
                comId,
                userId
        );
        try {
            return res.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ThreadList getChatThreads(String type, int start, int size) {
        Call<ThreadList> res = client.ndcChatThreads(
                headersMap,
                comId,
                type,
                start,
                size
        );
        try {
            return res.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void sendMessage(String message, String chatId) {
        SendMessageBody body = new SendMessageBody();
        body.type = 0;
        body.content = message;
        headersMap.put("NDCAUTH", "sid=" + SID);
        Call<JsonObject> res = client.sendMessage(
                headersMap,
                comId,
                chatId,
                body
        );
        try {
            Response<JsonObject> result = res.execute();
            if (!result.isSuccessful()) {
                System.out.println(result.errorBody().string());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static RestClientService getClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://service.narvii.com/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(RestClientService.class);
    }
}
