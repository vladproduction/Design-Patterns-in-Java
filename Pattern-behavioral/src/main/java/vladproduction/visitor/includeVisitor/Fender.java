package vladproduction.visitor.includeVisitor;

public class Fender implements AutoParts {

    @Override
    public void accept(AutoPartsVisitor visitor) {
        visitor.visit(this);
    }
}
