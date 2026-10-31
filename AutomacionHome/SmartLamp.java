package AutomacionHome;

public class SmartLamp extends Device {

    private int intensityBright;
    private String color;

    public SmartLamp(String id, String nomeDevice, boolean onDevice, int intensity, String color) {
        super(id, nomeDevice, onDevice);
        if (intensity >= 0 && intensity <= 100) {
            this.intensityBright = intensity;
        } else {
            throw new IllegalArgumentException("Intensity must be between 0 and 100");
        }

    }

    public int getIntensityBright() {
        return intensityBright;
    }

    public void setIntensityBright(int intensityBright) {
        this.intensityBright = intensityBright;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override 
    public String getStatus() {
        return 
        "Device name: " + getNomeDevice() +
        "Id device: " + getId() +
        "Off / On: " + isOnDevice() + 
        "Current Color: " + getColor()+
        "Level Bright: " + getIntensityBright();
    }

}
