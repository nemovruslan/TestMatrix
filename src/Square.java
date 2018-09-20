
import static java.lang.Math.pow;

public class Square extends Figure {

    private double lengthOfSide;
    private String NAME = "квадрат";

    public Square(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getArea() {
        return pow(lengthOfSide, 2);
    }

    public double getLengthOfSide() {
        return lengthOfSide;
    }

}
