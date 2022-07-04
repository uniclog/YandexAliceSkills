package local.uniclog.pw;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HandlerTest {
    @Test
    void prepareAnswerToday() {
        var request = new Request();
        request.request = new HashMap<>();
        request.request.put("command", "сегодня");
        var response = new Handler().apply(request);
        assertTrue(response.getResponseText().contains("сегодня"));
    }

    @Test
    void prepareAnswerTomorrow() {
        var request = new Request();
        request.request = new HashMap<>();
        request.request.put("command", "завтра");
        var response = new Handler().apply(request);
        assertTrue(response.getResponseText().contains("завтра"));
    }

    @Test
    void prepareAnswerDate() {
        var request = new Request();
        request.request = new HashMap<>();
        request.request.put("command", "22 текст");
        var response = new Handler().apply(request);
        assertTrue(response.getResponseText().contains("двадцать второго"));
    }

    @Test
    void prepareAnswerByDayOfWeek() {
        var request = new Request();
        request.request = new HashMap<>();
        request.request.put("command", "понед");
        var response = new Handler().apply(request);
        assertTrue(response.getResponseText().contains("понед"));
    }

}