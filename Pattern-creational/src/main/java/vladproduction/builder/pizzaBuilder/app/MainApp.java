package vladproduction.builder.pizzaBuilder.app;

import vladproduction.builder.pizzaBuilder.order.Order;

import static vladproduction.builder.pizzaBuilder.order.OrderCatalog.*;

public class MainApp {
    public static void main(String[] args) {


        Order order1 = new Order();
        order1.setOrder(HAWAII_SMALL);
        order1.setOrder(HAWAII_MIDDLE);
        order1.setOrder(HAWAII_BIG);
        order1.setOrder(HAWAII_GRAND);

    }

}
