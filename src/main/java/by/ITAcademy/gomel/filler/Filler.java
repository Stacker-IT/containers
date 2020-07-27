package by.ITAcademy.gomel.filler;

import by.ITAcademy.gomel.containers.Container;
import by.ITAcademy.gomel.liquids.Liquid;

public class Filler {
    Filler filler;

    private Filler() {
    }

    public Filler getFiller(){
        if (filler==null) filler = new Filler();
        return filler;
    }
    public Liquid fillContainer(Liquid.DensityOfLiquids DENSITY, Container container){



        return liquid;
    }
}
