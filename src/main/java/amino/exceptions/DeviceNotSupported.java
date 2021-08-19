package amino.exceptions;

public class DeviceNotSupported
        extends Exception {
    public DeviceNotSupported(String errorMessage) {
        super(errorMessage);
    }
}
