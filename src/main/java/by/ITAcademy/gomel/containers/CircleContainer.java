package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;

public class CircleContainer extends EllipseContainer {

    public CircleContainer(double r1, double r2) {
        super(r1, r1, r2, r2);
    }

    public CircleContainer(double r1, double r2, Properties.DensityOfLiquids DENSITY) {
        super(r1, r1, r1, r1, DENSITY);
    }

    public CircleContainer(double r) {
        super(r, r);
    }

    public CircleContainer(double r, Properties.DensityOfLiquids DENSITY) {
        super(r, r, DENSITY);
    }
}
