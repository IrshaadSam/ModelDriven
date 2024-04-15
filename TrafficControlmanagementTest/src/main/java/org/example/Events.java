package org.example;
public class Events extends Emergency {
    private String eventType;

    // Constructor
    public Events(int id, String type, String eventType) {
        super(id, type);
        this.eventType = eventType;
    }

    // Getter for eventType
    public String getEventType() {
        return eventType;
    }

    // Setter for eventType
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}