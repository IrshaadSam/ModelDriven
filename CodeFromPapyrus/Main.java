//--------------------------------------------------------
//Code generated by Papyrus Java
//--------------------------------------------------------

package TrafficControl;

/************************************************************/
/**
* 
*/
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmergencyResponder responder = new EmergencyResponder(1, "Fire", "Firefighter");
        Events event = new Events(1, "Concert", "ConcertCrowd");
        List<IRoute> assignedRoutes = new ArrayList<>();
        if (responder != null && event != null) {
            List<Emergency> emergenciesAndEvents = new ArrayList<>();
            emergenciesAndEvents.add(responder); 
            emergenciesAndEvents.add(new Emergency(123, "Medical Emergency"));
            emergenciesAndEvents.add(event); 
            Authentication user = new Authentication(123, "JohnDoe", "password123");
            int idToCheck = 123;
            String passwordToCheck = "password123";
            if (user.isAuthenticated(idToCheck, passwordToCheck)) {
                System.out.println("User is authenticated.");
            } else {
                System.out.println("Authentication failed. Please check your credentials.");
            }
        }
            IRoute route1 = new IRoute(1, "Route 1", 1, "Highway");
            IRoute route2 = new IRoute(2, "Route 2", 2, "Street");
            IRoute route3 = new IRoute(3, "Route 3", 3, "Highway");
            IRoute route4 = new IRoute(4, "Route 4", 2, "Street");
            IRoute route5 = new IRoute(5, "Route 5", 1, "Highway");
            IRoute route6 = new IRoute(6, "Route 6", 3, "Street");
            CongestionControl congestionControl = new CongestionControl();
            for (Emergency emergencyOrEvent : emergenciesAndEvents) {
                IRoute assignedRoute = null;

                for (IRoute route : IRoute.getListOfAllRoutes()) {
                    if (!assignedRoutes.contains(route) && route.getTrafficConditionSeverity() == 3) {
                        assignedRoute = route;
                        break;
                    }
                }
                if (assignedRoute == null && (emergencyOrEvent.getType().equals("Medical Emergency") || emergencyOrEvent.getType().equals("Concert"))) {
                    for (IRoute route : IRoute.getListOfAllRoutes()) {
                        if (!assignedRoutes.contains(route) && route.getTrafficConditionSeverity() == 2) {
                            assignedRoute = route;
                            break;
                        }
                    }
                }
                
                if (assignedRoute == null && (emergencyOrEvent.getType().equals("Fire") || emergencyOrEvent.getType().equals("ConcertCrowd"))) {
                    for (IRoute route : IRoute.getListOfAllRoutes()) {
                        if (!assignedRoutes.contains(route) && route.getTrafficConditionSeverity() == 1) {
                            assignedRoute = route;
                            break;
                        }
                    }
                }

                if (assignedRoute == null) {
                    for (IRoute route : IRoute.getListOfAllRoutes()) {
                        if (!assignedRoutes.contains(route)) {
                            assignedRoute = route;
                            break;
                        }
                    }
                }

                if (assignedRoute != null) {
                    if (emergencyOrEvent instanceof EmergencyResponder) {
                        ((EmergencyResponder) emergencyOrEvent).handleEmergency(assignedRoute);
                    } else {
                        emergencyOrEvent.handleEmergency(assignedRoute.getRouteId(), assignedRoute.getRouteType());
                    }
                    assignedRoutes.add(assignedRoute);
                }
            }

            IRoute.getListOfAllRoutes().removeAll(assignedRoutes);

            System.out.println("Remaining routes:");
            for (IRoute route : IRoute.getListOfAllRoutes()) {
                System.out.println(route.getRouteName());
            }
        }
    }
}
