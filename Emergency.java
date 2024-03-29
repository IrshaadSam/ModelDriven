// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package TrafficControl;

/************************************************************/
/**
 * 
 */
public class Emergency {
    protected int id;
    protected String type;

    public Emergency(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void handleEmergency(int routeId, String routeType) {
        System.out.println("Handling emergency with ID: " + id);
        System.out.println("Emergency type: " + type);
        System.out.println("Route ID: " + routeId);
        System.out.println("Route Type: " + routeType);
        System.out.println("This route is handled.");
    }
}
