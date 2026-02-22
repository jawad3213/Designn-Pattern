
public class Main {
    public static void main(String[] args) {
        ConverterContext context = new ConverterContext();
        int inputNumber = 255;

        // Swap behaviors at runtime without changing the Context class
        context.setStrategy(new BinaryStrategy());
        context.displayValue(inputNumber);

        context.setStrategy(new HexaStrategy());
        context.displayValue(inputNumber);
    }
}