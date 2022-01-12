package command.devicecommand;

import command.Command;
import command.devices.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door){
        this.door = door;
    }

    @Override
    public void execute() {
        this.door.up();
    }

    @Override
    public void undo() {
        door.down();        
    }
    
}
