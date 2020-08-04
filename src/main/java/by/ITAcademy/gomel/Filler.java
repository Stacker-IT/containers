package by.ITAcademy.gomel;

import by.ITAcademy.gomel.containers.*;
import by.ITAcademy.gomel.liquids.Liquid;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Filler {
    public static void main(String[] args) {
        InclinedContainer container = new InclinedCircleContainer(3, 4, Properties.DensityOfLiquids.KEROSENE);
        StraightContainer container1 = new StraightCircleContainer(4, Properties.DensityOfLiquids.ENGINE_OIL);
        StraightContainer container2 = new StraightHexagonContainer(6, Properties.DensityOfLiquids.PETROL);
        InclinedContainer container3 = new InclinedTrapezeContainer(4, 5, 6, 7, 5, 8, Properties.DensityOfLiquids.PETROL);
        InclinedContainer container4 = new InclinedRectangleContainer(4, 6, 3, 2, Properties.DensityOfLiquids.KEROSENE);
        ArrayList<Container> containers = new ArrayList<Container>();
        ContainerComparator containerComparator = new ContainerComparator();
        containers.add(container);
        System.out.println(container);
        containers.add(container1);
        containers.add(container2);
        containers.add(container3);
        containers.add(container4);

        containers.sort(containerComparator);

    }
}
