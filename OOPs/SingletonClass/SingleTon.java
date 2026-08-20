package SingletonClass;

public class SingleTon {
    // 1. Private static variable to hold the single instance
    private static SingleTon instance;

    // 2. Private constructor prevents direct instantiation from outside
    private SingleTon() {

    }

    // 3. Public static method to control access and creation
    public static SingleTon getInstance() {
        // Create the object ONLY if it hasn't been created yet (Lazy Initialization)
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}