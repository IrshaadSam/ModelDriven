package TrafficControl;

import java.util.HashMap;
import java.util.Map;

public class AutomatedSystem {
    private int tollId;
    private String tollName;
    private Map<String, String> vehicles;
    private Map<String, Double> tollRates;
    private double totalCollection;

    public AutomatedSystem(int tollId, String tollName) {
        this.tollId = tollId;
        this.tollName = tollName;
        this.vehicles = new HashMap<>();
        this.tollRates = new HashMap<>();
        this.totalCollection = 0;
        initializeTollRates();
    }

    private void initializeTollRates() {
        tollRates.put("Car", 5.0);
        tollRates.put("Truck", 10.0);
        tollRates.put("Motorcycle", 2.0);
    }

    public void openToll() {
        System.out.println("Toll booth " + tollName + " is now open");
    }

    public void closeToll() {
        System.out.println("Toll booth " + tollName + " is now closed");
        System.out.println("Total toll collection: $" + totalCollection);
    }

    public void registerEntry(String vehicleNumber, String vehicleType) {
        if (!vehicles.containsKey(vehicleNumber)) {
            vehicles.put(vehicleNumber, vehicleType);
            System.out.println("Vehicle Type: " + vehicleType + ", Vehicle Number: " + vehicleNumber + " entered toll booth " + tollName);
        } else {
            System.out.println("Vehicle " + vehicleNumber + " is already registered.");
        }
    }

    public void registerExit(String vehicleNumber) {
        if (vehicles.containsKey(vehicleNumber)) {
            String vehicleType = vehicles.get(vehicleNumber);
            double tollAmount = calculateToll(vehicleType);
            totalCollection += tollAmount;
            vehicles.remove(vehicleNumber);
            System.out.println("Vehicle " + vehicleNumber + " exited toll booth " + tollName + ". Toll collected: $" + tollAmount);
        } else {
            System.out.println("Vehicle " + vehicleNumber + " is not registered.");
        }
    }

    private double calculateToll(String vehicleType) {
        return tollRates.getOrDefault(vehicleType, 0.0);
    }
}

public class TollBoothController {
    public static void main(String[] args) {
        AutomatedSystem tollBooth = new AutomatedSystem(1, "Main Toll");
        operateTollBooth(tollBooth);
    }

    public static void operateTollBooth(AutomatedSystem tollBooth) {
        tollBooth.openToll();
        tollBooth.registerEntry("ABC123", "Car");
        tollBooth.registerEntry("XYZ456", "Truck");
        tollBooth.registerEntry("DEF789", "Motorcycle");
        tollBooth.registerExit("XYZ456");
        tollBooth.registerExit("ABC123");
        tollBooth.closeToll();
    }
}
