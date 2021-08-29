package amino.models.requests;

import com.google.gson.annotations.SerializedName;

public class LoginAminoappsBody{

	@SerializedName("recaptcha_challenge")
	private String recaptchaChallenge;

	@SerializedName("recaptcha_version")
	private String recaptchaVersion = "v3";

	@SerializedName("auth_type")
	private int authType = 0;

	@SerializedName("secret")
	private String secret;

	@SerializedName("email")
	private String email;

	public void setRecaptchaChallenge(String recaptchaChallenge){
		this.recaptchaChallenge = recaptchaChallenge;
	}

	public void setSecret(String secret){
		this.secret = secret;
	}

	public void setEmail(String email){
		this.email = email;
	}
}