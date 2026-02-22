
public class Main {
    public static void main(String[] args) {
        User user = new User("Jaouad", "jaouad@ansa.ma");

        // Each class has a single responsibility
        AuthService auth = new AuthService();
        EmailService email = new EmailService();
        UserRepository repo = new UserRepository();

        auth.login(user);
        email.sendEmail(user, "Welcome to SRP!");
        repo.save(user);

        System.out.println("\nSuccess: Responsibilities are separated!");
        System.out.println("If database changes, we only modify UserRepository. User class stays untouched.");
    }
}
