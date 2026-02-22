
public class MainBad {
    public static void main(String[] args) {
        BusinessLogicBad logic = new BusinessLogicBad();
        logic.processData("Jaouad's Project");

        System.out.println("\nProblem: If we want to switch to MongoDB, we have to modify BusinessLogicBad.java.");
        System.out.println("This makes the code rigid and hard to test.");
    }
}
