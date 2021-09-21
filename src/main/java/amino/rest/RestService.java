package amino.rest;

import amino.models.requests.*;
import amino.models.response.account.AccountData;
import amino.models.response.blog_list.BlogList;
import amino.models.response.bubble_list.BubbleListResponse;
import amino.models.response.event_log.EventLogResponse;
import amino.models.response.link_info.LinkInfoResponse;
import amino.models.response.message_list.MessageListResponse;
import amino.models.response.ndc_account.NdcAccount;
import amino.models.response.sub_clients.CommunitiesData;
import amino.models.response.template_list.TemplateResponse;
import amino.models.response.thread_list.ThreadList;
import amino.models.response.user_list.UserProfileListResponse;
import amino.models.response.wallet.WalletResponse;
import com.google.gson.JsonObject;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface RestService {
  @POST("g/s/auth/login")
  Call<AccountData> auth(
          @HeaderMap Map<String, String> headers,
          @Body LoginBody body
  );

  @POST("g/s/auth/request-security-validation")
  Call<JsonObject> requestValidationCode(
          @HeaderMap Map<String, String> headers,
          @Body RequestValidationCodeBody body
  );

  @POST("g/s/auth/register-check")
  Call<JsonObject> registerCheck(
          @HeaderMap Map<String, String> headers,
          @Body RegisterCheckBody body
  );

  @GET("g/s/eventlog/profile")
  Call<EventLogResponse> eventLog(
          @HeaderMap Map<String, String> headers,
          @Query("language") String language
  );

  @POST("g/s/auth/register")
  Call<JsonObject> register(
          @HeaderMap Map<String, String> headers,
          @Body RegisterBody body
  );

  @GET("g/s/community/joined")
  Call<CommunitiesData> getSubClients(
          @HeaderMap Map<String, String> headers,
          @Query("start") int start,
          @Query("size") int size
  );

  @GET("g/s/link-resolution")
  Call<LinkInfoResponse> getFromCode(
          @HeaderMap Map<String, String> headers,
          @Query("q") String q
  );

  @GET("g/s/wallet")
  Call<WalletResponse> getWalletInfo(
          @HeaderMap Map<String, String> headers
  );

  @POST("g/s/device")
  Call<JsonObject> checkDevice(
          @HeaderMap Map<String, String> headers,
          @Body CheckDeviceBody body
  );

  @POST("x{comId}/s/community/join")
  Call<JsonObject> joinCommunity(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Body JoinCommunityBody body
  );

  @GET("x{comId}/s/user-profile/{userId}")
  Call<NdcAccount> getAccountData(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Path("userId") String userId
  );

  @GET("x{comId}/s/chat/thread")
  // x{comId}/s/chat/thread?type=public-all&start={start}&size={size}
  Call<ThreadList> getChatThreads(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Query("type") String type,
          @Query("start") int start,
          @Query("size") int size
  );

  @GET("x{comId}/s/chat/thread")
  // x{comId}/s/chat/thread?type=public-all&filterType={type}&start={start}&size={size}
  Call<ThreadList> getChatThreads(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Query("type") String type,
          @Query("filterType") String filterType,
          @Query("start") int start,
          @Query("size") int size
  );

  @POST("x{comId}/s/chat/thread/{chatId}/message")
  Call<JsonObject> sendMessage(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Path("chatId") String chatId,
          @Body SendMessageBody body
  );

  @POST("x{comId}/s/check-in")
  Call<JsonObject> checkIn(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Body CheckInBody body
  );

  @POST("x{comId}/s/check-in/lottery")
  Call<JsonObject> playLottery(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Body PlayLotteryBody body
  );

  @POST("x{comId}/s/blog/{blogId}/tipping")
  Call<JsonObject> sendCoins(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Path("blogId") String blogId,
          @Body SendCoinsBody body
  );

  @POST("x{comId}/s/chat/thread/{chatId}/member/{userId}")
  Call<JsonObject> joinChat(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Path("chatId") String chatId,
          @Path("userId") String userId
  );

  @POST("x{comId}/s/chat/thread")
  Call<MessageListResponse> startChat(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Body StartChatBody body
  );

  @DELETE("x{comId}/s/chat/thread/{chatId}/member/{userId}")
  Call<JsonObject> leaveChat(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Path("chatId") String chatId,
          @Path("userId") String userId
  );

  @GET("x{comId}/s/live-layer")
  // x{comId}/s/live-layer?topic=ndtopic:x{comId}:online-members&start={start}&size={size}
  Call<UserProfileListResponse> getOnlineUsers(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Query("topic") String topic,
          @Query("start") Integer start,
          @Query("size") Integer size
  );

  @GET("x{comId}/s/blog")
  // x{comId}/s/blog?type=user&q={userId}&start={start}&size={size}
  Call<BlogList> getUserBlogs(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Query("type") String type,
          @Query("q") String q,
          @Query("start") Integer start,
          @Query("size") Integer size
  );

  @POST("x{comId}/s/influencer/{userId}/subscribe")
  Call<JsonObject> subscribe(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Path("userId") String userId,
          @Body SubscribeBody body
  );

  @POST("g/s/auth/request-security-validation")
  Call<JsonObject> requestVerifyCode(
          @HeaderMap Map<String, String> headers,
          @Body RequestVerifyBody body
  );

  @POST("g/s/auth/check-security-validation")
  Call<JsonObject> verify(
          @HeaderMap Map<String, String> headers,
          @Body VerifyBody body
  );

  @POST("g/s/auth/activate-email")
  Call<JsonObject> activateAccount(
          @HeaderMap Map<String, String> headers,
          @Body ActivateAccountBody body
  );

  @POST("x{comId}/s/chat/thread/{chatId}/member/{userId}")
  Call<JsonObject> inviteToChat(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Path("chatId") String chatId,
          @Path("userId") String userId
  );

  @GET("x{comId}/s/chat/thread/{chatId}/message")
  Call<MessageListResponse> getChatMessages(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Path("chatId") String chatId,
          @Query("v") Integer v,
          @Query("pagingType") String pagingType,
          @Query("pageToken") String pageToken,
          @Query("size") Integer size
  );

  @GET("x{comId}/s/chat/chat-bubble")
  // x{comId}/s/chat/chat-bubble?type=all-my-bubbles&start={start}&size={size}
  Call<BubbleListResponse> getBubbles(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Query("type") String type,
          @Query("start") Integer start,
          @Query("size") Integer size
  );

  @POST("x{comId}/s/chat/chat-bubble/templates/{bubbleId}/generate")
  Call<JsonObject> changeBubble(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Path("bubbleId") String bubbleId,
          @Body String body
  );

  @GET("x{comId}/s/chat/chat-bubble/templates")
  Call<TemplateResponse> getTemplates(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId
  );

  @DELETE("x{comId}/s/chat/thread/{chatId}/message/{messageId}")
  Call<JsonObject> deleteMessage(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Path("chatId") String chatId,
          @Path("messageId") String messageId
  );

  @POST("x{comId}/s/community/stats/user-active-time")
  Call<JsonObject> sendActiveObject(
          @HeaderMap Map<String, String> headers,
          @Path("comId") String comId,
          @Body SendActiveBody body
  );
}
