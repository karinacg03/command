package commands;
import devices.ElectronicDevice;
import java.util.List;

public class TurnoffAllDevices implements Comand{
    
    List<ElectronicDevice> allDevices;
    public TurnoffAllDevices(List<ElectronicDevice>newDevices){
        allDevices = newDevices;
    }
    @Override
    public void execute() {
        for (ElectronicDevice device: allDevices){
            device.off();
        }
    }
    @Override
    public void undo() {
        for (ElectronicDevice device: allDevices){
            device.on();
        }
    }
    }
