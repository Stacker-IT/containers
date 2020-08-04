package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;
import by.ITAcademy.gomel.liquids.Liquid;

public class StraightHexagonContainer extends StraightContainer {
    public StraightHexagonContainer(double a) {
        this.baseSquare = a * a * Math.sqrt(27) / 2;
    }
    public StraightHexagonContainer(double a, Properties.DensityOfLiquids DENSITY) {
        this(a);
        this.liquid = new Liquid(getVolume(), DENSITY);
        fillContainer(liquid);
    }
}
