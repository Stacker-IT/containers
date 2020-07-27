package by.ITAcademy.gomel;

public class Properties {
    public enum DensityOfLiquids {
        DEFAULT(1000),
        PETROL(740),
        KEROSENE(820),
        ENGINE_OIL(910);
        private int density;
        DensityOfLiquids(int density){
            this.density = density;
        }
    }

    public static final double HEIGHT_OF_CONTAINERS = 1;
    public static final double OCCUPANCY_OF_CONTAINERS = 0.95;

}
