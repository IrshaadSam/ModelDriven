package TrafficControl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Monitoring {
    private int frequency;
    private List<Integer> sensorList;
    private Map<Integer, String> sensorData;

    public Monitoring() {
        this.frequency = 0;
        this.sensorList = new ArrayList<>();
        this.sensorData = new HashMap<>();
    }

    public void monitorSensorData(int sensorId, String data) {
        if (sensorList.contains(sensorId)) {
            sensorData.put(sensorId, data);
            System.out.println("Monitoring sensor data for sensor with ID: " + sensorId);
            processSensorData(sensorId, data);
        } else {
            System.out.println("Sensor with ID " + sensorId + " is not being monitored.");
        }
    }

    private void processSensorData(int sensorId, String data) {
        System.out.println("Processing sensor data for sensor with ID " + sensorId + ": " + data);
        System.out.println("Sensor data processed successfully.");
    }

    public void startMonitor() {
        System.out.println("Monitoring started");
    }

    public void stopMonitor() {
        System.out.println("Monitoring stopped");
    }

    public String getSensorData(int sensorId) {
        if (sensorData.containsKey(sensorId)) {
            return sensorData.get(sensorId);
        } else {
            return "No data available for sensor with ID " + sensorId;
        }
    }

    public void removeSensor(int sensorId) {
        if (sensorList.contains(sensorId)) {
            sensorList.remove(Integer.valueOf(sensorId));
            sensorData.remove(sensorId);
            System.out.println("Sensor with ID " + sensorId + " removed from monitoring");
        } else {
            System.out.println("Sensor with ID " + sensorId + " is not being monitored.");
        }
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public List<Integer> getSensorList() {
        return sensorList;
    }

    public void addSensor(int sensorId) {
        if (!sensorList.contains(sensorId)) {
            sensorList.add(sensorId);
            System.out.println("Sensor with ID " + sensorId + " added for monitoring");
        } else {
            System.out.println("Sensor with ID " + sensorId + " is already being monitored.");
        }
    }

    public void performMonitoringOperations() {
        startMonitor();

        addSensor(1);
        addSensor(2);

        monitorSensorData(1, "Data from sensor 1");
        monitorSensorData(2, "Data from sensor 2");

        System.out.println("Sensor 1 data: " + getSensorData(1));

        removeSensor(1);

        stopMonitor();
    }
}
