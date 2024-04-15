package org.example;
public class WeatherAlert extends Emergency {
    private String alertType;

    // Constructor
    public WeatherAlert(int id, String type, String alertType) {
        super(id, type);
        this.alertType = alertType;
    }

    // Getter for alertType
    public String getAlertType() {
        return alertType;
    }

    // Setter for alertType
    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }
}
