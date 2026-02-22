
public class MainBad {
    public static void main(String[] args) {
        AreaCalculatorBad calculator = new AreaCalculatorBad();
        
        RectangleBad rect = new RectangleBad(10, 5);
        CircleBad circle = new CircleBad(7);

        System.out.println("Rectangle Area: " + calculator.calculateArea(rect));
        System.out.println("Circle Area: " + calculator.calculateArea(circle));

        System.out.println("\nProblem: To add a 'Triangle', we would have to edit the AreaCalculatorBad class.");
        System.out.println("This violates the principle that code should be CLOSED for modification but OPEN for extension.");
    }
}
