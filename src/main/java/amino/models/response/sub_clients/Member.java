package amino.models.response.sub_clients;

import com.google.gson.annotations.SerializedName;

public class Member {
    @SerializedName(value="userProfile")
    private UserProfile userProfile;

    public UserProfile getUserProfile() {
        return this.userProfile;
    }
}

