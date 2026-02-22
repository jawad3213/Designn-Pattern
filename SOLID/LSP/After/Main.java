
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Birds that can fly
        List<FlyingBird> flyingBirds = Arrays.asList(new Sparrow());
        
        // All birds (including flightless ones)
        List<Bird> allBirds = Arrays.asList(new Sparrow(), new Ostrich());

        System.out.println("--- All birds eating ---");
        for (Bird bird : allBirds) {
            bird.eat();
        }

        System.out.println("\n--- Flying birds only ---");
        for (FlyingBird bird : flyingBirds) {
            bird.fly();
        }

        System.out.println("\nSuccess: Program is stable. We split the interfaces so we never call 'fly' on a non-flying bird.");
    }
}
