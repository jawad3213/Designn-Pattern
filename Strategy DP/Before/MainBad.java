
public class MainBad {
    public static void main(String[] args) {
        BadConverter converter = new BadConverter();

        // Testing the hardcoded logic
        converter.convertAndDisplay(255, "Binary");
        converter.convertAndDisplay(255, "Hexa");

        // Problematic part: Adding "Base64" would require modifying BadConverter.java!
        // converter.convertAndDisplay(255, "Base64");
    }
}