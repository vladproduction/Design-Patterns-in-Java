package vladproduction.mediator.collegues;

public class MediatorAction {
    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        Light bedroom = new Light("bedroom");
        Light kitchen = new Light("kitchen");

        mediator.registerLight(bedroom);
        mediator.registerLight(kitchen);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommon(mediator);
        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommon = new TurnOffAllLightsCommon(mediator);
        turnOffAllLightsCommon.execute();
    }
}
