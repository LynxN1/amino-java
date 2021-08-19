package amino.exceptions;

public class ActionNotAllowed
        extends Exception {
    public ActionNotAllowed(String errorMessage) {
        super(errorMessage);
    }
}

