
public class RectangleBad {
    public double width;
    public double height;

    public RectangleBad(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

public class CircleBad {
    public double radius;

    public CircleBad(double radius) {
        this.radius = radius;
    }
}

class AreaCalculatorBad {
    public double calculateArea(Object shape) {
        if (shape instanceof RectangleBad) {
            RectangleBad r = (RectangleBad) shape;
            return r.width * r.height;
        } else if (shape instanceof CircleBad) {
            CircleBad c = (CircleBad) shape;
            return Math.PI * c.radius * c.radius;
        }
        // Problem: If we add a Triangle, we MUST modify this class!
        return 0;
    }
}
