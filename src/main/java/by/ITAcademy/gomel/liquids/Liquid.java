package by.ITAcademy.gomel.liquids;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
//@AllArgsConstructor

public class Liquid {
    public enum DensityOfLiquids {
        DEFAULT(1000),
        PETROL(740),
        KEROSENE(820),
        ENGINE_OIL(910);
        private int density;
        DensityOfLiquids(int density){
            this.density = density;
        }
    }
    private final DensityOfLiquids DENSITY;
    private double volume;

    public Liquid(double volume, DensityOfLiquids DENSITY) {
        this.volume = volume;
        this.DENSITY = DENSITY;
    }
}
