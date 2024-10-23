package vladproduction.com.app01_singleton_factory;

public class SingletonA implements Singleton{

    private static SingletonA instance;

    private SingletonA() {
    }

    public static SingletonA getInstance(){
        if(instance == null){
            instance = new SingletonA();
        }
        return instance;
    }

    @Override
    public void createSingleton() {
        System.out.println("SingletonA created");

    }
}
