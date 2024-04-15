package org.example;
public class EmergencyResponder extends Emergency {
    private String responderType;

    // Constructor
    public EmergencyResponder(int id, String type, String responderType) {
        super(id, type);
        this.responderType = responderType;
    }

    // Getter for responderType
    public String getResponderType() {
        return responderType;
    }

    // Setter for responderType
    public void setResponderType(String responderType) {
        this.responderType = responderType;
    }
    
    public void handleEmergency(IRoute assignedRoute) {
        System.out.println("Handling emergency: " + getType());
        System.out.println("Occupying route: " + assignedRoute.getRouteName());
        // Additional handling code can be added here
    }
}
