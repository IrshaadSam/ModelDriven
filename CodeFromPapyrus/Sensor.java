// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package TrafficControl;

/************************************************************/
/**
 * 
 */
package TrafficControl;

public class Sensor {
    private int sensorType;
    private int sensorId;
    private String sensorLocation;
    private int routeId;

    public Sensor(int sensorType, int sensorId, String sensorLocation, int routeId) {
        this.sensorType = sensorType;
        this.sensorId = sensorId;
        this.sensorLocation = sensorLocation;
        this.routeId = routeId;
    }

    public String activateSensor(int sensorId) {
        if (sensorId == this.sensorId) {
            return "Sensor " + sensorId + " activated.";
        } else {
            return "Sensor " + sensorId + " does not match with this sensor.";
        }
    }

    public void disableSensor(int sensorId) {
        if (sensorId == this.sensorId) {
            System.out.println("Sensor " + sensorId + " disabled.");
        } else {
            System.out.println("Sensor " + sensorId + " does not match with this sensor.");
        }
    }
}