package vladproduction.command.switchExample;

public class CommandSwitch {
    public static void main(String[] args) {
        Light light = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new Toggle(light);


        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);


    }
}
