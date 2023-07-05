package vladproduction.command.switchExample;


//concrete command
public class CommandImplON implements Command {

    private Light light;

    public CommandImplON(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
