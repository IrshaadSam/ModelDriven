package org.example;

import java.util.List;

public class Vehicle {

	    private int driverLicenseId;
	    private List<Violation> violations;

	    public Vehicle(int driverLicenseId, List<Violation> violations) {
	        this.driverLicenseId = driverLicenseId;
	        this.violations = violations;
	    }

	    public Vehicle(int driverLicenseId2, String string) {
			// TODO Auto-generated constructor stub
		}

		public List<Violation> getViolations() {
	        return violations;
	    }

	    // Constraint method: Vehicle Must Have a Valid Driver License ID to Record Incident
	    public void recordIncident(int driverLicenseId) {
	        boolean validDriverLicenseId = driverLicenseId == this.driverLicenseId;
	        
	        if (validDriverLicenseId) {
	            System.out.println("Incident recorded successfully.");
	        } else {
	            System.out.println("Invalid driver license ID.");
	        }
	    }

		public String getLicensePlate() {
			// TODO Auto-generated method stub
			return null;
		}
	}

