package vladproduction.state.multiState;

public class Main {
    public static void main(String[] args) {
        //off-->
        Fan fan = new Fan();
        System.out.println(fan); //Fan is off.
        //low-->
        fan.pullChain();
        System.out.println(fan);
        //med-->
        fan.pullChain();
        System.out.println(fan);
        //high-->
        fan.pullChain();
        System.out.println(fan);
        //off-->
        fan.pullChain();
        System.out.println(fan); //Fan is off.
    }
}
