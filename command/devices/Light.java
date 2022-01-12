package command.devices;

public class Light {
    String location;

    public Light(String location){
        this.location = location;
    }

    public void on() {
        System.out.println(String.format("[Light@%s] is on", location));
    }

    public void off() {
        System.out.println(String.format("[Light@%s] is off", location));
    }
}
