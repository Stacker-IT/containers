package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;
import by.ITAcademy.gomel.liquids.Liquid;

public class StraightCircleContainer extends StraightEllipseContainer {
    public StraightCircleContainer(double a) {
        super(a, a);
    }
    public StraightCircleContainer(double a, Properties.DensityOfLiquids DENSITY){
        this(a);
        this.liquid = new Liquid(getVolume(), DENSITY);
        fillContainer(liquid);
    }
}
