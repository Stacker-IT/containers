package by.ITAcademy.gomel.containers;

import by.ITAcademy.gomel.Properties;
import by.ITAcademy.gomel.liquids.Liquid;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public abstract class Container {

//    private double volume;
    Liquid liquid = null;
    protected Container(){}

    public abstract Liquid fillContainer(Liquid liquid);


}
