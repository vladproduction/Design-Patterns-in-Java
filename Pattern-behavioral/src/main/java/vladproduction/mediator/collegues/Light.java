package vladproduction.mediator.collegues;

public class Light {
    private boolean isOn = false;
    private String location;


    public Light(String location) {
        this.location = location;
    }
    public boolean isOn() {
        return isOn;
    }
    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }
    public void on(){
        System.out.println(location+" Light ON");
    }
    public void off(){
        System.out.println(location+" Light OFF");
    }

    @Override
    public String toString() {
        return "Light "+ location;
    }
}
