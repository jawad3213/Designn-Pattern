

public class DatabaseSingleton {
    // 1. Static variable to hold the single instance
    private static DatabaseSingleton instance;

    // 2. PRIVATE constructor so no one can call "new DatabaseSingleton()"
    private DatabaseSingleton() {
        System.out.println(">> INITIALIZING the unique database connection...");
    }

    // 3. Static method to provide global access to the instance
    public static DatabaseSingleton getInstance() {
        if (instance == null) {
            instance = new DatabaseSingleton(); // Created only once
        }
        return instance;
    }

    public void executeQuery(String sql) {
        System.out.println("Executing via Singleton: " + sql);
    }
}
