package amino.exceptions;

import amino.models.response.error_body.ErrorBody;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Reader;
import java.lang.reflect.Type;

public class Exceptions {
    private final ErrorBody errorResponse;

    public Exceptions(Reader errorMessage) {
        Type type = new TypeToken<ErrorBody>(){}.getType();
        Gson gson = new Gson();
        this.errorResponse = gson.fromJson(errorMessage, type);
    }

    public void checkException() throws Exception {
        switch (this.errorResponse.getApiStatusCode()) {
            case 110: {
                throw new ActionNotAllowed(errorResponse.getApiMessage());
            }
            case 200: {
                throw new IncorrectPassword(errorResponse.getApiMessage());
            }
            case 213: {
                throw new InvalidEmail(errorResponse.getApiMessage());
            }
            case 214: {
                throw new InvalidPassword(errorResponse.getApiMessage());
            }
            case 218: {
                throw new DeviceNotSupported(errorResponse.getApiMessage());
            }
            case 230: {
                throw new NotMemberOfCommunity(errorResponse.getApiMessage());
            }
        }
        throw new Exception(errorResponse.getApiMessage());
    }
}