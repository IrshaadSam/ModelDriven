

public class Pedestrian extends TrafficSignal {
    public int PedestrianLocation;

    public Pedestrian(int signalID, int locationId, Sensor[] sensors, int pedestrianLocation) {
        super(signalID, locationId, sensors);
        this.PedestrianLocation = pedestrianLocation;
    }

    @Override
    public String isButtonPressed() {
        super.state = 1; // Assuming 1 indicates a green or "safe to cross" state for pedestrians
        return "Pedestrian button pressed at location " + PedestrianLocation + ". Wait for the safe signal to cross.";
    }

    public void SpecialRequest() {
they need more time
        if (super.state == 1) { // If currently in a "safe to cross" state
individuals who move slower
            super.duration += 10; // Extend the current duration by an additional 10 seconds
            System.out.println("Crossing time extended by 10 seconds for special request at location " + PedestrianLocation);
        } else {
            System.out.println("Special request received, but it's currently not safe to cross at location " + PedestrianLocation + ". Please wait.");
        }
    }
}
