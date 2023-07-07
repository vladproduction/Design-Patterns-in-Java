package vladproduction.visitor.includeVisitor;

public interface AutoPartsVisitor {

    void visit(Wheel wheel);
    void visit(Oil oil);
    void visit(Fender fender);
    void visit(PartsOrder partsOrder);
}
