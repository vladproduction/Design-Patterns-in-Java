package vladproduction.visitor.includeVisitor;

public class Oil implements AutoParts {

    @Override
    public void accept(AutoPartsVisitor visitor) {
        visitor.visit(this);
    }
}
