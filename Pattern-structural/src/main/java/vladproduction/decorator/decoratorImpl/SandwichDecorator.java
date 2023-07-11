package vladproduction.decorator.decoratorImpl;


//base of decorator pattern (abstract class here)
public abstract class SandwichDecorator implements Sandwich{

    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }
    public String make() {
        return customSandwich.make();
    }
}
