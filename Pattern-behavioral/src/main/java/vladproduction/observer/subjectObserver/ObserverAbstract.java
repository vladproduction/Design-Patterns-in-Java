package vladproduction.observer.subjectObserver;

public abstract class ObserverAbstract {
    protected SubjectAbstract subject;
    abstract void update();
}
