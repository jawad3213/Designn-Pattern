

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        System.out.println("Notification for " + name + ": The project status is now " + state);
    }
}