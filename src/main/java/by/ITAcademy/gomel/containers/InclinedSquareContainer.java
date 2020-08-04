package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;
import by.ITAcademy.gomel.liquids.Liquid;

public class InclinedSquareContainer extends InclinedContainer {

    public InclinedSquareContainer(double a1, double a2) {
        this.baseSquare1 = a1 * a1;
        this.baseSquare2 = a2 * a2;
    }
    public InclinedSquareContainer(double a1, double a2, Properties.DensityOfLiquids DENSITY) {
        this(a1, a2);
        this.liquid = new Liquid(getVolume(), DENSITY);
        fillContainer(liquid);
    }
}
