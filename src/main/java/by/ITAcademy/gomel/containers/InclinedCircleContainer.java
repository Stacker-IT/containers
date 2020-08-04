package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;
import by.ITAcademy.gomel.liquids.Liquid;

public class InclinedCircleContainer extends InclinedEllipseContainer {
    public InclinedCircleContainer(double a1, double a2) {
        super(a1, a1, a2, a2);
    }

    public InclinedCircleContainer
            (double a1, double a2, Properties.DensityOfLiquids DENSITY) {
        this(a1, a2);
        this.liquid = new Liquid(getVolume(),DENSITY);
        fillContainer(liquid);
    }

    @Override
    public String toString() {
        return "InclinedCircleContainer{" +
                "baseSquare1=" + baseSquare1 +
                ", baseSquare2=" + baseSquare2 +
                ", liquid=" + liquid +
                '}';
    }
}
