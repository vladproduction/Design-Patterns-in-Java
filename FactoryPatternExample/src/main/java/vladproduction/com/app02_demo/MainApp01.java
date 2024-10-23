package vladproduction.com.app02_demo;

public class MainApp01 {
    public static void main(String[] args) {

        Product productA = Factory.create("a");

        productA.doSomething();

        Product productB = Factory.create("b");

        productB.doSomething();

//        Product productC = Factory.create("c");
//        assert productC != null;
//        productC.doSomething(); //"productC" is null --> NullPointerException
    }
}
