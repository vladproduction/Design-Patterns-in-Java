package vladproduction.observer.observerExample;

public class Main {
    public static void main(String[] args) {
        MyBankAccount account = new MyBankAccount();
        account.setNumber(123456789);
        //set a new one:
        account.setNumber(1163231222);

        //got the last added:
        System.out.println(account.getNumber());

        //change support added:  1163231222

        // listener created

        MyBankAccountListener listener = new MyBankAccountListener();
        MyBankAccountListener listener2 = new MyBankAccountListener();
        account.addListener(listener);
        account.addListener(listener2);
        account.setNumber(333);
        account.setNumber(555);
        account.setNumber(777);

    }


}
