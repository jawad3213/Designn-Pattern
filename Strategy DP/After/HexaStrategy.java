
public class HexaStrategy implements NumberStrategy {
    @Override
    public String format(int number) {
        return Integer.toHexString(number).toUpperCase();
    }
}
