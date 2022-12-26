import java.util.Objects;

public class Coordinates<hashCode> {
    Generator generator = new Generator();

    private int coordinateX = generator.coordinatesX();
    private int coordinateY = generator.coordinatesY();
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
        return "Coordinates{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
