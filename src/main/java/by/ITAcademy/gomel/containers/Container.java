package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;
import by.ITAcademy.gomel.liquids.Liquid;
import lombok.Data;

@Data
public abstract class Container {

    Liquid liquid = null;

    protected Container() {
    }

    protected double baseSquare1;
    protected double baseSquare2;


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

    public double getVolume() {
        return (baseSquare1 + Math.sqrt(baseSquare1 * baseSquare2) + baseSquare2)
                * Properties.HEIGHT_OF_CONTAINERS / 3;
    }


    @Override
    public String toString() {
        return "| type: " + String.format("%-18s", this.getClass().getSimpleName()) + " | " +
                "base square1: " + String.format("%5.2f", baseSquare1) + " | " +
                "base square2: " + String.format("%5.2f", baseSquare2) + " | " +
                "volume: " + String.format("%-5.2f", getVolume()) + " | " +
                "liquid: " + String.format("%-10s", liquid.getDENSITY()) + " | " +
                "liquid volume: " + String.format("%-5.2f", liquid.getVolume()) + " | " +
                "liquid weight: " + String.format("%-8.2f", liquid.getWeight()) + " | ";
    }
}
