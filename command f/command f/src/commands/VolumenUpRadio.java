package commands;

    import devices.ElectronicDevice;

public class VolumenUpRadio implements Comand {

    private ElectronicDevice device;
    public VolumenUpRadio(ElectronicDevice device){
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