package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventsTest {

    @Test
    void testConstructorAndGetters() {
        // Create an event
        Events event = new Events(1, "Concert", "ConcertCrowd");

        // Test getters
        assertEquals(1, event.getId());
        assertEquals("Concert", event.getType());
        assertEquals("ConcertCrowd", event.getEventType());
    }

    @Test
    void testSetEventType() {
        // Create an event
        Events event = new Events(1, "Concert", "ConcertCrowd");

        // Set event type
        event.setEventType("FestivalCrowd");

        // Verify event type
        assertEquals("FestivalCrowd", event.getEventType());
    }
}

