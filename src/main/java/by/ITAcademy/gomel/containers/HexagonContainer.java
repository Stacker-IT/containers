package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;
import by.ITAcademy.gomel.liquids.Liquid;

public class HexagonContainer extends Container {
    public HexagonContainer(double a1, double a2) {
        this.baseSquare1 = a1 * a1 * Math.sqrt(27) / 2;
        this.baseSquare2 = a2 * a2 * Math.sqrt(27) / 2;
    }

    public HexagonContainer(double a1, double a2, Properties.DensityOfLiquids DENSITY) {
        this(a1, a2);
        this.liquid = new Liquid(getVolume(), DENSITY);
        fillContainer(liquid);
    }

    public HexagonContainer(double a) {
        this(a, a);
    }

    public HexagonContainer(double a, Properties.DensityOfLiquids DENSITY) {
        this(a, a, DENSITY);
    }
}
