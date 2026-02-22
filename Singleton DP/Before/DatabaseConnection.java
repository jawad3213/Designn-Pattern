
public class DatabaseConnection {
    public DatabaseConnection() {
        System.out.println(">> Creating a NEW expensive connection to the DB...");
    }

    public void executeQuery(String sql) {
        System.out.println("Executing: " + sql);
    }
}