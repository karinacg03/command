package commands;

    import devices.ElectronicDevice;

public class VolumenUpTelevision implements Comand {

    private ElectronicDevice device;
    public VolumenUpTelevision(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumendow();
    }
    @Override
    public void undo() {
        device.volumenup();
    }}

