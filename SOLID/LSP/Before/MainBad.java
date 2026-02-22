
import java.util.Arrays;
import java.util.List;

public class MainBad {
    public static void main(String[] args) {
        List<BirdBad> birds = Arrays.asList(new BirdBad(), new OstrichBad());

        System.out.println("Let's make all birds fly!");
        
        try {
            for (BirdBad bird : birds) {
                bird.fly();
            }
        } catch (UnsupportedOperationException e) {
            System.err.println("\nLSP Violation: " + e.getMessage());
            System.err.println("Problem: We thought every Bird could fly, but our program crashed when it met an Ostrich.");
        }
    }
}
