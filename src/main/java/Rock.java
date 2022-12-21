/*
* Объект камни
 */
public class Rock extends Entity{

    private String rocks = "W";
    public Rock(int setCoordinatesX, int setCoordinatesY) {
        super(setCoordinatesX, setCoordinatesY);
    }

    public Rock(String r) {
        super();
        rocks = r;
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
