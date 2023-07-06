package vladproduction.mediator.collegues;

public class TurnOffAllLightsCommon implements Command {
    private Mediator mediator;

    public TurnOffAllLightsCommon(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
