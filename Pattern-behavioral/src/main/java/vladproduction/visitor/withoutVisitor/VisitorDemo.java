package vladproduction.visitor.withoutVisitor;

public class VisitorDemo {
    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addParts(new Oil());
        order.addParts(new Weel());
        order.addParts(new Fender());

        double shippingCost = order.calculateShipping();
        System.out.println("shippingCost = "+shippingCost);
    }
}
