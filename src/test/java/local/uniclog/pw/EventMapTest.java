package local.uniclog.pw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventMapTest {

    @Test
    void parseDay() {
        assertEquals(11, EventMap.parseDay("11 текст"));
        assertEquals(22, EventMap.parseDay("текст 22"));
        assertEquals(1, EventMap.parseDay("1"));
        assertEquals(1, EventMap.parseDay("сегодня"));
    }
}