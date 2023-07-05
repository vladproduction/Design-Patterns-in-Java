package vladproduction.command.macro;

import java.util.List;

public class AllLightsCommand implements Command {

    private List<Light> lightList;
    public AllLightsCommand(List<Light> lightList) {
        this.lightList = lightList;
    }

    @Override
    public void execute() {
        for (Light light: lightList){
            if(light.isOn()){
                light.toggle();
            }
        }
    }
}
