package vladproduction.builder.pizzaBuilder.cooker;

import vladproduction.builder.pizzaBuilder.builder.PizzaBuilder;
import vladproduction.builder.pizzaBuilder.model.PizzaBox;
import vladproduction.builder.pizzaBuilder.model.PizzaSize;
import vladproduction.builder.pizzaBuilder.model.PizzaType;

public abstract class PizzaProducerByType {


    public void cookHawaiiSmall(PizzaBuilder pizzaBuilder){
        pizzaBuilder.setModelType(PizzaType.HAWAII);
        pizzaBuilder.setModelSize(PizzaSize.SMALL);
        pizzaBuilder.setModelPrice(10);
        pizzaBuilder.setModelBox(PizzaBox.S);
    }

    public void cookHawaiiMiddle(PizzaBuilder pizzaBuilder){
        pizzaBuilder.setModelType(PizzaType.HAWAII);
        pizzaBuilder.setModelSize(PizzaSize.MIDDLE);
        pizzaBuilder.setModelPrice(15);
        pizzaBuilder.setModelBox(PizzaBox.M);
    }

    public void cookHawaiiBig(PizzaBuilder pizzaBuilder){
        pizzaBuilder.setModelType(PizzaType.HAWAII);
        pizzaBuilder.setModelSize(PizzaSize.BIG);
        pizzaBuilder.setModelPrice(17);
        pizzaBuilder.setModelBox(PizzaBox.B);
    }

    public void cookHawaiiGrand(PizzaBuilder pizzaBuilder){
        pizzaBuilder.setModelType(PizzaType.HAWAII);
        pizzaBuilder.setModelSize(PizzaSize.GRAND);
        pizzaBuilder.setModelPrice(23);
        pizzaBuilder.setModelBox(PizzaBox.G);
    }
}
