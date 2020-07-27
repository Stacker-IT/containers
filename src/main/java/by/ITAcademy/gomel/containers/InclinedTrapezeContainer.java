package by.ITAcademy.gomel.containers;

public class InclinedTrapezeContainer extends InclinedContainer {
    public InclinedTrapezeContainer(double a1, double b1, double h1, double a2, double b2, double h2) {
        this.baseSquare1 = (a1 + b1) * h1 / 2;
        this.baseSquare2 = (a2 + b2) * h2 / 2;
    }
}
