package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class DataCenterTest {

    @Test
    void testUpdateRouteRecord() {
        DataCenter dataCenter = new DataCenter(1);
        dataCenter.update_RouteRecord("Route record 1");
        assertEquals("Route record 1", dataCenter.Current_Route_Records);
        assertEquals(1, dataCenter.Previous_Route_Records.size());
        assertEquals("Route record 1", dataCenter.Previous_Route_Records.get(0));
    }

    @Test
    void testUpdateViolationRecord() {
        DataCenter dataCenter = new DataCenter(1);
        dataCenter.update_Violation_Record("DL123456", "Speeding");
        List<String> violationRecords = dataCenter.DriverViolationRecord;
        assertEquals(1, violationRecords.size());
        assertEquals("DL123456: Speeding", violationRecords.get(0));
    }

    @Test
    void testUpdateWeatherReport() {
        DataCenter dataCenter = new DataCenter(1);
        dataCenter.update_Weather_Report("Sunny");
        assertEquals("Sunny", dataCenter.WeatherRecords);
    }

    @Test
    void testReceiveSensorData() {
        DataCenter dataCenter = new DataCenter(1);
        dataCenter.receive_SensorData("Sensor data 1");
        List<String> sensorData = dataCenter.sensorData;
        assertEquals(1, sensorData.size());
        assertEquals("Sensor data 1", sensorData.get(0));
    }

    @Test
    void testUpdateRoadInformation() {
        DataCenter dataCenter = new DataCenter(1);
        dataCenter.update_RoadInformation("Road info 1");
        List<String> roadInformation = dataCenter.roadInformation;
        assertEquals(1, roadInformation.size());
        assertEquals("Road info 1", roadInformation.get(0));
    }

    @Test
    void testReportMaintenanceIssue() {
        DataCenter dataCenter = new DataCenter(1);
        dataCenter.report_MaintenanceIssue("Sensor malfunction at intersection A");
        List<String> maintenanceIssues = dataCenter.maintenanceIssues;
        assertEquals(1, maintenanceIssues.size());
        assertEquals("Sensor malfunction at intersection A", maintenanceIssues.get(0));
    }
}
