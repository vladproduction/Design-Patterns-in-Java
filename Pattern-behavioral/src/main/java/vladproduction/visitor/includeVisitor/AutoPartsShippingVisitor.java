package vladproduction.visitor.includeVisitor;


import java.util.List;

public class AutoPartsShippingVisitor implements AutoPartsVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 15;
        System.out.println("Wheel delivery:\n"+shippingAmount);
    }
    @Override
    public void visit(Oil oil) {
        shippingAmount += 5;
        System.out.println("Oil delivery:\n"+shippingAmount);
    }
    @Override
    public void visit(Fender fender) {
        shippingAmount += 8;
        System.out.println("Fender delivery:\n"+shippingAmount);
    }
    @Override
    public void visit(PartsOrder order) {
        System.out.println("Buying 3 items, you`ll got a discount!");
        List<AutoParts> parts = order.getParts();
        if(parts.size()>=3){
            shippingAmount -= 5;
            System.out.println("Your discount is: -5");
        }
        System.out.println("Shipping amount: "+shippingAmount);
    }
}
