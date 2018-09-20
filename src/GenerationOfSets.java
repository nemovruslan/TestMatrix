import java.util.Random;

public class GenerationOfSets {
    private Integer limitForNumberOfFigure = 1000;
    private Random random = new Random();
    private Figure[] figureList = new Figure[random.nextInt(limitForNumberOfFigure)];
    private Figure obj = null;

    public Figure[] getFigureList() {
        Integer numberOfFigures = 4;
        Integer limitForSide = 100;
        for (int i = 0; i < figureList.length; i++) {
            int randomNumber = random.nextInt(numberOfFigures);
            switch (randomNumber) {
                case 0:
                    obj = new Square(random.nextInt(limitForSide));
                    break;
                case 1:
                    obj = new Triangle(random.nextInt(limitForSide), random.nextInt(limitForSide));
                    break;
                case 2:
                    obj = new Circle(random.nextInt(limitForSide));
                    break;
                case 3:
                    obj = new Trapeze(random.nextInt(limitForSide), random.nextInt(limitForSide), random.nextInt(limitForSide));
                    break;
            }
            figureList[i] = obj;
        }
        return figureList;
    }
}
