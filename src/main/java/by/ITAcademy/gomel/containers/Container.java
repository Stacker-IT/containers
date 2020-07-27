package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.liquids.Liquid;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Container {
    private final double HEIGHT = 1;
    private final double OCCUPANCY = 0.95;

    private double volume;
    private double filledVolume;
    
    public Liquid fillContainer(Liquid.DensityOfLiquids DENSITY){
        Liquid liquid = new Liquid(10, DENSITY);



        return liquid;
    }



}
