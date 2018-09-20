public class Triangle extends Figure {

    private double lengthOfHypotenuse;
    private double height;
    private String NAME = "трикутник";

    public Triangle(double lengthOfHypotenuse, double height) {
        this.lengthOfHypotenuse = lengthOfHypotenuse;
        this.height = height;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getArea() {
        return 0.5 * lengthOfHypotenuse * height;
    }

    public double getLengthOfHypotenuse() {
        return lengthOfHypotenuse;
    }

}
