package vladproduction.builder.telescopingConstructors;

public class Main {
    public static void main(String[] args) {
        LunchOrder lunch = new LunchOrder("Borsh","Gulash","Zytniy","Uzvar");

//        lunch.setFirstMeal("Borsh");
//        lunch.setSecondMeal("Gulash");
//        lunch.setBread("Zytniy");
//        lunch.setDrink("Uzvar");

        System.out.println(lunch.getFirstMeal());
        System.out.println(lunch.getSecondMeal());
        System.out.println(lunch.getBread());
        System.out.println(lunch.getDrink());

        //no setters, no chance to change value in constructor


    }
}
