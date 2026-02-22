
public class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving '" + data + "' to MySQL database...");
    }
}

public class BusinessLogicBad {
    // Problem: High-level module depends on low-level module (MySQLDatabase)
    private MySQLDatabase database = new MySQLDatabase();

    public void processData(String data) {
        database.save(data);
    }
}
