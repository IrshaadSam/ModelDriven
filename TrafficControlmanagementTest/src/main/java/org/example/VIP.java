package org.example;
public class VIP extends Emergency {
    private String vipType;

    // Constructor
    public VIP(int id, String type, String vipType) {
        super(id, type);
        this.vipType = vipType;
    }

    // Getter for vipType
    public String getVipType() {
        return vipType;
    }

    // Setter for vipType
    public void setVipType(String vipType) {
        this.vipType = vipType;
    }
    
    @Override
    public void handleEmergency(int id, String type) {
        // Custom handling code for VIP emergencies
        System.out.println("Handling VIP emergency...");
        super.handleEmergency(id, type); // Call to the superclass method
    }
}