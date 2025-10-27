public class Singleton {
    // Step 1: Create a static instance
    private static Singleton instance;
    
    // Step 2: Private constructor to prevent instantiation
    private Singleton() {}
    
    // Step 3: Public method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        System.out.println(singleton1 == singleton2);  // Output: true
    }
}
