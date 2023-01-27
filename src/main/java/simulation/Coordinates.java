package simulation;

public class Coordinates<hashCode> {
    //public boolean wasVisited;
    GeneratorCoordinates generatorObject = new GeneratorCoordinates();

    private int coordinateX = generatorObject.coordinatesX();
    private int coordinateY = generatorObject.coordinatesY();

    public Coordinates() {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Coordinates(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    @Override
    public String toString() {
        return "simulation.Coordinates{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinates<?> that = (Coordinates<?>) o;

        if (coordinateX != that.coordinateX) return false;
        return coordinateY == that.coordinateY;
    }

    @Override
    public int hashCode() {
        int result = coordinateX;
        result = 31 * result + coordinateY;
        return result;
    }
}