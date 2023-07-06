package vladproduction.observer.subjectObserver;

public class Main {
    public static void main(String[] args) {

        SubjectAbstract subjectAbstract = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subjectAbstract);
        LaptopClient laptopClient = new LaptopClient(subjectAbstract);

        phoneClient.addMessage("phone client");
        laptopClient.addMessage("laptop client");

    }
}
