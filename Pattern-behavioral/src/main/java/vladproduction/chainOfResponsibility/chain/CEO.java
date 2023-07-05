package vladproduction.chainOfResponsibility.chain;

public class CEO extends Handler{
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can approve all about company");
    }
}
