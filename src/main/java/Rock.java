/*
* Объект камни
 */
public class Rock extends Entity{
    private String Rock = "R";

    public Rock(int setCoordinatesX, int setCoordinatesY, String rock) {
        setCoordinatesX(setCoordinatesX);
        setCoordinatesY(setCoordinatesY);
        Rock = rock;
    }


}
