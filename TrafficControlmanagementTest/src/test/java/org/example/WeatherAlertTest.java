package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

public class WeatherAlertTest {

    @Test
    void testWeatherAlert() {
        WeatherAlert alert = new WeatherAlert(1, "Rain", "HeavyRain");

        assertEquals(1, alert.getId());
        assertEquals("Rain", alert.getType());
        assertEquals("HeavyRain", alert.getAlertType());

        alert.setId(2);
        alert.setType("Thunderstorm");
        alert.setAlertType("SevereThunderstorm");
        assertEquals(2, alert.getId());
        assertEquals("Thunderstorm", alert.getType());
        assertEquals("SevereThunderstorm", alert.getAlertType());
    }
        @Test
        void testSetterAndGetters() {
            WeatherAlert alert = new WeatherAlert(1, "Rain", "HeavyRain");

            alert.setId(3);
            assertEquals(3, alert.getId());

            alert.setType("Snow");
            assertEquals("Snow", alert.getType());

            alert.setAlertType("Blizzard");
            assertEquals("Blizzard", alert.getAlertType());
        }


 
    }


