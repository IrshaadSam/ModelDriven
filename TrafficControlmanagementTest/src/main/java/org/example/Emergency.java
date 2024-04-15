package org.example;
public class Emergency {
    protected int id;
    protected String type;

    // Constructor
    public Emergency(int id, String type) {
        this.id = id;
        this.type = type;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }
    
    // Method to handle emergency with route information
    public void handleEmergency(int routeId, String routeType) {
        System.out.println("Handling emergency with ID: " + id);
        System.out.println("Emergency type: " + type);
        System.out.println("Route ID: " + routeId);
        System.out.println("Route Type: " + routeType);
        System.out.println("This route is handled.");
        // Additional handling code can be added here
    }
}