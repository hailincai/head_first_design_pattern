package command.devicecommand;

import command.Command;
import command.devices.CeilingFan;

public class CeilingfanOffCommand implements Command {
    CeilingFan fan;

    public CeilingfanOffCommand(CeilingFan fan){
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }

    @Override
    public void undo() {
        fan.on();
    }
    
}
