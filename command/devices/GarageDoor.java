package command.devices;

public class GarageDoor {
    String location;

    public GarageDoor(String location){
        this.location = location;
    }

    public void up() {
        System.out.println("Garage Door is up");
    }

    public void down() {
        System.out.println("Garage Door is down");
    }

    public void stop() {
        System.out.println("Garage Door stop");
    }

    public void lightOn() {
        System.out.println("Garage Door light on");
    }

    public void lightOff() {
        System.out.println("Garage Door light off");
    }
}
