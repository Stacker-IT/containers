package by.ITAcademy.gomel.containers;

public class InclinedHexagonContainer extends InclinedContainer {
    public InclinedHexagonContainer(double a1, double a2) {
        this.baseSquare1 = a1 * a1 * Math.sqrt(27) / 2;
        this.baseSquare2 = a2 * a2 * Math.sqrt(27) / 2;
    }
}
