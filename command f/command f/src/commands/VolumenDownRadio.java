package commands;

import devices.ElectronicDevice;

public class VolumenDownRadio implements Comand {

    private ElectronicDevice device;
    public VolumenDownRadio(ElectronicDevice device){
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

