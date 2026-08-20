package SingletonClass;

public class Main {
    public static void main(String[] args) {
        // Attempting direct instantiation throws a compile error:
        // Singleton obj = new Singleton(); // Constructor is private!

        // All three variables receive the exact same reference
        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();
        SingleTon obj3 = SingleTon.getInstance();

        // Checking reference equality
        System.out.println(obj1 == obj2); // true
        System.out.println(obj2 == obj3); // true
    }
}
