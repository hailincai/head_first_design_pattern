package command.devicecommand;

import command.Command;
import command.devices.CeilingFan;

public class CeilingfanOnCommand implements Command {
    CeilingFan fan;

    public CeilingfanOnCommand(CeilingFan fan){
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }
    
}
