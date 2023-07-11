package vladproduction.decorator.decoratorImpl;


//first concrete decorator of all over class decorators:
public class MeatDecorator extends SandwichDecorator{

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make() {
        return customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return " + turkey";
    }
}
