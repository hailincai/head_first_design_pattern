package command.simple;

import command.devicecommand.GarageDoorOpenCommand;
import command.devicecommand.LightOnCommand;
import command.devices.GarageDoor;
import command.devices.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();

        Light light = new Light("a");
        LightOnCommand command = new LightOnCommand(light);
        GarageDoor door = new GarageDoor("");
        GarageDoorOpenCommand gdoc = new GarageDoorOpenCommand(door);

        control.setCommand(command);
        control.buttonWasPressed();

        control.setCommand(gdoc);
        control.buttonWasPressed();
    }
}
