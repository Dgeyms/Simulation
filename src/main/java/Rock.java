/*
* Объект камни
 */
public class Rock extends Entity{
    private String rocks = "W";

    public Rock(int setCoordinatesX, int setCoordinatesY) {
        super(setCoordinatesX, setCoordinatesY);
    }

    public String getRocks() {
        return rocks;
    }

  @Override
    public String toString() {
        return "Rock{" +
                "coordinatesX=" + coordinatesX +
                ", coordinatesY=" + coordinatesY +
                '}';
    }
}
