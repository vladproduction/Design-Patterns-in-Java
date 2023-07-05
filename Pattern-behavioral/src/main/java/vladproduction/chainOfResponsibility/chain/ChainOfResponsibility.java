package vladproduction.chainOfResponsibility.chain;

public class ChainOfResponsibility {
    public static void main(String[] args) {

        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        //chain -->
        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request = new Request(RequestType.CONFERENCE,500);
        director.handleRequest(request); //-->Director can approve CONFERENCE

        request = new Request(RequestType.PURCHASE,2000);
        vp.handleRequest(request); //-->VP can approve PURCHASE below 3000

        request = new Request(RequestType.PURCHASE,5000);
        director.handleRequest(request); //-->CEO can approve all about company




    }
}
