package amino.models.response.account;

import amino.models.response.account.AdvancedSettings;
import amino.models.response.account.Extensions;
import com.google.gson.annotations.SerializedName;

public class Account {
    @SerializedName(value="googleID")
    private Object googleID;
    @SerializedName(value="modifiedTime")
    private String modifiedTime;
    @SerializedName(value="role")
    private int role;
    @SerializedName(value="aminoIdEditable")
    private boolean aminoIdEditable;
    @SerializedName(value="facebookID")
    private Object facebookID;
    @SerializedName(value="icon")
    private String icon;
    @SerializedName(value="emailActivation")
    private int emailActivation;
    @SerializedName(value="membership")
    private Object membership;
    @SerializedName(value="appleID")
    private Object appleID;
    @SerializedName(value="twitterID")
    private Object twitterID;
    @SerializedName(value="aminoId")
    private String aminoId;
    @SerializedName(value="securityLevel")
    private int securityLevel;
    @SerializedName(value="uid")
    private String uid;
    @SerializedName(value="extensions")
    private Extensions extensions;
    @SerializedName(value="mediaList")
    private Object mediaList;
    @SerializedName(value="phoneNumber")
    private String phoneNumber;
    @SerializedName(value="phoneNumberActivation")
    private int phoneNumberActivation;
    @SerializedName(value="advancedSettings")
    private AdvancedSettings advancedSettings;
    @SerializedName(value="nickname")
    private String nickname;
    @SerializedName(value="createdTime")
    private String createdTime;
    @SerializedName(value="activation")
    private int activation;
    @SerializedName(value="email")
    private String email;
    @SerializedName(value="username")
    private Object username;
    @SerializedName(value="status")
    private int status;

    public Object getGoogleID() {
        return this.googleID;
    }

    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public int getRole() {
        return this.role;
    }

    public boolean isAminoIdEditable() {
        return this.aminoIdEditable;
    }

    public Object getFacebookID() {
        return this.facebookID;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getEmailActivation() {
        return this.emailActivation;
    }

    public Object getMembership() {
        return this.membership;
    }

    public Object getAppleID() {
        return this.appleID;
    }

    public Object getTwitterID() {
        return this.twitterID;
    }

    public String getAminoId() {
        return this.aminoId;
    }

    public int getSecurityLevel() {
        return this.securityLevel;
    }

    public String getUid() {
        return this.uid;
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public Object getMediaList() {
        return this.mediaList;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getPhoneNumberActivation() {
        return this.phoneNumberActivation;
    }

    public AdvancedSettings getAdvancedSettings() {
        return this.advancedSettings;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public int getActivation() {
        return this.activation;
    }

    public String getEmail() {
        return this.email;
    }

    public Object getUsername() {
        return this.username;
    }

    public int getStatus() {
        return this.status;
    }
}

