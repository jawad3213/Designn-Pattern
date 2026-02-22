
public class BinaryStrategy implements NumberStrategy {
    @Override
    public String format(int number) {
        return Integer.toBinaryString(number);
    }
}
