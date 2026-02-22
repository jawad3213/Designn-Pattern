
public class BadConverter {
    // The logic is buried inside a massive switch/case or if/else block
    public void convertAndDisplay(int number, String targetSystem) {
        String result = "";

        if (targetSystem.equalsIgnoreCase("Binary")) {
            result = Integer.toBinaryString(number);
        }
        else if (targetSystem.equalsIgnoreCase("Hexa")) {
            result = Integer.toHexString(number).toUpperCase();
        }
        else if (targetSystem.equalsIgnoreCase("Octal")) {
            result = Integer.toOctalString(number);
        }
        else {
            System.out.println("Error: System not supported!");
            return;
        }

        System.out.println("Converting " + number + " to " + targetSystem + ": " + result);
    }
}