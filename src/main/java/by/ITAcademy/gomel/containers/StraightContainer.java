package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;
import by.ITAcademy.gomel.liquids.Liquid;
import lombok.Data;

@Data
public abstract class StraightContainer extends Container{
    protected double baseSquare;

    public Liquid fillContainer(Properties.DensityOfLiquids DENSITY) {
        this.liquid = new Liquid(getVolume() * Properties.OCCUPANCY_OF_CONTAINERS, DENSITY);
        return liquid;
    }

    public Liquid fillContainer(Liquid liquid) {
        if (liquid.getVolume() > getVolume() * Properties.OCCUPANCY_OF_CONTAINERS) {
            liquid.setVolume(getVolume() * Properties.OCCUPANCY_OF_CONTAINERS);
        }
        this.liquid = liquid;
        return this.liquid;
    }

    public double getVolume(){
        return baseSquare* Properties.HEIGHT_OF_CONTAINERS;
    }

}
