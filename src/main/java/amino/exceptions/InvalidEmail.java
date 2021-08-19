package amino.exceptions;

public class InvalidEmail
        extends Exception {
    public InvalidEmail(String errorMessage) {
        super(errorMessage);
    }
}
