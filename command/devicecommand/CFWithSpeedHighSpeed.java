package command.devicecommand;

import command.Command;
import command.devices.CeilingFanWithSpeed;

public class CFWithSpeedHighSpeed implements Command {
    CeilingFanWithSpeed fan;
    int prevSpeed;

    public CFWithSpeedHighSpeed(CeilingFanWithSpeed fan){
        this.fan = fan;
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.highSpeed();
    }

    @Override
    public void undo() {
        switch(prevSpeed) {
            case CeilingFanWithSpeed.OFF_SPEED:
                fan.off();
                break;
            case CeilingFanWithSpeed.LOW_SPEED:
                fan.lowSpeed();
                break;
            case CeilingFanWithSpeed.MEDIUM_SPEED:
                fan.mediumSpeed();
                break;
            case CeilingFanWithSpeed.HIGH_SPEED:
                fan.highSpeed();
        }
    }
    
}
