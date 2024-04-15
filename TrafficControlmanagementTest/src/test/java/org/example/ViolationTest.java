package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ViolationTest {

    @Test
    void testGenerateViolationReport() {
        Violation violation = new Violation(1, 1, 123, 456);
        String report = violation.generateViolationReport(1, 1);
        
        String expectedReport = "Violation Report\n" +
                                "Violation ID: 1\n" +
                                "Violation Type: 1\n" +
                                "Sensor ID: 123\n" +
                                "Driver's License ID: 456\n";
        
        assertEquals(expectedReport, report);
    }

    @Test
    void testGenerateViolationReportDifferentValues() {
        Violation violation = new Violation(2, 2, 789, 987);
        String report = violation.generateViolationReport(2, 2);
        
        String expectedReport = "Violation Report\n" +
                                "Violation ID: 2\n" +
                                "Violation Type: 2\n" +
                                "Sensor ID: 789\n" +
                                "Driver's License ID: 987\n";
        
        assertEquals(expectedReport, report);
    }
}
