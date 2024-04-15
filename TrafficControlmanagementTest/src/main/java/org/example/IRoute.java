package org.example;
import java.util.ArrayList;
import java.util.List;

public class IRoute {
    private static final Emergency[] emergencies = null;
	private int routeId;
    private String routeName;
    private int trafficConditionSeverity; // 1: High, 2: Medium, 3: Normal
    private String routeType; // Street or Highway
    private static List<IRoute> listOfAllRoutes = new ArrayList<>();

    // Constructor
    public IRoute(int routeId, String routeName, int trafficConditionSeverity, String routeType) {
        this.routeId = routeId;
        this.routeName = routeName;
        this.trafficConditionSeverity = trafficConditionSeverity;
        this.routeType = routeType;
        listOfAllRoutes.add(this);
    }
    public static void assignRouteToEmergency(int emergencyId, int routeId, String routeType) {
        for (Emergency emergency : emergencies) {
            if (emergency.getId() == emergencyId) {
                emergency.handleEmergency(routeId, routeType);
                break;
            }
        }
    }
    // Getter methods
    public int getRouteId() {
        return routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public int getTrafficConditionSeverity() {
        return trafficConditionSeverity;
    }

    public String getRouteType() {
        return routeType;
    }

    public static List<IRoute> getListOfAllRoutes() {
        return listOfAllRoutes;
    }

    // Method to get a list of all routes with normal severity
    public static List<IRoute> getAvailableRoute() {
        List<IRoute> availableRoutes = new ArrayList<>();
        for (IRoute route : listOfAllRoutes) {
            if (route.getTrafficConditionSeverity() == 3) { // Normal severity
                availableRoutes.add(route);
            }
        }
        return availableRoutes;
    }
	public static void setListOfAllRoutes(List<IRoute> allRoutes) {
		// TODO Auto-generated method stub
		
	}
}
