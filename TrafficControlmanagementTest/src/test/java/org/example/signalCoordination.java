public class SignalCoordination {
    
    private boolean isTimingOptimal;

    public SignalCoordination() {
        this.isTimingOptimal = false; 
    }
    
    public void monitorTiming() {
        
        int currentTiming = getCurrentTiming();
        if (currentTiming <= 60) {
            isTimingOptimal = true; 
        } else {
            isTimingOptimal = false; 
        }
        System.out.println("Timing is optimal: " + isTimingOptimal);
    }

    public void syncControl() {
        System.out.println("Synchronizing control...");
      
    }


private int getCurrentTiming() {
    
    return 50;
}

public static void main(String[] args) {
    
    SignalCoordination signalCoordination = new SignalCoordination();
    
   
    signalCoordination.monitorTiming();
    
   
    signalCoordination.syncControl();
}
}
