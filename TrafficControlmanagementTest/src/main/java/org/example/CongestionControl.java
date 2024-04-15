package org.example;

public class CongestionControl {
    // Method to trigger congestion control when an emergency is present
    public void triggerCongestionControl(int routeId, String routeType, int severity) {
        System.out.println("Initiating Congestion Control...");
        
        // Display route details
        System.out.println("Route ID: " + routeId);
        System.out.println("Route Type: " + routeType);
        
        // Check severity and display appropriate message
        if (severity == 3) {
            System.out.println("Traffic condition is normal.");
        } else if (severity == 2) {
            System.out.println("Traffic condition is medium.");
        } else if (severity == 1) {
            System.out.println("Traffic condition is high.");
        } else {
            System.out.println("Invalid severity level.");
        }
        
        // Display available routes
        System.out.println("Available routes:");
        for (IRoute route : IRoute.getListOfAllRoutes()) {
            System.out.println(route.getRouteId() + ": " + route.getRouteName() + route.getTrafficConditionSeverity());
        }
    }
}

