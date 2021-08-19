package amino;

import amino.exceptions.Exceptions;
import amino.models.requests.*;
import amino.models.response.message_list.MessageListResponse;
import amino.models.response.ndc_account.NdcAccount;
import amino.models.response.thread_list.ThreadList;
import amino.models.response.user_list.UserProfileListResponse;
import com.google.gson.JsonObject;
import retrofit2.Call;
import retrofit2.Response;

import java.util.Objects;

public class SubClient {
    private final String comId;
    private final Client client;

    public SubClient(String comId, Client client) {
        this.comId = comId;
        this.client = client;
    }

    public String getComId() {
        return comId;
    }

    public NdcAccount getUserInfo(String userId) throws Exception {
        Call<NdcAccount> res = client.retrofit.getAccountData(client.headers.getHeaders(), comId, userId);
        Response<NdcAccount> ndcAccountResponse = res.execute();
        if (ndcAccountResponse.isSuccessful()) {
            return ndcAccountResponse.body();
        }
        new Exceptions(Objects.requireNonNull(ndcAccountResponse.errorBody()).charStream()).checkException();
        return null;
    }

    public ThreadList getChatThreads(String type, int start, int size) throws Exception {
        Call<ThreadList> res = client.retrofit.getChatThreads(client.headers.getHeaders(), comId, type, start, size);
        Response<ThreadList> threadListResponse = res.execute();
        if (threadListResponse.isSuccessful()) {
            return threadListResponse.body();
        }
        new Exceptions(Objects.requireNonNull(threadListResponse.errorBody()).charStream()).checkException();
        return null;
    }

    public void sendMessage(String message, String chatId) throws Exception {
        SendMessageBody body = new SendMessageBody().type(0).content(message);
        Call<JsonObject> res = client.retrofit.sendMessage(client.headers.getHeaders(), comId, chatId, body);
        Response<JsonObject> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
    }

    public MessageListResponse startChat(String userId) throws Exception {
        StartChatBody body = new StartChatBody().inviteeUids(userId);
        Call<MessageListResponse> res = client.retrofit.startChat(client.headers.getHeaders(), comId, body);
        Response<MessageListResponse> messageListResponse = res.execute();
        if (messageListResponse.isSuccessful()) {
            return messageListResponse.body();
        }
        new Exceptions(Objects.requireNonNull(messageListResponse.errorBody()).charStream()).checkException();
        return null;
    }

    public UserProfileListResponse getOnlineUsers(Integer start, Integer size) throws Exception {
        Call<UserProfileListResponse> res = client.retrofit.getOnlineUsers(client.headers.getHeaders(), comId, start, size);
        Response<UserProfileListResponse> userProfileListResponse = res.execute();
        if (userProfileListResponse.isSuccessful()) {
            return userProfileListResponse.body();
        }
        new Exceptions(Objects.requireNonNull(userProfileListResponse.errorBody()).charStream()).checkException();
        return null;
    }

    public void sendMessage(String message, String chatId, Integer type) throws Exception {
        Call<JsonObject> res = client.retrofit.sendMessage(client.headers.getHeaders(), comId, chatId, new SendMessageBody().type(type).content(message));
        Response<JsonObject> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
    }

    public void checkIn() throws Exception {
        Call<JsonObject> res = client.retrofit.checkIn(client.headers.getHeaders(), comId, new CheckInBody());
        Response<JsonObject> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
    }

    public void playLottery() throws Exception {
        Call<JsonObject> res = client.retrofit.playLottery(client.headers.getHeaders(), comId, new PlayLotteryBody());
        Response<JsonObject> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
    }

    public void sendCoins(Integer coins, String blogId) throws Exception {
        Call<JsonObject> res = client.retrofit.sendCoins(client.headers.getHeaders(), comId, blogId, new SendCoinsBody().coins(coins));
        Response<JsonObject> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
    }

    public void joinChat(String chatId) throws Exception {
        Call<JsonObject> res = client.retrofit.joinChat(client.headers.getHeaders(), comId, chatId, client.headers.AUID);
        Response<JsonObject> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
    }

    public void leaveChat(String chatId) throws Exception {
        Call<JsonObject> res = client.retrofit.leaveChat(client.headers.getHeaders(), comId, chatId, client.headers.AUID);
        Response<JsonObject> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
    }
}

