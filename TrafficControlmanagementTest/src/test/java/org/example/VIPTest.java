package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VIPTest {

    @Test
    void testVIP() {
        VIP vip = new VIP(1, "Security", "HighProfile");

        assertEquals(1, vip.getId());
        assertEquals("Security", vip.getType());
        assertEquals("HighProfile", vip.getVipType());

        vip.setId(2);
        vip.setType("Medical");
        vip.setVipType("SpecialCase");
        assertEquals(2, vip.getId());
        assertEquals("Medical", vip.getType());
        assertEquals("SpecialCase", vip.getVipType());
    }


}

