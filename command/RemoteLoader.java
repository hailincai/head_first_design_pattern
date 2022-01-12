package command;

import command.devicecommand.CeilingfanOffCommand;
import command.devicecommand.CeilingfanOnCommand;
import command.devicecommand.GarageDoorDownCommand;
import command.devicecommand.GarageDoorUpCommand;
import command.devicecommand.LightOffCommand;
import command.devicecommand.LightOnCommand;
import command.devicecommand.StereoOnWithCDCommand;
import command.devices.CeilingFan;
import command.devices.GarageDoor;
import command.devices.Light;
import command.devices.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl(7);

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingfanOnCommand ceilingFanOn = new CeilingfanOnCommand(ceilingFan);
        CeilingfanOffCommand ceilingFanOff = new CeilingfanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);

        rc.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        rc.setCommand(1, kitchenLightOn, kitchenLightOff);
        rc.setCommand(2, ceilingFanOn, ceilingFanOff);
        rc.setCommand(3, stereoOnWithCD, NoCommand.getInstance());

        System.out.println(rc);
        rc.onButtonWasPressed(0);
        rc.offButtonWasPressed(0);
        rc.unButtonWasPressed();
        // rc.onButtonWasPressed(1);
        // rc.offButtonWasPressed(1);
        // rc.onButtonWasPressed(2);
        // rc.offButtonWasPressed(2);
        // rc.onButtonWasPressed(3);
        // rc.offButtonWasPressed(3);
    }
}
