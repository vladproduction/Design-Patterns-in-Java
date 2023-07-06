package vladproduction.observer.subjectObserver;

public class LaptopClient extends ObserverAbstract{

    public LaptopClient(SubjectAbstract subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from phone");
    }

    @Override
    void update() {
        System.out.println("Laptop Stream: " + subject.getState());
    }
}
