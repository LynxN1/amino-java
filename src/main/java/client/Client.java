package client;

import pojo.requests.LoginBody;
import pojo.response.account.AccountData;
import pojo.response.sub_clients.CommunitiesData;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Client {
    static RestService client = getClient();
    public String SID;
    static String deviceId = "01C1B9B8A82A651FD387E19E2679823416C9A964166D74FDC5ECDC93651F9F9B4C8F5936B660DEE753";

    public AccountData login(String email, String password) {
        int unixTime = (int) (System.currentTimeMillis() / 1000);
        LoginBody body = new LoginBody();
        body.email = email;
        body.v = 2;
        body.secret = "0 " + password;
        body.deviceID = deviceId;
        body.clientType = 100;
        body.action = "normal";
        body.timestamp = unixTime;
        Call<AccountData> res = client.getAccountData(
                deviceId,
                body
        );
        try {
            Response<AccountData> accountData = res.execute();
            if (accountData.isSuccessful()) {
                return res.execute().body();
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
        Call<CommunitiesData> res = client.getSubClients(
                deviceId,
                "sid=" + SID,
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

    static RestService getClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://service.narvii.com/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(RestService.class);
    }
}
