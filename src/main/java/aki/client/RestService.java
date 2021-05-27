package aki.client;

import aki.pojo.response.link_info.LinkInfo;
import com.google.gson.JsonObject;
import java.util.Map;
import aki.pojo.requests.LoginBody;
import aki.pojo.requests.SendMessageBody;
import aki.pojo.response.account.AccountData;
import aki.pojo.response.ndc_account.NdcAccount;
import aki.pojo.response.sub_clients.CommunitiesData;
import aki.pojo.response.thread_list.ThreadList;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

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
}