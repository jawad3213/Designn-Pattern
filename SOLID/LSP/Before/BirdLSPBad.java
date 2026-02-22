
public class BirdBad {
    public void fly() {
        System.out.println("Flying high in the sky!");
    }
}

public class OstrichBad extends BirdBad {
    @Override
    public void fly() {
        // Ostrich cannot fly!
        throw new UnsupportedOperationException("Ostriches can't fly!");
    }
}
