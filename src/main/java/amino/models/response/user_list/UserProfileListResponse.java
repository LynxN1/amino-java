package amino.models.response.user_list;

import amino.models.response.ndc_account.UserProfile;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class UserProfileListResponse {
    @SerializedName(value="userProfileCount")
    private int userProfileCount;
    @SerializedName(value="userProfileList")
    private List<UserProfile> userProfileList;

    public int getUserProfileCount() {
        return this.userProfileCount;
    }

    public List<UserProfile> getUserProfileList() {
        return this.userProfileList;
    }
}

