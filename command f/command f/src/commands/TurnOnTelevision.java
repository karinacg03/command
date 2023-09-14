package commands;

import devices.ElectronicDevice;

public class TurnOnTelevision implements Comand{

    private ElectronicDevice device;
    public TurnOnTelevision(ElectronicDevice device){
        this.device = device;
    }
    @Override
    public void execute() {
       device.on();
    }
    @Override
    public void undo() {
        device.off();
    }
}
