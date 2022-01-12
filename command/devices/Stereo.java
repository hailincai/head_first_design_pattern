package command.devices;

public class Stereo {
    String location;

    public Stereo(String location){
        this.location = location;
    }

    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void setCD() {
        System.out.println("Stereo set CD");
    }

    public void setDvd() {
        System.out.println("Stereo set DVD");
    }

    public void setRadio() {
        System.out.println("Stereo set Radio");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo set Volume to " + volume);
    }
}
