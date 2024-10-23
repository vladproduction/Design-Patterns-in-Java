package vladproduction.com.app02_demo;

public class Factory {

    public static Product create(String x){

        if(x.equalsIgnoreCase("A")){
            return new ProductA();
        }
        if(x.equalsIgnoreCase("B")){
            return new ProductB();
        }
        return null;
    }
}
