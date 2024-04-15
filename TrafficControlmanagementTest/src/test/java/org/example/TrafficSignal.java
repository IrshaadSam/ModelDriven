class TrafficSignal {
    private int signalID;
    protected int LocationId;
    public int state; // 0: Red, 1: Green, 2: Yellow
    public Sensor[] sensors;
    private int duration;

    public TrafficSignal(int signalID, int locationId, Sensor[] sensors) {
        this.signalID = signalID;
        this.LocationId = locationId;
        this.sensors = sensors;
        this.state = 0; // Start with Red signal as a default
        this.duration = 60; // Default duration for the red signal
    }

    public String changeSignalState(int signalID) {
        this.state = (this.state + 1) % 3;
        updateDurationBasedOnState(); // Update duration based on the new state
        return "Signal state changed to " + getStateName();
    }

    private void updateDurationBasedOnState() {
        switch (this.state) {
            case 0: // Red
                this.duration = 60;
                break;
            case 1: // Green
                this.duration = 45;
                break;
            case 2: // Yellow
                this.duration = 15;
                break;
        }
    }

    public void timerState() {
        changeSignalState(this.signalID);
    }

    public void stopTimer() {
    }

    public void startTimer() {
    }

    String isButtonPressed() {
        return "Button press action taken for signal ID " + this.signalID;
    }

    public int getDuration() {
        return this.duration;
    }

    private String getStateName() {
        switch (this.state) {
            case 0:
                return "Red";
            case 1:
                return "Green";
            case 2:
                return "Yellow";
            default:
                return "Unknown";
        }
    }
}
