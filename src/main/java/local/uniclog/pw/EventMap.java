package local.uniclog.pw;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class EventMap {
    private EventMap() {
        throw new IllegalStateException("Utility class");
    }

    static Map<Integer, DataPair> eventMap() {
        Map<Integer, DataPair> eventMap = new HashMap<>();
        eventMap.put(1, new DataPair("Д", "первого"));
        eventMap.put(2, new DataPair("Р", "второго"));
        eventMap.put(3, new DataPair("О", "третьего"));
        eventMap.put(4, new DataPair("Р", "четвертого"));
        eventMap.put(5, new DataPair("О", "пятого"));
        eventMap.put(6, new DataPair("Д", "шестого"));
        eventMap.put(7, new DataPair("Р", "седьмого"));
        eventMap.put(8, new DataPair("Д", "восьмого"));
        eventMap.put(9, new DataPair("Р", "девятого"));
        eventMap.put(10, new DataPair("О", "десятого"));
        eventMap.put(11, new DataPair("Р", "одиннадцатого"));
        eventMap.put(12, new DataPair("О", "двенадцатого"));
        eventMap.put(13, new DataPair("Д", "тринадцатого"));
        eventMap.put(14, new DataPair("О", "четырнадцатого"));
        eventMap.put(15, new DataPair("Д", "пятнадцатого"));
        eventMap.put(16, new DataPair("Р", "шестнадцатого"));
        eventMap.put(17, new DataPair("О", "семнадцатого"));
        eventMap.put(18, new DataPair("Р", "восемнадцатого"));
        eventMap.put(19, new DataPair("О", "девятнадцатого"));
        eventMap.put(20, new DataPair("Д", "двадцатого"));
        eventMap.put(21, new DataPair("О", "двадцать первого"));
        eventMap.put(22, new DataPair("Д", "двадцать второго"));
        eventMap.put(23, new DataPair("Р", "двадцать третьего"));
        eventMap.put(24, new DataPair("Д", "двадцать четвертого"));
        eventMap.put(25, new DataPair("Р", "двадцать пятого"));
        eventMap.put(26, new DataPair("О", "двадцать шестого"));
        eventMap.put(27, new DataPair("Д", "двадцать седьмого"));
        eventMap.put(28, new DataPair("О", "двадцать восьмого"));
        eventMap.put(29, new DataPair("Д", "двадцать девятого"));
        eventMap.put(30, new DataPair("Р", "тридцатого"));
        eventMap.put(31, new DataPair("Д", "тридцать первого"));
        return eventMap;
    }

    static Integer parseDay(String request) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);
        map.put("9", 9);
        map.put("10", 10);
        map.put("11", 11);
        map.put("12", 12);
        map.put("13", 13);
        map.put("14", 14);
        map.put("15", 15);
        map.put("16", 16);
        map.put("17", 17);
        map.put("18", 18);
        map.put("19", 19);
        map.put("20", 20);
        map.put("21", 21);
        map.put("22", 22);
        map.put("23", 23);
        map.put("24", 24);
        map.put("25", 25);
        map.put("26", 26);
        map.put("27", 27);
        map.put("28", 28);
        map.put("29", 29);
        map.put("30", 30);
        map.put("31", 30);

        AtomicInteger answer = new AtomicInteger(0);
        map.forEach((prediction, value) -> answer.set((request.contains(prediction)) ? value : answer.get()));
        return answer.get();
    }
}
