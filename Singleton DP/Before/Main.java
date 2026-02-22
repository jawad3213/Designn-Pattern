
public class Main {
    public static void main(String[] args) {
        // Every "new" creates a different instance
        DatabaseConnection conn1 = new DatabaseConnection();
        DatabaseConnection conn2 = new DatabaseConnection();

        System.out.println("Are they the same? " + (conn1 == conn2)); // Result: false
    }
}