package commands;

import devices.ElectronicDevice;

public class VolumenDownTelevision implements Comand {

    private ElectronicDevice device;
    public VolumenDownTelevision(ElectronicDevice device){
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
