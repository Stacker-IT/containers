package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;
import by.ITAcademy.gomel.liquids.Liquid;

public class StraightTrapezeContainer extends StraightContainer {
    public StraightTrapezeContainer(double a, double b, double h) {
        this.baseSquare = (a + b) * h / 2;

    }

    public StraightTrapezeContainer(double a, double b, double h, Properties.DensityOfLiquids DENSITY) {
        this(a, b, h);
        this.liquid = new Liquid(getVolume(), DENSITY);
        fillContainer(liquid);

    }
}
