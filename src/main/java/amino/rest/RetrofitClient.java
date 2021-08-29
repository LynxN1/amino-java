package amino.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static RestService getRetrofit() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://service.narvii.com/api/v1/").addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit.create(RestService.class);
    }
}
