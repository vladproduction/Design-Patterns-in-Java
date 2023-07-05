package vladproduction.command.macro;

import java.util.ArrayList;
import java.util.List;

public class CommandMacro {
    public static void main(String[] args) {
        Light badRoomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new Toggle(badRoomLight);

        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lightList = new ArrayList<>();
        lightList.add(badRoomLight);
        lightList.add(kitchenLight);
        Command allLightsCommand = new AllLightsCommand(lightList);

        lightSwitch.storeAndExecute(allLightsCommand);

    }
}
