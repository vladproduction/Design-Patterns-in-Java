package vladproduction.singleton.addDatabase;
/*
        how fast our app can use process memory to create instances
        (new; or if it`s already has been created)
 */
public class DbSingleton {
    private static volatile DbSingleton instance = null;
    private DbSingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }
    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

}
