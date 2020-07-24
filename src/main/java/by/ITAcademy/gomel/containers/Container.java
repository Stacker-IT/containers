package by.ITAcademy.gomel.containers;

import lombok.Data;

@Data
public abstract class Container {
    private double volume;
    private double filledVolume;
    private final double HEIGHT = 1;


}
