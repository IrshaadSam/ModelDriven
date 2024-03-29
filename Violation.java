// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package TrafficControl;

/************************************************************/
/**
 * 
 */
 public class Violation {
    public int Violation_Id;
    public int ViolationType;
    public int Sensor_ID;
    public int Driver_License_Id;

    // Constructor
    public Violation(int violation_Id, int violationType, int sensor_ID, int driver_License_Id) {
        this.Violation_Id = violation_Id;
        this.ViolationType = violationType;
        this.Sensor_ID = sensor_ID;
        this.Driver_License_Id = driver_License_Id;
    }

    public String generateViolationReport(int violationId, int violationType) {
        String report = "Violation Report\n";
        report += "Violation ID: " + violationId + "\n";
        report += "Violation Type: " + violationType + "\n";
        report += "Sensor ID: " + Sensor_ID + "\n";
        report += "Driver's License ID: " + Driver_License_Id + "\n";
        return report;
    }
}
