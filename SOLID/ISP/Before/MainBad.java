
public class MainBad {
    public static void main(String[] args) {
        WorkerBad human = new HumanBad();
        WorkerBad robot = new RobotBad();

        System.out.println("--- Human Worker ---");
        human.work();
        human.eat();
        human.sleep();

        System.out.println("\n--- Robot Worker ---");
        robot.work();
        
        try {
            robot.eat();
        } catch (UnsupportedOperationException e) {
            System.err.println("ISP Violation Error: " + e.getMessage());
            System.err.println("Problem: Robot was forced to implement eat() because of a fat interface.");
        }
    }
}
