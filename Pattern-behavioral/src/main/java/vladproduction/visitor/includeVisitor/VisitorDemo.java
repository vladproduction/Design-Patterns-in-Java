package vladproduction.visitor.includeVisitor;

public class VisitorDemo {
    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addParts(new Oil());
        order.addParts(new Wheel());
        order.addParts(new Fender());

        order.accept(new AutoPartsShippingVisitor());
        //to displaying Visitor:
        order.accept(new AutoPartsDisplayingVisitor());
    }
}
