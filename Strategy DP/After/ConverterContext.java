
public class ConverterContext {
    private NumberStrategy strategy;

    public void setStrategy(NumberStrategy strategy) {
        this.strategy = strategy;
    }

    public void displayValue(int number) {
        if (strategy == null) {
            System.err.println("Error: No strategy selected!");
            return;
        }
        String result = strategy.format(number);
        System.out.println("Result using " + strategy.getClass().getSimpleName() + ": " + result);
    }
}
