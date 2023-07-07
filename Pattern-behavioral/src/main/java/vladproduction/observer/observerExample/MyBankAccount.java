package vladproduction.observer.observerExample;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class MyBankAccount {

    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    private long number;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        support.firePropertyChange("number",this.number,number);
        this.number = number;
    }

    public void addListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }
}
