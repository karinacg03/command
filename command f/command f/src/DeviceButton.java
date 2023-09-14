import commands.Comand;

public class DeviceButton {
    private Comand comand;

    public DeviceButton (Comand comand){
    this.comand = comand;
}
public void press (){
    comand.execute();
}
public void pressUndo(){
    comand.undo();
}
}