
public class UserBad {
    private String name;
    private String email;

    public UserBad(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Task 1: Managing user data
    public String getName() { return name; }
    public String getEmail() { return email; }

    // Task 2: Handling login logic (Violates SRP)
    public void login() {
        System.out.println("User " + name + " is logging in...");
    }

    // Task 3: Sending emails (Violates SRP)
    public void sendEmail(String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }

    // Task 4: Database persistence (Violates SRP)
    public void saveToDatabase() {
        System.out.println("Saving user " + name + " to the database...");
    }
}
