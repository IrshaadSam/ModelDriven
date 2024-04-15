// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package TrafficControl;

/************************************************************/
/**
 * 
 */
public class Vehicle {
    private int driverLicenseId;
    private int vehicleId;
    private int vehicleType;
    private String[] driverName;
    private String driverAddress;
    private String emergencyContact;
    private String licenseClass; 
    private int contactInfo;
    private String drivingHistory;
    public Vehicle(int driverLicenseId, int vehicleId, int vehicleType, String[] driverName,
                   String driverAddress, String emergencyContact, String licenseClass,
                   int contactInfo, String drivingHistory) {
        this.driverLicenseId = driverLicenseId;
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.driverName = driverName;
        this.driverAddress = driverAddress;
        this.emergencyContact = emergencyContact;
        this.licenseClass = licenseClass;
        this.contactInfo = contactInfo;
        this.drivingHistory = drivingHistory;
    }

    public void recordIncident(int driverLicenseId) {
        System.out.println("An incident has been recorded for the driver with license ID: " + driverLicenseId);
        System.out.println("Incident details: ");
        System.out.println("Date: [DATE]");
        System.out.println("Location: [LOCATION]");
        System.out.println("Description: [DESCRIPTION]");
        System.out.println("Driver's name: " + driverName[0] + " " + driverName[1]);
    }

    public String getDrivingHistory(int driverLicenseId) {
        if (drivingHistory != null && !drivingHistory.isEmpty()) {
            return "Driving history for driver with license ID " + driverLicenseId + ":\n" + drivingHistory;
        } else {
            return "No driving history found for driver with license ID " + driverLicenseId;
        }
    }
}
