package pojo.requests;

public class LoginBody {

  public String email;
  public int v;
  public String secret;
  public String deviceID;
  public int clientType;
  public String action;
  public int timestamp;

  public LoginBody email(String email) {
    this.email = email;
    return this;
  }

  public LoginBody v(int v) {
    this.v = v;
    return this;
  }

  public LoginBody secret(String secret) {
    this.secret = "0 " + secret;
    return this;
  }

  public LoginBody deviceId(String deviceId) {
    this.deviceID = deviceId;
    return this;
  }

  public LoginBody clientType(int clientType) {
    this.clientType = clientType;
    return this;
  }

  public LoginBody action(String action) {
    this.action = action;
    return this;
  }

  public LoginBody timestamp(int timestamp) {
    this.timestamp = timestamp;
    return this;
  }
}