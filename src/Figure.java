import java.util.Random;

public abstract class Figure {
    public abstract double getArea();

    public abstract String getName();

    public Color getColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)];
    }

    public void drawFigure() {
        String figure = "Фігура: " + this.getName() + ", ";
        String area = "площа: " + this.getArea() + " кв. од., ";
        String color = "колір: " + this.getColor().name() + ".";
        System.out.println(figure + area + getLength() + color);
    }

    private String getLength() {
        String length = "";
        switch (this.getClass().getCanonicalName()) {
            case "Square":
                length = "довжина сторони: " + ((Square) this).getLengthOfSide() + " од., ";
                break;
            case "Trapeze":
                length = "довжина висоти: " + ((Trapeze) this).getHeight() + " од., ";
                break;
            case "Triangle":
                length = "довжина гіпотенузи: " + ((Triangle) this).getLengthOfHypotenuse() + " од., ";
                break;
            case "Circle":
                length = "довжина радіусу: " + ((Circle) this).getRadius() + " од., ";
                break;
        }
        return length;
    }
}
