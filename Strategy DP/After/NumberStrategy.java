

public interface NumberStrategy {
    String format(int number);
}



public class BinaryStrategy implements NumberStrategy {
    @Override public String format(int number) { return Integer.toBinaryString(number); }
}


public class HexaStrategy implements NumberStrategy {
    @Override public String format(int number) { return Integer.toHexString(number).toUpperCase(); }
}


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