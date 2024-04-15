// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package TrafficControl;

/************************************************************/
/**
 * 
 */
package TrafficControl;

public class DisabledPedestrians {
    private String disabledPedestrianLocation;
    private boolean assistanceRequired;

    public DisabledPedestrians(String disabledPedestrianLocation, boolean assistanceRequired) {
        this.disabledPedestrianLocation = disabledPedestrianLocation;
        this.assistanceRequired = assistanceRequired;
    }

    public void isAssistanceReq() {
        if (assistanceRequired) {
            System.out.println("Assistance is required for disabled pedestrians at location: " + disabledPedestrianLocation);
            notifyAssistancePersonnel();
        } else {
            System.out.println("No assistance is required for disabled pedestrians at location: " + disabledPedestrianLocation);
        }
    }

    public boolean isButtonPressed() {
        return Math.random() < 0.5; 
    }

    private void notifyAssistancePersonnel() {
        System.out.println("Assistance personnel have been notified.");
    }
}