package amino.exceptions;

public class NotMemberOfCommunity extends Exception {
    public NotMemberOfCommunity(String errorMessage) {
        super(errorMessage);
    }
}
