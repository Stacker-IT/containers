package by.ITAcademy.gomel;

import by.ITAcademy.gomel.containers.Container;
import by.ITAcademy.gomel.liquids.Liquid;

public class Filler {
    public static void main(String[] args) {
        Liquid liquid = new Liquid(10, Properties.DensityOfLiquids.KEROSENE);
        System.out.println(liquid);
    }
}
