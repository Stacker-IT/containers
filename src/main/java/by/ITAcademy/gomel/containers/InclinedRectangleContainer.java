package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;
import by.ITAcademy.gomel.liquids.Liquid;

public class InclinedRectangleContainer extends InclinedContainer {
    public InclinedRectangleContainer(double a1, double b1, double a2, double b2) {
        this.baseSquare1 = a1 * b1;
        this.baseSquare2 = a2 * b2;
    }


        public InclinedRectangleContainer(double a1, double b1, double a2, double b2, Properties.DensityOfLiquids DENSITY) {
            this(a1, b1, a2, b2);
            this.liquid = new Liquid(getVolume(), DENSITY);
            fillContainer(liquid);
        }


}
