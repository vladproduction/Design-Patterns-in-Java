package vladproduction.observer.observerExample;



import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MyBankAccountListener implements PropertyChangeListener {


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String name = evt.getPropertyName();
        Object oldValue = evt.getOldValue();
        Object newValue= evt.getNewValue();
        System.out.println("name "+name);
        System.out.println("oldValue "+oldValue);
        System.out.println("newValue "+newValue);
    }
}
