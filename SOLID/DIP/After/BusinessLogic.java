
public class BusinessLogic {
    private Database database;

    // Success: High-level module depends on abstraction.
    // We "inject" the dependency.
    public BusinessLogic(Database database) {
        this.database = database;
    }

    public void processData(String data) {
        database.save(data);
    }
}
