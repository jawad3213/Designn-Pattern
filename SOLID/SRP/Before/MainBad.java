
public class MainBad {
    public static void main(String[] args) {
        UserBad user = new UserBad("Jaouad", "jaouad@ansa.ma");

        // One object handles everything
        user.login();
        user.sendEmail("Welcome to SOLID!");
        user.saveToDatabase();

        System.out.println("\nProblem: If we change the database logic, we have to modify the User class.");
        System.out.println("Problem: If we change the email server, we have to modify the User class.");
    }
}
