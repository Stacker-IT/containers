package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;
import by.ITAcademy.gomel.liquids.Liquid;

public class EllipseContainer extends Container {
    protected EllipseContainer(double a1, double b1, double a2, double b2) {
        this.baseSquare1 = Math.PI * a1 * b1;
        this.baseSquare2 = Math.PI * a2 * b2;
    }

    protected EllipseContainer(double a1, double b1, double a2, double b2, Properties.DensityOfLiquids DENSITY) {
        this(a1, b1, a2, b2);
        this.liquid = new Liquid(getVolume(), DENSITY);
        fillContainer(liquid);
    }

    public EllipseContainer(double a, double b) {
        this(a, b, a, b);
    }

    public EllipseContainer(double a, double b, Properties.DensityOfLiquids DENSITY) {
        this(a, b, a, b, DENSITY);
    }
}
