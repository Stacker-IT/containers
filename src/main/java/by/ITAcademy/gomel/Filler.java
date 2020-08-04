package by.ITAcademy.gomel;

import by.ITAcademy.gomel.containers.*;

import java.util.ArrayList;

public class Filler {
    public static void main(String[] args) {

        Container container1 = new CircleContainer(2, Properties.DensityOfLiquids.KEROSENE);
        Container container2 = new EllipseContainer(2, 4, Properties.DensityOfLiquids.PETROL);
        Container container3 = new CircleContainer(2, 3, Properties.DensityOfLiquids.ENGINE_OIL);
        Container container4 = new RectangleContainer(4, 5, Properties.DensityOfLiquids.ENGINE_OIL);
        Container container5 = new TrapezeContainer(2, 3, 4, 3, 4, 5, Properties.DensityOfLiquids.PETROL);
        Container container6 = new TrapezeContainer(3, 4, 5, Properties.DensityOfLiquids.KEROSENE);
        Container container7 = new SquareContainer(6, Properties.DensityOfLiquids.PETROL);
        Container container8 = new SquareContainer(4, 5, Properties.DensityOfLiquids.ENGINE_OIL);
        Container container9 = new HexagonContainer(6, Properties.DensityOfLiquids.PETROL);
        Container container10 = new HexagonContainer(5, 6, Properties.DensityOfLiquids.PETROL);

        ContainerComparator containerComparator = new ContainerComparator();

        ArrayList<Container> containers = new ArrayList<>();

        containers.add(container1);
        containers.add(container2);
        containers.add(container3);
        containers.add(container4);
        containers.add(container5);
        containers.add(container6);
        containers.add(container7);
        containers.add(container8);
        containers.add(container9);
        containers.add(container10);

//        for (Container cntr:containers
//        ) {
//            System.out.println(cntr);
//        }
//        System.out.println();

        containers.sort(containerComparator);

        for (Container cntr:containers
             ) {
            System.out.println(cntr);
        }

    }
}
