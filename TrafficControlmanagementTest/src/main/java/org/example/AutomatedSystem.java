package org.example;

import java.util.HashMap;
import java.util.Map;

public class AutomatedSystem {
    private int TollId;
    private String TollName;
    private Map<String, String> vehicles; // Map to store registered vehicles (vehicle number -> vehicle type)

    // Constructor
    public AutomatedSystem(int tollId, String tollName) {
        this.TollId = tollId;
        this.TollName = tollName;
        this.vehicles = new HashMap<>();
    }

    public AutomatedSystem(ParkingSystem parkingSystem, Monitoring monitoring) {
		// TODO Auto-generated constructor stub
	}

	// Method to open the toll booth
    public void openToll() {
        System.out.println("Toll booth " + TollName + " is now open");
    }

    // Method to close the toll booth
    public void closeToll() {
        System.out.println("Toll booth " + TollName + " is now closed");
    }

    // Method to register vehicle entry
    public void registerEntry(String vehicleNumber, String vehicleType) {
        if (!vehicles.containsKey(vehicleNumber)) {
            vehicles.put(vehicleNumber, vehicleType);
            System.out.println("Vehicle Type: " + vehicleType + ", Vehicle Number: " + vehicleNumber + " entered toll booth " + TollName);
        } else {
            System.out.println("Vehicle " + vehicleNumber + " is already registered.");
        }
    }

    // Method to register vehicle exit
    public void registerExit(String vehicleNumber) {
        if (vehicles.containsKey(vehicleNumber)) {
            vehicles.remove(vehicleNumber);
            System.out.println("Vehicle " + vehicleNumber + " exited toll booth " + TollName);
        } else {
            System.out.println("Vehicle " + vehicleNumber + " is not registered.");
        }
    }

    public static void main(String[] args) {
        AutomatedSystem tollBooth = new AutomatedSystem(1, "Main Toll");
        tollBooth.openToll();
        
        // Register vehicles
        tollBooth.registerEntry("ABC123", "Car");
        tollBooth.registerEntry("XYZ456", "Truck");
        tollBooth.registerEntry("DEF789", "Motorcycle");

        // Unregister vehicles
        tollBooth.registerExit("XYZ456");
        tollBooth.registerExit("ABC123");

        tollBooth.closeToll();
    }
}
