package by.ITAcademy.gomel.containers;

import java.util.Comparator;

public class ContainerComparator implements Comparator<Container> {
    public int compare(Container o1, Container o2) {
        return (int) (100*(o1.liquid.getWeight()-o2.liquid.getWeight()));
    }
}
