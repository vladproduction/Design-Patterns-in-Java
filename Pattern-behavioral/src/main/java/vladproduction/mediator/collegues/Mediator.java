package vladproduction.mediator.collegues;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    List<Light> lightList = new ArrayList<>();

    public void registerLight(Light light){
        lightList.add(light);
    }

    public void turnOnAllLights(){
        for (Light light: lightList) {
            if(!light.isOn()){
                light.toggle();
            }
        }
    }

    public void turnOffAllLights() {
        for (Light light: lightList) {
            if(light.isOn()){
                light.toggle();
            }
        }
    }
}
