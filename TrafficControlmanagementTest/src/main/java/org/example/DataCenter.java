// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DataCenter {
    public int DataCenterId;
    public List<String> Previous_Route_Records;
    public String Current_Route_Records;
    public List<String> DriverViolationRecord;
    public Monitoring monitoring;
    public Authentication authentication;
    public String WeatherRecords;

    // New attributes for user stories
    public List<String> sensorData;
    public List<String> roadInformation;
    public List<String> maintenanceIssues;

    public DataCenter(int dataCenterId) {
        this.DataCenterId = dataCenterId;
        this.Previous_Route_Records = new ArrayList<>();
        this.DriverViolationRecord = new ArrayList<>();
        this.monitoring = new Monitoring();
        this.authentication = new Authentication(dataCenterId, Current_Route_Records, Current_Route_Records);
        this.WeatherRecords = "";
        this.sensorData = new ArrayList<>();
        this.roadInformation = new ArrayList<>();
        this.maintenanceIssues = new ArrayList<>();
    }

    public void update_RouteRecord(String routeRecord) {
        Previous_Route_Records.add(routeRecord);
        Current_Route_Records = routeRecord;
    }

    public void update_Violation_Record(String driverLicenseId, String violationRecord) {
        DriverViolationRecord.add(driverLicenseId + ": " + violationRecord);
    }

    public void update_Weather_Report(String weatherReport) {
        WeatherRecords = weatherReport;
    }

    // New methods for user stories
    public void receive_SensorData(String data) {
        sensorData.add(data);
    }

    public void update_RoadInformation(String info) {
        roadInformation.add(info);
    }

    public void report_MaintenanceIssue(String issue) {
        maintenanceIssues.add(issue);
    }

    public static void main(String[] args) {
        DataCenter dataCenter = new DataCenter(1);
        dataCenter.update_RouteRecord("Route record 1");
        dataCenter.update_Violation_Record("DL123456", "Speeding");
        dataCenter.update_Weather_Report("Sunny");

        // Example usage of new methods
        dataCenter.receive_SensorData("Sensor data 1");
        dataCenter.update_RoadInformation("Road info 1");
        dataCenter.report_MaintenanceIssue("Sensor malfunction at intersection A");

        // Displaying current state
        System.out.println("Current Route Records: " + dataCenter.Current_Route_Records);
        System.out.println("Previous Route Records: " + dataCenter.Previous_Route_Records);
        System.out.println("Driver Violation Records: " + dataCenter.DriverViolationRecord);
        System.out.println("Weather Records: " + dataCenter.WeatherRecords);
        System.out.println("Sensor Data: " + dataCenter.sensorData);
        System.out.println("Road Information: " + dataCenter.roadInformation);
        System.out.println("Maintenance Issues: " + dataCenter.maintenanceIssues);
    }
}

class Monitoring {
	private Map<String, String> credentials; // Store username-password pairs

    public void Authentication() {
        credentials = new HashMap<>();
        // Initialize with some default credentials (can be expanded)
        credentials.put("admin", "password");
        credentials.put("operator", "123456");
    }

    public boolean authenticate(String username, String password) {
        return credentials.containsKey(username) && credentials.get(username).equals(password);
    }

	public String isAssociatedWithMonitoring(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	public String isMonitored(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}
   
}

