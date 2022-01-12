package command;

import java.util.Arrays;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand = NoCommand.getInstance();

    public RemoteControl(int slotNum){
        onCommands = new Command[slotNum];
        offCommands = new Command[slotNum];

        Arrays.fill(onCommands, NoCommand.getInstance());
        Arrays.fill(offCommands, NoCommand.getInstance());
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot){
        this.onCommands[slot].execute();
        undoCommand = this.onCommands[slot];
    }

    public void offButtonWasPressed(int slot){
        this.offCommands[slot].execute();
        undoCommand = this.offCommands[slot];
    }

    public void unButtonWasPressed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++){
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "     " + offCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }
}
