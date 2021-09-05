package amino.models.response.blog_list;

import com.google.gson.annotations.SerializedName;

public class BlogListItem{

	@SerializedName("modifiedTime")
	private String modifiedTime;

	@SerializedName("votesCount")
	private int votesCount;

	@SerializedName("keywords")
	private String keywords;

	@SerializedName("needHidden")
	private boolean needHidden;

	@SerializedName("title")
	private String title;

	@SerializedName("type")
	private int type;

	@SerializedName("totalPollVoteCount")
	private int totalPollVoteCount;

	@SerializedName("content")
	private String content;

	@SerializedName("ndcId")
	private int ndcId;

	@SerializedName("createdTime")
	private String createdTime;

	@SerializedName("viewCount")
	private int viewCount;

	@SerializedName("guestVotesCount")
	private int guestVotesCount;

	@SerializedName("votedValue")
	private int votedValue;

	@SerializedName("tipInfo")
	private TipInfo tipInfo;

	@SerializedName("author")
	private Author author;

	@SerializedName("widgetDisplayInterval")
	private Object widgetDisplayInterval;

	@SerializedName("globalCommentsCount")
	private int globalCommentsCount;

	@SerializedName("extensions")
	private Extensions extensions;

	@SerializedName("mediaList")
	private Object mediaList;

	@SerializedName("commentsCount")
	private int commentsCount;

	@SerializedName("globalVotedValue")
	private int globalVotedValue;

	@SerializedName("style")
	private int style;

	@SerializedName("contentRating")
	private int contentRating;

	@SerializedName("endTime")
	private Object endTime;

	@SerializedName("strategyInfo")
	private String strategyInfo;

	@SerializedName("totalQuizPlayCount")
	private int totalQuizPlayCount;

	@SerializedName("blogId")
	private String blogId;

	@SerializedName("globalVotesCount")
	private int globalVotesCount;

	@SerializedName("status")
	private int status;

	public String getModifiedTime(){
		return modifiedTime;
	}

	public int getVotesCount(){
		return votesCount;
	}

	public String getKeywords(){
		return keywords;
	}

	public boolean isNeedHidden(){
		return needHidden;
	}

	public String getTitle(){
		return title;
	}

	public int getType(){
		return type;
	}

	public int getTotalPollVoteCount(){
		return totalPollVoteCount;
	}

	public String getContent(){
		return content;
	}

	public int getNdcId(){
		return ndcId;
	}

	public String getCreatedTime(){
		return createdTime;
	}

	public int getViewCount(){
		return viewCount;
	}

	public int getGuestVotesCount(){
		return guestVotesCount;
	}

	public int getVotedValue(){
		return votedValue;
	}

	public TipInfo getTipInfo(){
		return tipInfo;
	}

	public Author getAuthor(){
		return author;
	}

	public Object getWidgetDisplayInterval(){
		return widgetDisplayInterval;
	}

	public int getGlobalCommentsCount(){
		return globalCommentsCount;
	}

	public Extensions getExtensions(){
		return extensions;
	}

	public Object getMediaList(){
		return mediaList;
	}

	public int getCommentsCount(){
		return commentsCount;
	}

	public int getGlobalVotedValue(){
		return globalVotedValue;
	}

	public int getStyle(){
		return style;
	}

	public int getContentRating(){
		return contentRating;
	}

	public Object getEndTime(){
		return endTime;
	}

	public String getStrategyInfo(){
		return strategyInfo;
	}

	public int getTotalQuizPlayCount(){
		return totalQuizPlayCount;
	}

	public String getBlogId(){
		return blogId;
	}

	public int getGlobalVotesCount(){
		return globalVotesCount;
	}

	public int getStatus(){
		return status;
	}
}