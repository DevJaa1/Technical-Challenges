package AutomacionHome;

public class air_conditioning extends Device {

    private double airTemp;
    private String mode;

    public air_conditioning(String nameDevice, String id, boolean onDvc,
            double temp, String mode) {

        super(nameDevice, id, onDvc);

        if (temp <= 16 || temp >= 30) {
            throw new IllegalArgumentException("the temperature should not be lower than 16 nor higher than 30");

        }

        this.airTemp = temp;
        this.mode = mode;

    }

    public double getAirTemp() {
        return airTemp;
    }

    public void setAirTemp(double airTemp) {
        this.airTemp = airTemp;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String getStatus() {
        return "Device name: " + getNomeDevice() +
                "Id device: " + getId() +
                "Off / On: " + isOnDevice() +
                "Temperature Air" + getAirTemp() +
                "Mode Air: " + getMode();
    }

    

}
