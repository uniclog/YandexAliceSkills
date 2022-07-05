package local.uniclog.workcalendar;

import java.util.HashMap;
import java.util.Map;

public class EventMap {
    private static final String LERA = "Лерой";
    private static final String RITA = "Ритой";
    private static final String PASHA = "Пашей";
    private static final String WITH = "с";
    private static final String AND_WITH = "и с";
    private static final String VACATION = "отпуск";
    private static final String HOLIDAY = "";

    private EventMap() {
        throw new IllegalStateException("Utility class");
    }

    static Map<Integer, String> getEventMap() {
        Map<Integer, String> eventMap = new HashMap<>();
        eventMap.put(1, WITH + LERA);
        eventMap.put(2, HOLIDAY);
        eventMap.put(3, HOLIDAY);
        eventMap.put(4, WITH + LERA);
        eventMap.put(5, WITH + LERA);
        eventMap.put(6, WITH + PASHA);
        eventMap.put(7, WITH + PASHA);
        eventMap.put(8, WITH + LERA);
        eventMap.put(9, HOLIDAY);
        eventMap.put(10, HOLIDAY);
        eventMap.put(11, WITH + PASHA);
        eventMap.put(12, WITH + LERA);
        eventMap.put(13, WITH + LERA);
        eventMap.put(14, WITH + PASHA);
        eventMap.put(15, WITH + PASHA);
        eventMap.put(16, VACATION);
        eventMap.put(17, VACATION);
        eventMap.put(18, VACATION);
        eventMap.put(19, VACATION);
        eventMap.put(20, VACATION);
        eventMap.put(21, VACATION);
        eventMap.put(22, VACATION);
        eventMap.put(23, VACATION);
        eventMap.put(24, VACATION);
        eventMap.put(25, VACATION);
        eventMap.put(26, VACATION);
        eventMap.put(27, VACATION);
        eventMap.put(28, VACATION);
        eventMap.put(29, VACATION);
        eventMap.put(30, VACATION);
        eventMap.put(31, VACATION);
        return eventMap;
    }
}
