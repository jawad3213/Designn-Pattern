
public class Main {
    public static void main(String[] args) {
        // You cannot do: new DatabaseSingleton(); (It will cause a compiler error)

        // Get the single instance twice
        DatabaseSingleton s1 = DatabaseSingleton.getInstance();
        DatabaseSingleton s2 = DatabaseSingleton.getInstance();

        s1.executeQuery("SELECT * FROM students");

        // They are exactly the same object in memory
        System.out.println("Are they the same? " + (s1 == s2)); // Result: true
    }
}