package local.uniclog.pw;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HandlerTest {
    @Test
    void prepareAnswerTomorrow() {
        var request = new Request();
        request.request = new HashMap<>();
        request.request.put("command", "завтра");
        var response = new Handler().apply(request);
        assertTrue(response.getResponseText().contains("завтра ежа"));
    }

    @Test
    void prepareAnswerDate() {
        var request = new Request();
        request.request = new HashMap<>();
        request.request.put("command", "22 текст");
        var response = new Handler().apply(request);
        assertTrue(response.getResponseText().contains("двадцатьвторого"));
    }

}