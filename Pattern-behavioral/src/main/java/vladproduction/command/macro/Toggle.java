package vladproduction.command.macro;


//concrete command
public class Toggle implements Command {

    private Light light;

    public Toggle(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}