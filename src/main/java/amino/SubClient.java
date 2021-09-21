package amino;

import amino.exceptions.Exceptions;
import amino.models.requests.*;
import amino.models.response.blog_list.BlogList;
import amino.models.response.bubble_list.BubbleListResponse;
import amino.models.response.message_list.MessageListResponse;
import amino.models.response.ndc_account.NdcAccount;
import amino.models.response.template_list.TemplateResponse;
import amino.models.response.thread_list.ThreadList;
import amino.models.response.user_list.UserProfileListResponse;
import amino.utils.HashingUtility;
import amino.utils.TimeUtils;
import com.google.gson.JsonObject;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Response;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.zip.ZipInputStream;

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
        if (!ndcAccountResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(ndcAccountResponse.errorBody()).charStream()).checkException();
            return ndcAccountResponse.body();
        }
        return ndcAccountResponse.body();
    }

    public ThreadList getMyChatThreads(int start, int size) throws Exception {
        Call<ThreadList> res = client.retrofit.getChatThreads(client.headers.getHeaders(), comId, "joined-me", start, size);
        Response<ThreadList> threadListResponse = res.execute();
        if (!threadListResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(threadListResponse.errorBody()).charStream()).checkException();
            return threadListResponse.body();
        }
        return threadListResponse.body();
    }

    public ThreadList getPublicChatThreads(String filterType, int start, int size) throws Exception {
        Call<ThreadList> res = client.retrofit.getChatThreads(client.headers.getHeaders(), comId, "public-all", filterType, start, size);
        Response<ThreadList> threadListResponse = res.execute();
        if (!threadListResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(threadListResponse.errorBody()).charStream()).checkException();
            return threadListResponse.body();
        }
        return threadListResponse.body();
    }

    public void sendMessage(String message, String chatId) throws Exception {
        var body = new SendMessageBody();
        body.setContent(message);
        body.setType(0);
        Call<JsonObject> res = client.retrofit.sendMessage(client.headers.getHeaders(client.gson.toJson(body)), comId, chatId, body);
        Response<JsonObject> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
    }

    public void sendMessage(String message, String chatId, Integer type, Extensions mentions) throws Exception {
        var body = new SendMessageBody();
        body.setContent(message);
        body.setType(type);
        body.setExtensions(mentions);
        Call<JsonObject> res = client.retrofit.sendMessage(client.headers.getHeaders(client.gson.toJson(body)), comId, chatId, body);
        Response<JsonObject> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
    }

    public MessageListResponse startChat(List<String> userId, String message, String title, String content) throws Exception {
        var body = new StartChatBody();
        body.setInviteeUids(userId);
        body.setType(0);
        body.setPublishToGlobal(0);
        body.setInitialMessageContent(message);
        body.setTitle(title);
        body.setContent(content);
        Call<MessageListResponse> res = client.retrofit.startChat(client.headers.getHeaders(client.gson.toJson(body)), comId, body);
        Response<MessageListResponse> messageListResponse = res.execute();
        if (!messageListResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(messageListResponse.errorBody()).charStream()).checkException();
        }
        return messageListResponse.body();
    }

    public UserProfileListResponse getOnlineUsers(Integer start, Integer size) throws Exception {
        Call<UserProfileListResponse> res = client.retrofit.getOnlineUsers(client.headers.getHeaders(), comId, "ndtopic:x" + getComId() + ":online-members", start, size);
        Response<UserProfileListResponse> userProfileListResponse = res.execute();
        if (!userProfileListResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(userProfileListResponse.errorBody()).charStream()).checkException();
        }
        return userProfileListResponse.body();
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
        var body = new SendCoinsBody();
        body.setCoins(coins);
        Call<JsonObject> res = client.retrofit.sendCoins(client.headers.getHeaders(client.gson.toJson(body)), comId, blogId, body);
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

    public BlogList getUserBlogs(String userId, Integer start, Integer size) throws Exception {
        Call<BlogList> res = client.retrofit.getUserBlogs(client.headers.getHeaders(), comId, "user", userId, start, size);
        Response<BlogList> userBlogs = res.execute();
        if (!userBlogs.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(userBlogs.errorBody()).charStream()).checkException();
        }
        return userBlogs.body();
    }

    public void subscribe(String userId) throws Exception {
        var body = new SubscribeBody();
        var paymentContext = new PaymentContext();
        paymentContext.setIsAutoRenew(true);
        body.setPaymentContext(paymentContext);
        Call<JsonObject> res = client.retrofit.subscribe(client.headers.getHeaders(client.gson.toJson(body)), comId, userId, body);
        Response<JsonObject> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
    }

    public void inviteToChat(String userId, String chatId) throws Exception {
        Call<JsonObject> res = client.retrofit.inviteToChat(client.headers.getHeaders(), comId, chatId, userId);
        Response<JsonObject> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
    }

    public MessageListResponse getChatMessages(String chatId, int size) throws Exception {
        Call<MessageListResponse> res = client.retrofit.getChatMessages(client.headers.getHeaders(), comId, chatId, 2, "t", null, size);
        Response<MessageListResponse> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
        return jsonObjectResponse.body();
    }

    public MessageListResponse getChatMessages(String chatId, String pageToken, int size) throws Exception {
        Call<MessageListResponse> res = client.retrofit.getChatMessages(client.headers.getHeaders(), comId, chatId, 2, "t", pageToken, size);
        Response<MessageListResponse> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
        return jsonObjectResponse.body();
    }

    public void deleteMessage(String chatId, String messageId) throws Exception {
        Call<JsonObject> res = client.retrofit.deleteMessage(client.headers.getHeaders(), comId, chatId, messageId);
        Response<JsonObject> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
    }

    public BubbleListResponse getMyBubbles(Integer start, Integer size) throws Exception {
        Call<BubbleListResponse> res = client.retrofit.getBubbles(client.headers.getHeaders(), comId, "all-my-bubbles", start, size);
        Response<BubbleListResponse> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
        return jsonObjectResponse.body();
    }

    public TemplateResponse getTemplates() throws Exception {
        Call<TemplateResponse> res = client.retrofit.getTemplates(client.headers.getHeaders(), comId);
        Response<TemplateResponse> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
        return jsonObjectResponse.body();
    }

    public void changeBubble(String templateId, String bubbleId, String name, String imgName, String coverImgUrl, String prevImgUrl, String color, String linkColor) throws Exception {
        String jsonConfig = new JSONObject()
                .put("template_id", templateId)
                .put("contentInsets", List.of(6666666, 6666666, 6666666, 6666666))
                .put("coverImage", coverImgUrl)
                .put("id", bubbleId)
                .put("name", name)
                .put("previewBackgroundUrl", prevImgUrl)
                .put("slots", List.of())
                .put("version", 1)
                .put("vertexInset", 0)
                .put("bubbleType", 1)
                .put("zoomPoint", List.of(6666666, 6666666))
                .put("authors", "ᴀᴋɪɴᴀᴛᴀ#7096")
                .put("info", "https://t.me/amino_dev0")
                .put("backgroundPath", imgName)
                .put("color", color)
                .put("linkColor", linkColor)
                .put("allowedSlots", List.of(
                        new JSONObject().put("align", 1).put("x", 5).put("y", -5),
                        new JSONObject().put("align", 4).put("x", -30).put("y", 5),
                        new JSONObject().put("align", 3).put("x", 5).put("y", 5)
                ))
                .toString();
        ZipInputStream zin = new ZipInputStream(new FileInputStream("config.zip"));
        System.out.println(Arrays.toString(zin.readAllBytes()));
        Call<JsonObject> res = client.retrofit.changeBubble(client.headers.getHeaders(), comId, bubbleId, "");
        Response<JsonObject> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
    }

    public JsonObject sendActiveObject() throws Exception {
        var body = new SendActiveBody();
        var chunkList = new ArrayList<UserActiveTimeChunkList>();
        var userActiveTimeChunkList = new UserActiveTimeChunkList();
        userActiveTimeChunkList.setStart(TimeUtils.unixInstant());
        userActiveTimeChunkList.setEnd(TimeUtils.unixInstant() + 300);
        chunkList.add(userActiveTimeChunkList);
        body.setUserActiveTimeChunkList(chunkList);
        Call<JsonObject> res = client.retrofit.sendActiveObject(client.headers.getHeaders(client.gson.toJson(body)), comId, body);
        Response<JsonObject> jsonObjectResponse = res.execute();
        if (!jsonObjectResponse.isSuccessful()) {
            new Exceptions(Objects.requireNonNull(jsonObjectResponse.errorBody()).charStream()).checkException();
        }
        return jsonObjectResponse.body();
    }
}
