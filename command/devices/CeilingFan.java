package command.devices;

public class CeilingFan {
    String location;

    public CeilingFan(String location){
        this.location = location;
    }

    public void on() {
        System.out.println(String.format("[CeilingFan@%s] on", location));
    }

    public void off(){
        System.out.println(String.format("[CeilingFan@%s] on", location));
    }
}
