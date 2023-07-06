package vladproduction.observer.subjectObserver;

public class PhoneClient extends ObserverAbstract{

    public PhoneClient(SubjectAbstract subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from phone");
    }

    @Override
    void update() {
        System.out.println("Phone Stream: " + subject.getState());
    }
}
