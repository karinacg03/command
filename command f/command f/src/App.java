import commands.TurnOffRadio;
import commands.TurnOffTelevision;
import commands.TurnOnRadio;
import commands.TurnOnTelevision;
import commands.VolumenUpRadio;
import commands.VolumenUpTelevision;
import devices.ElectronicDevice;
import devices.Radio;
import devices.Television;

public class App {
    public static void main(String[] args, DeviceButton onPressedTwo) throws Exception {
        ElectronicDevice televisionOne = new Television ("IPHONE");
        

        TurnOnTelevision onComand = new TurnOnTelevision(televisionOne);

        DeviceButton onPressed;
        onPressed = new DeviceButton(onComand);
        onPressed.press();

        TurnOffTelevision OffComand = new TurnOffTelevision(televisionOne);
        onPressed = new DeviceButton(OffComand);
        onPressed.press();

        VolumenUpTelevision volUpcomand = new VolumenUpTelevision(televisionOne);
        onPressed = new DeviceButton(volUpcomand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

    ElectronicDevice radioTwo = new Radio ("IPHONE");

        TurnOnRadio onComandTwo = new TurnOnRadio(radioTwo);
        onPressedTwo = new DeviceButton(onComandTwo);
        onPressedTwo.press();

        TurnOffRadio OffComandTwo = new TurnOffRadio(radioTwo);
        onPressed = new DeviceButton(OffComandTwo);
        onPressed.press();

        VolumenUpRadio volUpcomandTwo = new VolumenUpRadio(radioTwo);
        onPressed = new DeviceButton(volUpcomand);
        onPressed.press();
        onPressed.press();
        onPressed.press();
    }

}

