package vladproduction.builder.pizzaBuilder.order;


import vladproduction.builder.pizzaBuilder.builder.PizzaBuilder;
import vladproduction.builder.pizzaBuilder.cooker.PizzaCooker;
import vladproduction.builder.pizzaBuilder.model.Pizza;

import static vladproduction.builder.pizzaBuilder.order.OrderCatalog.*;

public class Order {

    public void setOrder(OrderCatalog orderCatalog) {

        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        PizzaCooker pizzaCooker = new PizzaCooker();

        if(orderCatalog.equals(HAWAII_SMALL)){
            pizzaCooker.cookHawaiiSmall(pizzaBuilder);
            Pizza pizzaHawaiiSmall = pizzaBuilder.getResult();
            System.out.println(pizzaHawaiiSmall);
        }
        if(orderCatalog.equals(HAWAII_MIDDLE)){
            pizzaCooker.cookHawaiiMiddle(pizzaBuilder);
            Pizza pizzaHawaiiMiddle = pizzaBuilder.getResult();
            System.out.println(pizzaHawaiiMiddle);
        }
        if(orderCatalog.equals(HAWAII_BIG)){
            pizzaCooker.cookHawaiiBig(pizzaBuilder);
            Pizza pizzaHawaiiBig = pizzaBuilder.getResult();
            System.out.println(pizzaHawaiiBig);
        }
        if(orderCatalog.equals(HAWAII_GRAND)){
            pizzaCooker.cookHawaiiGrand(pizzaBuilder);
            Pizza pizzaHawaiiGrand = pizzaBuilder.getResult();
            System.out.println(pizzaHawaiiGrand);
        }
    }


}
