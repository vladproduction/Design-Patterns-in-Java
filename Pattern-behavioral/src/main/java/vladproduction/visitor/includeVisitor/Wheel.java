package vladproduction.visitor.includeVisitor;

public class Wheel implements AutoParts {

    @Override
    public void accept(AutoPartsVisitor visitor) {
        visitor.visit(this);
    }
}
