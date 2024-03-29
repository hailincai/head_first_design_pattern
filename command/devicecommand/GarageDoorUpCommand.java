package command.devicecommand;

import command.Command;
import command.devices.GarageDoor;

public class GarageDoorUpCommand implements Command {
    GarageDoor door;

    public GarageDoorUpCommand(GarageDoor door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }

    @Override
    public void undo() {
        door.down();
    }
    
}
