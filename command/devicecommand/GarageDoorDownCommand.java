package command.devicecommand;

import command.Command;
import command.devices.GarageDoor;

public class GarageDoorDownCommand implements Command {
    GarageDoor door;

    public GarageDoorDownCommand(GarageDoor door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.down();
    }

    @Override
    public void undo() {
        door.up();
    }
    
}
