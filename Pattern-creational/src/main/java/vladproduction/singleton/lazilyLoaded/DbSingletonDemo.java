package vladproduction.singleton.lazilyLoaded;

public class DbSingletonDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);

        DbSingleton instance2 = DbSingleton.getInstance();
        System.out.println(instance2);
    }
}
