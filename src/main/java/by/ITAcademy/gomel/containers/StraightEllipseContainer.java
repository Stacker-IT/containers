package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;
import by.ITAcademy.gomel.liquids.Liquid;

public class StraightEllipseContainer extends StraightContainer {
    public StraightEllipseContainer(double a, double b) {
        this.baseSquare = Math.PI * a * b;
    }

    public StraightEllipseContainer(double a, double b, Properties.DensityOfLiquids DENSITY) {
        this(a, b);
        this.liquid = new Liquid(getVolume(), DENSITY);
        fillContainer(liquid);
    }

}
