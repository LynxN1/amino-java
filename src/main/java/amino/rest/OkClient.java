package amino.rest;

import okhttp3.Request;

import java.io.IOException;

public class OkClient {
    private static final okhttp3.OkHttpClient okClient = new okhttp3.OkHttpClient();

    public static okhttp3.Response getOkCall(Request request) throws IOException {
        return okClient.newCall(request).execute();
    }
}
