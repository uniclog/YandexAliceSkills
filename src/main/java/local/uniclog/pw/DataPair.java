package local.uniclog.pw;

public class DataPair {
    private final String event;
    private final String text;

    public DataPair(String event, String text) {
        this.event = event;
        this.text = text;
    }

    public String getEvent() {
        return event;
    }

    public String getText() {
        return text;
    }
}
