package vladproduction.visitor.includeVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AutoParts{
    List<AutoParts> partsList = new ArrayList<>();
    public PartsOrder(){
    }
    public void addParts(AutoParts parts) {
        partsList.add(parts);
    }

    public List<AutoParts> getParts() {
        return Collections.unmodifiableList(partsList);
    }

    @Override
    public void accept(AutoPartsVisitor visitor) {
        for (AutoParts atvPart : partsList) {
            atvPart.accept(visitor);
        }
        visitor.visit(this);
    }
}
