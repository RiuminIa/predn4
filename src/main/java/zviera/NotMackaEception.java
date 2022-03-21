package zviera;

public class NotMackaEception extends Exception{
    public NotMackaEception() {
    }

    public NotMackaEception(String message) {
        super(message);
    }

    public NotMackaEception(String message, Throwable cause) {
        super(message, cause);
    }

    public NotMackaEception(Throwable cause) {
        super(cause);
    }
}
