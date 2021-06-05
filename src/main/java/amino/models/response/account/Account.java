package amino.models.response.account;

import com.google.gson.annotations.SerializedName;

public class Account {

  @SerializedName("googleID")
  private Object googleID;

  @SerializedName("modifiedTime")
  private String modifiedTime;

  @SerializedName("role")
  private int role;

  @SerializedName("aminoIdEditable")
  private boolean aminoIdEditable;

  @SerializedName("facebookID")
  private Object facebookID;

  @SerializedName("icon")
  private String icon;

  @SerializedName("emailActivation")
  private int emailActivation;

  @SerializedName("membership")
  private Object membership;

  @SerializedName("appleID")
  private Object appleID;

  @SerializedName("twitterID")
  private Object twitterID;

  @SerializedName("aminoId")
  private String aminoId;

  @SerializedName("securityLevel")
  private int securityLevel;

  @SerializedName("uid")
  private String uid;

  @SerializedName("extensions")
  private Extensions extensions;

  @SerializedName("mediaList")
  private Object mediaList;

  @SerializedName("phoneNumber")
  private String phoneNumber;

  @SerializedName("phoneNumberActivation")
  private int phoneNumberActivation;

  @SerializedName("advancedSettings")
  private AdvancedSettings advancedSettings;

  @SerializedName("nickname")
  private String nickname;

  @SerializedName("createdTime")
  private String createdTime;

  @SerializedName("activation")
  private int activation;

  @SerializedName("email")
  private String email;

  @SerializedName("username")
  private Object username;

  @SerializedName("status")
  private int status;

  public Object getGoogleID() {
    return googleID;
  }

  public String getModifiedTime() {
    return modifiedTime;
  }

  public int getRole() {
    return role;
  }

  public boolean isAminoIdEditable() {
    return aminoIdEditable;
  }

  public Object getFacebookID() {
    return facebookID;
  }

  public String getIcon() {
    return icon;
  }

  public int getEmailActivation() {
    return emailActivation;
  }

  public Object getMembership() {
    return membership;
  }

  public Object getAppleID() {
    return appleID;
  }

  public Object getTwitterID() {
    return twitterID;
  }

  public String getAminoId() {
    return aminoId;
  }

  public int getSecurityLevel() {
    return securityLevel;
  }

  public String getUid() {
    return uid;
  }

  public Extensions getExtensions() {
    return extensions;
  }

  public Object getMediaList() {
    return mediaList;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public int getPhoneNumberActivation() {
    return phoneNumberActivation;
  }

  public AdvancedSettings getAdvancedSettings() {
    return advancedSettings;
  }

  public String getNickname() {
    return nickname;
  }

  public String getCreatedTime() {
    return createdTime;
  }

  public int getActivation() {
    return activation;
  }

  public String getEmail() {
    return email;
  }

  public Object getUsername() {
    return username;
  }

  public int getStatus() {
    return status;
  }
}