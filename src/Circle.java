import static java.lang.Math.*;

public class Circle extends Figure {

    private double radius;
    private String NAME = "коло";

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getArea() {
        return PI * pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}
