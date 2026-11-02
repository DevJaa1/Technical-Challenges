package AutomacionHome;

public class CamSecurity extends Device {

    private boolean recording;
    private int resolutionMp;

    public CamSecurity(String nameDevice, String id, boolean onDvc, boolean recording, int resolution) {
        super(id, id, onDvc);

        this.recording = recording;
        this.resolutionMp = resolution;

    }

    public boolean isRecording() {
        return recording;
    }

    public void setRecording(boolean recording) {
        this.recording = recording;
    }

    public int getResolutionMp() {
        return resolutionMp;
    }

    public void setResolutionMp(int resolutionMp) {
        this.resolutionMp = resolutionMp;
    }

    public boolean startRec() {
        if(isRecording() == true) {
            setRecording(false);
        }
        return recording;
    }

    public boolean stopRec() {
        if(isRecording() == false) {
            setRecording(true);
        } 
        return recording; 
            
    }

    @Override 
    public String getStatus() {

        return "Device name: " + getNomeDevice() +
                "Id device: " + getId() +
                "Off / On: " + isOnDevice() +
                "Resolution Image: " + getResolutionMp() +
                "Recording: " + isRecording();

    }

}
