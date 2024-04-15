package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IRouteTest {

    private List<IRoute> allRoutes;

    @BeforeEach
    void setUp() {
        // Initialize routes
        allRoutes = new ArrayList<>();
        allRoutes.add(new IRoute(1, "Route 1", 1, "Highway"));
        allRoutes.add(new IRoute(2, "Route 2", 2, "Street"));
        allRoutes.add(new IRoute(3, "Route 3", 3, "Highway"));
        allRoutes.add(new IRoute(4, "Route 4", 2, "Street"));
        allRoutes.add(new IRoute(5, "Route 5", 1, "Highway"));
        allRoutes.add(new IRoute(6, "Route 6", 3, "Street"));
    }



    @Test
    void testGetAvailableRoutes() {
        // Test getAvailableRoute method
        List<IRoute> availableRoutes = IRoute.getAvailableRoute();
        assertEquals(2, availableRoutes.size()); // Assuming there are 2 routes with normal severity in the setup
    }
}
