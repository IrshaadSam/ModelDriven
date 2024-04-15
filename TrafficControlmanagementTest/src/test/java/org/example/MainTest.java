package org.example;

import org.example.IRoute;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    private List<IRoute> allRoutes;
    private List<IRoute> assignedRoutes;

    /*@BeforeEach
    void setUp() {
        // Initialize routes
        allRoutes = new ArrayList<>();
        allRoutes.add(new IRoute(1, "Route 1", 1, "Highway"));
        allRoutes.add(new IRoute(2, "Route 2", 2, "Street"));
        allRoutes.add(new IRoute(3, "Route 3", 3, "Highway"));
        allRoutes.add(new IRoute(4, "Route 4", 2, "Street"));
        allRoutes.add(new IRoute(5, "Route 5", 1, "Highway"));
        allRoutes.add(new IRoute(6, "Route 6", 3, "Street"));

        assignedRoutes = new ArrayList<>();
    }

    @Test
    void testMain_NormalFlow() {
        // Mock System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Execute main method
        Main.main(null);

        // Restore System.out
        System.setOut(System.out);

        // Verify output
        String expectedOutput = "Remaining routes:\nRoute 2\nRoute 3\nRoute 4\nRoute 6";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }

    @Test
    void testMain_NoEmergenciesOrEvents() {
        // Mock System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Execute main method
        Main.main(null);

        // Restore System.out
        System.setOut(System.out);

        // Verify output
        String expectedOutput = "Remaining routes:\nRoute 1\nRoute 2\nRoute 3\nRoute 4\nRoute 5\nRoute 6";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }

    @Test
    void testMain_AllRoutesAssigned() {
        // Create emergencies and events
        EmergencyResponder responder = new EmergencyResponder(1, "Fire", "Firefighter");
        Events event = new Events(1, "Concert", "ConcertCrowd");

        // Assign all routes
        assignedRoutes.addAll(allRoutes);

        // Mock System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Execute main method
        Main.main(null);

        // Restore System.out
        System.setOut(System.out);

        // Verify output
        assertEquals("Remaining routes:", outputStream.toString().trim());
    }
}*/
}
