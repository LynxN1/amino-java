package amino.models.response.event_log;

import com.google.gson.annotations.SerializedName;

public class ParticipatedExperiments{

	@SerializedName("userVectorCommunitySimilarityChannel")
	private int userVectorCommunitySimilarityChannel;

	@SerializedName("ruCommunitySearchExp")
	private int ruCommunitySearchExp;

	@SerializedName("chatMembersCommonChannel")
	private int chatMembersCommonChannel;

	@SerializedName("landingOptionExp")
	private int landingOptionExp;

	@SerializedName("communityTabExp")
	private int communityTabExp;

	@SerializedName("communityMembersCommonChannel")
	private int communityMembersCommonChannel;

	public int getUserVectorCommunitySimilarityChannel(){
		return userVectorCommunitySimilarityChannel;
	}

	public int getRuCommunitySearchExp(){
		return ruCommunitySearchExp;
	}

	public int getChatMembersCommonChannel(){
		return chatMembersCommonChannel;
	}

	public int getLandingOptionExp(){
		return landingOptionExp;
	}

	public int getCommunityTabExp(){
		return communityTabExp;
	}

	public int getCommunityMembersCommonChannel(){
		return communityMembersCommonChannel;
	}
}