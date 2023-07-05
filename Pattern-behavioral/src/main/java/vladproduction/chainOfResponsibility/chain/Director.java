package vladproduction.chainOfResponsibility.chain;

public class Director extends Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType()==RequestType.CONFERENCE){
            System.out.println("Director can approve CONFERENCE");
        }else {
            successor.handleRequest(request);
        }
    }
}
