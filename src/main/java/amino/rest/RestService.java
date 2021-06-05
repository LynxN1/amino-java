package amino.rest;

import amino.models.requests.*;
import amino.models.response.link_info.LinkInfo;
import com.google.gson.JsonObject;
import java.util.Map;

import amino.models.response.account.AccountData;
import amino.models.response.ndc_account.NdcAccount;
import amino.models.response.sub_clients.CommunitiesData;
import amino.models.response.thread_list.ThreadList;
import retrofit2.Call;
import retrofit2.http.*;

public interface RestService {

  @POST("g/s/auth/login")
  Call<AccountData> auth(@HeaderMap Map<String, String> headers, @Body LoginBody body);

  @GET("g/s/community/joined")
  Call<CommunitiesData> getSubClients(@HeaderMap Map<String, String> headers,
      @Query("start") int start, @Query("size") int size);

  @GET("g/s/link-resolution")
  Call<LinkInfo> getFromCode(@HeaderMap Map<String, String> headers, @Query("q") String code);

  @GET("x{comId}/s/user-profile/{userId}")
  Call<NdcAccount> getAccountData(@HeaderMap Map<String, String> headers,
                                  @Path("comId") String comId, @Path("userId") String userId);

  @GET("x{comId}/s/chat/thread")
  Call<ThreadList> getChatThreads(@HeaderMap Map<String, String> headers,
                                  @Path("comId") String comId, @Query("type") String type, @Query("start") int start,
                                  @Query("size") int size);

  @POST("x{comId}/s/chat/thread/{chatId}/message")
  Call<JsonObject> sendMessage(@HeaderMap Map<String, String> headers, @Path("comId") String comId,
                               @Path("chatId") String chatId, @Body SendMessageBody body);

  @POST("x{comId}/s/community/stats/user-active-time")
  Call<JsonObject> postActivity(@HeaderMap Map<String, String> headers, @Path("comId") String comId);

  @POST("x{comId}/s/check-in")
  Call<JsonObject> checkIn(@HeaderMap Map<String, String> headers, @Path("comId") String comId, @Body CheckInBody body);

  @POST("x{comId}/s/check-in/lottery")
  Call<JsonObject> playLottery(@HeaderMap Map<String, String> headers, @Path("comId") String comId,
                               @Body PlayLotteryBody body);

  @POST("x{comId}/s/blog/{blogId}/tipping")
  Call<JsonObject> sendCoins(@HeaderMap Map<String, String> headers, @Path("comId") String comId,
                               @Path("blogId") String blogId,
                               @Body SendCoinsBody body);

  @POST("x{comId}/s/chat/thread/{chatId}/member/{userId}")
  Call<JsonObject> joinChat(@HeaderMap Map<String, String> headers, @Path("comId") String comId,
                               @Path("chatId") String chatId,
                               @Path("userId") String userId);

  @DELETE("x{comId}/s/chat/thread/{chatId}/member/{userId}")
  Call<JsonObject> leaveChat(@HeaderMap Map<String, String> headers, @Path("comId") String comId,
                               @Path("chatId") String chatId,
                               @Path("userId") String userId);
}