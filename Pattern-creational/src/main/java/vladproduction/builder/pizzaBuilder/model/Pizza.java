package vladproduction.builder.pizzaBuilder.model;

public class Pizza {
    private final PizzaType pizzaType;
    private final PizzaSize pizzaSize;
    private final int pizzaPrice;
    private final PizzaBox pizzaBox;


    public Pizza(PizzaType pizzaType, PizzaSize pizzaSize, int pizzaPrice, PizzaBox pizzaBox) {
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
        this.pizzaPrice = pizzaPrice;
        this.pizzaBox = pizzaBox;

    }

    public PizzaType getPizzaType(){
        return pizzaType;
    }
    public PizzaSize getPizzaSize(){
        return pizzaSize;
    }
    public int getPizzaPrice(){
        return pizzaPrice;
    }
    public PizzaBox getPizzaBox(){
        return pizzaBox;
    }

    @Override
    public String toString() {
        return "Pizza{" +pizzaType +
                ", " + pizzaSize +
                ", " + pizzaPrice +
                ", " + pizzaBox +
                '}';
    }
}
