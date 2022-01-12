package command.devicecommand;

import command.Command;
import command.devices.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
    
}
