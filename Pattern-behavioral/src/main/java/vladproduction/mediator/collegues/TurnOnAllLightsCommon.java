package vladproduction.mediator.collegues;

public class TurnOnAllLightsCommon implements Command {
    private Mediator mediator;

    public TurnOnAllLightsCommon(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
