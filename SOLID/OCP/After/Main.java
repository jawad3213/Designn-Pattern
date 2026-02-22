
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(7);
        
        AreaCalculator calculator = new AreaCalculator();
        
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());
        
        System.out.println("\nCombined Area: " + calculator.totalArea(Arrays.asList(rectangle, circle)));

        System.out.println("\nSuccess: To add a 'Triangle', we just create a new class implementing Shape.");
        System.out.println("The AreaCalculator class remains UNCHANGED. It is closed for modification but open for extension.");
    }
}
