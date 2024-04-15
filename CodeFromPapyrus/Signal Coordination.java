// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package TrafficControl;

/************************************************************/
/**
 * 
 */
import java.util.Random;
public class SignalCoordination {
    public void monitorTiming() {
        System.out.println("Monitoring traffic signal timing...");
        Random random = new Random();
        int[] signalTimings = new int[4]; // 3 traffic signals
        for (int i = 0; i < signalTimings.length; i++) {
            signalTimings[i] = random.nextInt(60); // Timing 0 to 60 seconds
        }
        for (int i = 0; i < signalTimings.length; i++) {
            System.out.println("Signal " + (i + 1) + " timing: " + signalTimings[i] + " seconds");
        }
    }
    public void syncControl() {
        System.out.println("Synchronizing traffic signal control...");
        int synchronizedTiming = 30; 
        System.out.println("Synchronized timing for all signals: " + synchronizedTiming + " seconds");
    }
}
