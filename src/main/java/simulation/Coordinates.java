package simulation;

import java.util.Objects;

public class Coordinates<hashCode> {
    public boolean wasVisited;
    GeneratorObject generatorObject = new GeneratorObject();

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates<?> that = (Coordinates<?>) o;
        return coordinateX == that.coordinateX && coordinateY == that.coordinateY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinateX, coordinateY);
    }

    @Override
    public String toString() {
        return "simulation.Coordinates{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
