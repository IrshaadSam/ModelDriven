package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEmergencyClassesTest {

    @Test
    void testEmergency() {
        // Create an emergency
        Emergency emergency = new Emergency(1, "Fire");

        // Test getters
        assertEquals(1, emergency.getId());
        assertEquals("Fire", emergency.getType());

        // Test setters
        emergency.setId(2);
        emergency.setType("Medical");
        assertEquals(2, emergency.getId());
        assertEquals("Medical", emergency.getType());
    }

    @Test
    void testEmergencyResponder() {
        // Create an emergency responder
        EmergencyResponder responder = new EmergencyResponder(4, "Medical", "Paramedic");

        // Test getters
        assertEquals(4, responder.getId());
        assertEquals("Medical", responder.getType());
        assertEquals("Paramedic", responder.getResponderType());

        // Test setters
        responder.setId(5);
        responder.setType("Fire");
        responder.setResponderType("Firefighter");
        assertEquals(5, responder.getId());
        assertEquals("Fire", responder.getType());
        assertEquals("Firefighter", responder.getResponderType());
    }
}

