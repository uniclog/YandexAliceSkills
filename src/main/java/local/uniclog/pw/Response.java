package local.uniclog.pw;

public class Response {
    private String version = "1.0";
    private ResponseBody response;

    public Response(String answer) {
        this.response = new ResponseBody(200, String.format("%s", answer));
    }

    public String getResponseText() {
        return response.text;
    }

    private static class ResponseBody {
        Boolean end_session;
        String tts;
        String text;
        int statusCode;

        public ResponseBody(int statusCode, String tts) {
            this.statusCode = statusCode;
            this.tts = tts;
            this.text = tts.replace("+", "");
            this.end_session = true;
        }
    }
}
