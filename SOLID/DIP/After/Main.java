
public class Main {
    public static void main(String[] args) {
        // We can easily swap implementations without changing BusinessLogic
        Database mysql = new MySQLDatabase();
        Database mongo = new MongoDatabase();

        System.out.println("--- Using MySQL ---");
        BusinessLogic logicWithMySQL = new BusinessLogic(mysql);
        logicWithMySQL.processData("Project Alpha");

        System.out.println("\n--- Using MongoDB ---");
        BusinessLogic logicWithMongo = new BusinessLogic(mongo);
        logicWithMongo.processData("Project Beta");

        System.out.println("\nSuccess: Dependency Inversion achieved!");
    }
}
