package devices;

public class Television implements ElectronicDevice{
    private int volumen = 0;
    private String name;

    public Television(String name){
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println(name + "TELEVISION is on");
    }

    @Override
    public void off() {
        System.out.println(name + "TELEVISION is off");
    }

    @Override
    public void volumenup() {
        System.out.println(name + "TELEVISION is volumen at:"+ volumen);
    }

    @Override
    public void volumendow() {
        System.out.println(name +"Television ir volumen at:"+ volumen);
    }

}
