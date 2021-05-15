package client;

import pojo.requests.LoginBody;
import pojo.response.account.AccountData;
import pojo.response.sub_clients.CommunitiesData;
import retrofit2.Call;
import retrofit2.http.*;

public interface RestService {
    @Headers({
            "Accept-Language: ru-UA",
    })
    @POST("g/s/auth/login")
    Call<AccountData> getAccountData(@Header("NDCDEVICEID") String deviceId, @Body LoginBody body);

    @Headers({
            "Accept-Language: ru-UA",
    })
    @GET("g/s/community/joined")
    Call<CommunitiesData> getSubClients(@Header("NDCDEVICEID") String deviceId, @Header("NDCAUTH") String SID, @Query("start") int start, @Query("size") int size);
}