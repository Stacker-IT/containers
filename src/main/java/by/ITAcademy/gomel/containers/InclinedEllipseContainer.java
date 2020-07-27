package by.ITAcademy.gomel.containers;

public class InclinedEllipseContainer extends InclinedContainer {
    protected InclinedEllipseContainer(double a1, double b1, double a2, double b2) {
        this.baseSquare1 = Math.PI * a1 * b1;
        this.baseSquare2 = Math.PI * a2 * b2;
    }
}
