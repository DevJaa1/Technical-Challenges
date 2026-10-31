package AutomacionHome;

public abstract class Device {

    private String id;
    private String nomeDevice;
    private boolean onDevice;

    public Device(String id, String nomedvc, boolean ondvc) {

        if (id == null || nomedvc == null) {

            throw new IllegalArgumentException("Nome ou id estão inválidos");

        }

        this.id = id;
        this.nomeDevice = nomedvc;
        this.onDevice = false;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeDevice() {
        return nomeDevice;
    }

    public void setNomeDevice(String nomeDevice) {
        this.nomeDevice = nomeDevice;
    }

    public boolean isOnDevice() {
        return onDevice;
    }

    public void setOnDevice(boolean onDevice) {
        this.onDevice = onDevice;
    }

}
