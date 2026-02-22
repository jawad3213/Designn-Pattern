
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Robot robot = new Robot();

        System.out.println("--- Human ---");
        human.work();
        human.eat();
        human.sleep();

        System.out.println("\n--- Robot ---");
        robot.work();

        System.out.println("\nSuccess: Interfaces are segregated! Robot only knows how to work.");
    }
}
