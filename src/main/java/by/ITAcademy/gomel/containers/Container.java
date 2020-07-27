package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;
import by.ITAcademy.gomel.liquids.Liquid;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public abstract class Container {

    private double volume;
    Liquid liquid = null;

    public Container(double volume) {
        this.volume = volume;
    }

    public Container(double volume, Properties.DensityOfLiquids DENSITY) {
        this.volume = volume;
        fillContainer(DENSITY);

    }
    public Container(double volume, Liquid liquid){
        this.volume = volume;
        fillContainer(liquid);
    }


    public Liquid fillContainer(Properties.DensityOfLiquids DENSITY) {
        this.liquid = new Liquid(this.volume * Properties.OCCUPANCY_OF_CONTAINERS, DENSITY);
        return liquid;
    }

    public Liquid fillContainer(Liquid liquid) {
        if (liquid.getVolume() > this.volume * Properties.OCCUPANCY_OF_CONTAINERS) {
            liquid.setVolume(this.volume * Properties.OCCUPANCY_OF_CONTAINERS);
        }
        this.liquid = liquid;
        return this.liquid;
    }


}
