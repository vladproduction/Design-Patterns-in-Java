package vladproduction.builder.exposedSetters;

public class Main {
    public static void main(String[] args) {
        LunchOrder lunch = new LunchOrder();

//        lunch.setFirstMeal("Borsh");
//        lunch.setSecondMeal("Gulash");
//        lunch.setBread("Zytniy");
//        lunch.setDrink("Uzvar");

        System.out.println(lunch.getFirstMeal());
        System.out.println(lunch.getSecondMeal());
        System.out.println(lunch.getBread());
        System.out.println(lunch.getDrink());

        //But what if we do not want all the properties?
        //setters are immutable
        //Telescoping help us!

    }
}
