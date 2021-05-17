package client;

import com.google.gson.JsonObject;
import java.util.Map;
import pojo.requests.LoginBody;
import pojo.requests.SendMessageBody;
import pojo.response.account.AccountData;
import pojo.response.ndc_account.NdcAccount;
import pojo.response.sub_clients.CommunitiesData;
import pojo.response.thread_list.ThreadList;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RestClientService {

  @POST("g/s/auth/login")
  Call<AccountData> getAccountData(@HeaderMap Map<String, String> headers, @Body LoginBody body);

  @GET("g/s/community/joined")
  Call<CommunitiesData> getSubClients(@HeaderMap Map<String, String> headers,
      @Query("start") int start, @Query("size") int size);

  @GET("x{comId}/s/user-profile/{userId}")
  Call<NdcAccount> ndcAccountData(@HeaderMap Map<String, String> headers,
      @Path("comId") String comId, @Path("userId") String userId);

  @GET("x{comId}/s/chat/thread")
  Call<ThreadList> ndcChatThreads(@HeaderMap Map<String, String> headers,
      @Path("comId") String comId, @Query("type") String type, @Query("start") int start,
      @Query("size") int size);

  @POST("x{comId}/s/chat/thread/{chatId}/message")
  Call<JsonObject> sendMessage(@HeaderMap Map<String, String> headers, @Path("comId") String comId,
      @Path("chatId") String chatId, @Body SendMessageBody body);
}