package vladproduction.visitor.withoutVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder {
    List<AutoParts> partsList = new ArrayList<>();
    public PartsOrder(){
    }
    public void addParts(AutoParts parts) {
        partsList.add(parts);
    }

    public List<AutoParts> getParts() {
        return Collections.unmodifiableList(partsList);
    }

    public double calculateShipping() {
        double deliveryCost = 0;
        for (AutoParts part:partsList) {
            deliveryCost += part.calculateShipping();
        }
        return deliveryCost;
    }
}
