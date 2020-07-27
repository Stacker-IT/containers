package by.ITAcademy.gomel;

import by.ITAcademy.gomel.containers.Container;
import by.ITAcademy.gomel.containers.StraightHexagonContainer;
import by.ITAcademy.gomel.containers.StraightSquareContainer;
import by.ITAcademy.gomel.liquids.Liquid;

public class Filler {
    public static void main(String[] args) {
        Liquid liquid = new Liquid(10, Properties.DensityOfLiquids.KEROSENE);
        Container container = new StraightSquareContainer(2);
        System.out.println(liquid);
        container.fillContainer(liquid);
        System.out.println(liquid);
        System.out.println(container);
        System.out.println(container.getLiquid().getWeight());
    }
}
