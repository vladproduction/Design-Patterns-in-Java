package vladproduction.chainOfResponsibility.chain;

public class VP extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType()==RequestType.PURCHASE){
            if (request.getAmount()<3000){
                System.out.println("VP can approve PURCHASE below 3000");
            }
            else {
                successor.handleRequest(request);
            }
        }
    }
}
