package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthenticationTest {

    @Test
    void testConstructorAndGetters() {
        Authentication auth = new Authentication(1, "John", "password");
        assertEquals(1, auth.Authenticator_Id);
        assertEquals("John", auth.Authenticator_Name);
        assertEquals("password", auth.Authenticator_Password);
    }

    @Test
    void testManageTraffic() {
        Authentication auth = new Authentication(1, "John", "password");
        auth.manageTraffic();
        // Verify output by using custom stream or logging mechanism
        // Here we assume that manageTraffic() prints "Traffic management initiated by John"
        //assertEquals(expectedOutput, outputStream.toString().trim());
    }

    @Test
    void testIsAuthenticated_ValidCredentials() {
        Authentication auth = new Authentication(1, "John", "password");
        assertTrue(auth.isAuthenticated(1, "password"));
    }

    @Test
    void testIsAuthenticated_InvalidId() {
        Authentication auth = new Authentication(1, "John", "password");
        assertFalse(auth.isAuthenticated(2, "password"));
    }

    @Test
    void testIsAuthenticated_InvalidPassword() {
        Authentication auth = new Authentication(1, "John", "password");
        assertFalse(auth.isAuthenticated(1, "wrongpassword"));
    }
}
