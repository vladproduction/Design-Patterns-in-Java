package vladproduction.builder.pizzaBuilder.builder;


import vladproduction.builder.pizzaBuilder.model.Pizza;
import vladproduction.builder.pizzaBuilder.model.PizzaBox;
import vladproduction.builder.pizzaBuilder.model.PizzaSize;
import vladproduction.builder.pizzaBuilder.model.PizzaType;

public class PizzaBuilder implements Builder<PizzaType, PizzaSize, PizzaBox>{

    private PizzaType pizzaType;
    private PizzaSize pizzaSize;
    private int pizzaPrice;
    private PizzaBox pizzaBox;

    @Override
    public void setModelType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    @Override
    public void setModelSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    @Override
    public void setModelPrice(int pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    @Override
    public void setModelBox(PizzaBox pizzaBox) {
        this.pizzaBox = pizzaBox;

    }

    public Pizza getResult(){
        return new Pizza(pizzaType, pizzaSize, pizzaPrice, pizzaBox);
    }
}
