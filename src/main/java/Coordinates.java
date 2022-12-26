public class Coordinates{
    Generator generator = new Generator();

    private int coordinateX = generator.coordinatesX();
    private int coordinateY = generator.coordinatesY();
    public Coordinates() {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }

    /* public int getCoordinateX() {
        return getCoordinateX();
    }

    public int getCoordinateY() {
        return getCoordinateY();
    }*/
}
