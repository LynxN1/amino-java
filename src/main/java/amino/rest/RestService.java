package amino.rest;

import amino.models.requests.CheckInBody;
import amino.models.requests.LoginBody;
import amino.models.requests.PlayLotteryBody;
import amino.models.requests.SendCoinsBody;
import amino.models.requests.SendMessageBody;
import amino.models.requests.StartChatBody;
import amino.models.response.account.AccountData;
import amino.models.response.link_info.LinkInfoResponse;
import amino.models.response.message_list.MessageListResponse;
import amino.models.response.ndc_account.NdcAccount;
import amino.models.response.sub_clients.CommunitiesData;
import amino.models.response.thread_list.ThreadList;
import amino.models.response.user_list.UserProfileListResponse;
import com.google.gson.JsonObject;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RestService {
  @POST("g/s/auth/login")
  Call<AccountData> auth(
          @HeaderMap Map<String, String> var1,
          @Body LoginBody var2
  );

  @GET("g/s/community/joined")
  Call<CommunitiesData> getSubClients(
          @HeaderMap Map<String, String> var1,
          @Query("start") int var2,
          @Query("size") int var3
  );

  @GET("g/s/link-resolution")
  Call<LinkInfoResponse> getFromCode(
          @HeaderMap Map<String, String> var1,
          @Query("q") String var2
  );

  @GET("x{comId}/s/user-profile/{userId}")
  Call<NdcAccount> getAccountData(
          @HeaderMap Map<String, String> var1,
          @Path("comId") String var2,
          @Path("userId") String var3
  );

  @GET("x{comId}/s/chat/thread")
  Call<ThreadList> getChatThreads(
          @HeaderMap Map<String, String> var1,
          @Path("comId") String var2,
          @Query("type") String var3,
          @Query("start") int var4,
          @Query("size") int var5
  );

  @POST("x{comId}/s/chat/thread/{chatId}/message")
  Call<JsonObject> sendMessage(
          @HeaderMap Map<String, String> var1,
          @Path("comId") String var2,
          @Path("chatId") String var3,
          @Body SendMessageBody var4
  );

  @POST("x{comId}/s/check-in")
  Call<JsonObject> checkIn(
          @HeaderMap Map<String, String> var1,
          @Path("comId") String var2,
          @Body CheckInBody var3
  );

  @POST("x{comId}/s/check-in/lottery")
  Call<JsonObject> playLottery(
          @HeaderMap Map<String, String> var1,
          @Path("comId") String var2,
          @Body PlayLotteryBody var3
  );

  @POST("x{comId}/s/blog/{blogId}/tipping")
  Call<JsonObject> sendCoins(
          @HeaderMap Map<String, String> var1,
          @Path("comId") String var2,
          @Path("blogId") String var3,
          @Body SendCoinsBody var4
  );

  @POST("x{comId}/s/chat/thread/{chatId}/member/{userId}")
  Call<JsonObject> joinChat(
          @HeaderMap Map<String, String> var1,
          @Path("comId") String var2,
          @Path("chatId") String var3,
          @Path("userId") String var4
  );

  @POST("x{comId}/s/chat/thread")
  Call<MessageListResponse> startChat(
          @HeaderMap Map<String, String> var1,
          @Path("comId") String var2,
          @Body StartChatBody var3
  );

  @DELETE("x{comId}/s/chat/thread/{chatId}/member/{userId}")
  Call<JsonObject> leaveChat(
          @HeaderMap Map<String, String> var1,
          @Path("comId") String var2,
          @Path("chatId") String var3,
          @Path("userId") String var4
  );

  @GET("x{comId}/s/live-layer?topic=ndtopic:x{comId}:online-members&start={start}&size={size}")
  Call<UserProfileListResponse> getOnlineUsers(
          @HeaderMap Map<String, String> var1,
          @Path("comId") String var2,
          @Path("start") Integer var3,
          @Path("size") Integer var4
  );
}
