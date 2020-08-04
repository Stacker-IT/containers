package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;
import by.ITAcademy.gomel.liquids.Liquid;

public class StraightRectangleContainer extends StraightContainer {
    public StraightRectangleContainer(double a, double b) {
        this.baseSquare = a * b;
    }
    public StraightRectangleContainer(double a, double b, Properties.DensityOfLiquids DENSITY) {
        this(a, b);
        this.liquid = new Liquid(getVolume(), DENSITY);
        fillContainer(liquid);

    }

}
