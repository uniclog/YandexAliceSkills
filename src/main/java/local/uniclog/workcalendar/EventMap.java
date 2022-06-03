package local.uniclog.workcalendar;

import java.util.HashMap;
import java.util.Map;

public class EventMap {
    private EventMap() {
        throw new IllegalStateException("Utility class");
    }

    static Map<Integer, String> getEventMap() {
        Map<Integer, String> eventMap = new HashMap<>();
        eventMap.put(1, "");
        eventMap.put(2, "с Ритой");
        eventMap.put(3, "с Ритой и Пашей");
        eventMap.put(4, "");
        eventMap.put(5, "");
        eventMap.put(6, "с Ритой");
        eventMap.put(7, "с Ритой и Пашей");
        eventMap.put(8, "с Пашей и Лерой");
        eventMap.put(9, "");
        eventMap.put(10, "с Ритой");
        eventMap.put(11, "с Ритой и Пашей");
        eventMap.put(12, "");
        eventMap.put(13, "");
        eventMap.put(14, "с Ритой и Лерой");
        eventMap.put(15, "с Ритой и Пашей");
        eventMap.put(16, "с Пашей и Лерой");
        eventMap.put(17, "");
        eventMap.put(18, "с Ритой и Лерой");
        eventMap.put(19, "с Ритой и Пашей");
        eventMap.put(20, "");
        eventMap.put(21, "с Лерой");
        eventMap.put(22, "с Ритой");
        eventMap.put(23, "с Ритой и Пашей");
        eventMap.put(24, "");
        eventMap.put(25, "");
        eventMap.put(26, "с Ритой");
        eventMap.put(27, "с Ритой Пашей, и Лерой");
        eventMap.put(28, "с Пашей и Лерой");
        eventMap.put(29, "");
        eventMap.put(30, "с Ритой");
        eventMap.put(31, "пока не понятно");
        return eventMap;
    }
}
