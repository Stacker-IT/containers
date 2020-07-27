package by.ITAcademy.gomel.containers;

public class StraightHexagonContainer extends StraightContainer {
    public StraightHexagonContainer(double a) {
        this.baseSquare = a * a * Math.sqrt(27) / 2;
    }
}
