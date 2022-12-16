/*
* Объект камни
 */
public class Rock extends Entity{
    private String rocks = "R";

    public Rock(int setCoordinatesX, int setCoordinatesY) {
        super(setCoordinatesX, setCoordinatesY);
    }

    public String getRocks() {
        return rocks;
    }

    @Override
    public String toString() {
        return "Rock{" +
                "Rock='" + rocks + '\'' +
                ", coordinatesX=" + coordinatesX +
                ", coordinatesY=" + coordinatesY +
                '}';
    }
}
