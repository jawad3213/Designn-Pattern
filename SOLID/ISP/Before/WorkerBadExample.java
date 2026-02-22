
public interface WorkerBad {
    void work();
    void eat();
    void sleep();
}

public class HumanBad implements WorkerBad {
    @Override public void work() { System.out.println("Human is working."); }
    @Override public void eat() { System.out.println("Human is eating."); }
    @Override public void sleep() { System.out.println("Human is sleeping."); }
}

public class RobotBad implements WorkerBad {
    @Override public void work() { System.out.println("Robot is working."); }

    @Override
    public void eat() {
        // Robots don't eat!
        throw new UnsupportedOperationException("Robots can't eat!");
    }

    @Override
    public void sleep() {
        // Robots don't sleep!
        throw new UnsupportedOperationException("Robots can't sleep!");
    }
}
