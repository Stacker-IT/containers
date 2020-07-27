package by.ITAcademy.gomel.liquids;

import by.ITAcademy.gomel.Properties;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
//@AllArgsConstructor

public class Liquid {

    private final Properties.DensityOfLiquids DENSITY;
    private double volume;

    public Liquid(double volume, Properties.DensityOfLiquids DENSITY) {
        this.volume = volume;
        this.DENSITY = DENSITY;
    }

    public double getWeight(){
        return volume * DENSITY.getDensity();
    }
}
