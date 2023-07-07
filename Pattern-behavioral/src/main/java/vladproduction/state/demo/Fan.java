package vladproduction.state.demo;

public class Fan {
    final static int OFF = 0;
    final static int LOW = 1;
    final static int MED = 2;

    int state = OFF;
    public Fan(){

    }
    public void pullChain() {
        if(state==OFF){
            System.out.println("Turning fan on to LOW");
            state=LOW;
        }
        if(state==LOW){
            System.out.println("Turning fan on to MED");
            state=MED;
        }
        else if (state==MED){
            System.out.println("Turning fan on to OFF");
            state=OFF;
        }
    }

    @Override
    public String toString() {
        if(state==OFF){
            return "Fan is off";
        }
        if(state==LOW){
            return "Fan is low";
        }
        if(state==MED){
            return "Fan is med";
        }
        return "Invalid state";
    }
}
