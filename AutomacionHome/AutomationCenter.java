package AutomacionHome;

import java.util.ArrayList;
import java.util.List;

public class AutomationCenter {

    private String nameHome;
    private List<Device> managerDevice;

    public AutomationCenter (String nameHm) {
        this.nameHome = nameHm;
        this.managerDevice = new ArrayList<>();
    }    

    public void addDevice(Device newDvc) {
        managerDevice.add(newDvc);
    }

    public void turnOnAllDevice() {
    }
}
