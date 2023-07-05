package vladproduction.command.macro;


//receiver
public class Light {

    private boolean isOn = false;

    public boolean isOn(){
        return isOn;
    }

    public void toggle(){
        if(isOn){
            off();
            isOn = false;
        }else {
            on();
            isOn = true;
        }
    }

    public void on(){
        System.out.println("Light switched ON.");
    }
    public void off(){
        System.out.println("Light switched OFF.");
    }
}
