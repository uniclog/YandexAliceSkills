package local.uniclog.workcalendar;

public class Response {
    private String version = "1.0";
    private ResponseBody response;

    public Response(String answer) {
        this.response = new ResponseBody(200, String.format("%s", answer));
    }

    private static class ResponseBody {
        Boolean end_session;
        String tts;
        String text;
        int statusCode;

        public ResponseBody(int statusCode, String tts) {
            this.statusCode = statusCode;
            this.tts = tts;
            this.text = tts;
            this.end_session = true;
        }
    }
}
