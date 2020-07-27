package by.ITAcademy.gomel;

import by.ITAcademy.gomel.liquids.Liquid;

public class Filler {
    public static void main(String[] args) {
        Liquid liquid = new Liquid(10, Liquid.DensityOfLiquids.KEROSENE);
        System.out.println(liquid);
    }
}
