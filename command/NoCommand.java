package command;

public class NoCommand implements Command {
    private static volatile NoCommand instance;

    private NoCommand() {}

    public static NoCommand getInstance() {
        if (instance == null) {
            synchronized(NoCommand.class) {
                if (instance == null){
                    instance = new NoCommand();
                }
            }
        }

        return instance;
    }


    @Override
    public void execute() {
        System.out.println("No device been assigned...");
    }

    @Override
    public void undo() {
        System.out.println("No device been assigned...");
    }
    
}
