public class Trapeze extends Figure {

    private double sideA;
    private double sideB;
    private double heightH;
    private String NAME = "трапеція";

    public Trapeze(double sideA, double sideB, double heightH) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.heightH = heightH;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * heightH;
    }

    public double getHeight() {
        return heightH;
    }

}
