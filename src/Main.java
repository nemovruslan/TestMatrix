
public class Main {

    public static void main(String[] args) {
        for (Figure figure : new GenerationOfSets().getFigureList()){
            figure.drawFigure();
        }
    }
}
