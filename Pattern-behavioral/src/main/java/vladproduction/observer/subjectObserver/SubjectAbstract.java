package vladproduction.observer.subjectObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectAbstract {

    private List<ObserverAbstract> observers = new ArrayList<>();

    abstract void setState(String str);
    abstract String getState();

    public void attach(ObserverAbstract observer){
        observers.add(observer);
    }
    public void detach(ObserverAbstract observer){
        observers.add(observer);
    }
    public void notifyObservers() {
        for (ObserverAbstract observer : observers) {
            observer.update();
        }
    }
}
