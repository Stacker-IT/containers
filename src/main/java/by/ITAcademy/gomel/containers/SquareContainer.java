package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;

public class SquareContainer extends RectangleContainer{
    public SquareContainer(double a1, double a2) {
        super(a1, a1, a2, a2);
    }

    public SquareContainer(double a1, double a2, Properties.DensityOfLiquids DENSITY) {
        super(a1, a1, a2, a2, DENSITY);
    }

    public SquareContainer(double a) {
        super(a, a);
    }

    public SquareContainer(double a, Properties.DensityOfLiquids DENSITY) {
        super(a, a, DENSITY);
    }
}
