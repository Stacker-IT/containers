package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;
import by.ITAcademy.gomel.liquids.Liquid;

public class StraightSquareContainer extends StraightContainer {
    public StraightSquareContainer(double a) {
        this.baseSquare = a * a;
    }
    public StraightSquareContainer(double a, Properties.DensityOfLiquids DENSITY) {
        this(a);
        this.liquid = new Liquid(getVolume(), DENSITY);
        fillContainer(liquid);
    }


}
