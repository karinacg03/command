package devices;

public class Radio implements ElectronicDevice{
    private int volumen = 0;
    private String name;

    public Radio(String name){
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println(name + "RADIO is on");
    }

    @Override
    public void off() {
        System.out.println(name + "RADIO is off");
    }

    @Override
    public void volumenup() {
        System.out.println(name + "RADIO is volumen at:"+ volumen);
    }

    @Override
    public void volumendow() {
        System.out.println(name +"Radio ir volumen at:"+ volumen);
    }

}