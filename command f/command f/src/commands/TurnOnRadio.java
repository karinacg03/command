package commands;
import devices.ElectronicDevice;


public class TurnOnRadio implements Comand{


    private ElectronicDevice device;

    public TurnOnRadio(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
    device.off();
    }

    @Override
    public void undo() {
    device.on();
}
}