package vladproduction.builder.innerClassAction;

public class BuilderSandwich {
    public static void main(String[] args) {

        Sandwich.BuilderInner sandwich = new Sandwich.BuilderInner();

        sandwich.bread("Toast").cheese("Gouda").meat("Beef").dressing("Original");

        //return Object of the class:
        Sandwich sandwichAllWith = sandwich.sandwichCreator();

        System.out.println(sandwichAllWith); //need to override toString();


        System.out.println(sandwichAllWith.getBread());
        System.out.println(sandwichAllWith.getCheese());
        System.out.println(sandwichAllWith.getMeat());
        System.out.println(sandwichAllWith.getDressing());

    }
}
