/*
* Трава
 */
public class Grass extends Entity {
    private String grass = "G";

    public Grass(int coordinatesX, int coordinatesY){
        super(coordinatesX, coordinatesY);
    }
    public String getGrass(){
        return grass;
    }

    @Override
    public String toString() {
        return "Grass{" +
                "coordinatesX=" + coordinatesX +
                ", coordinatesY=" + coordinatesY +
                '}';
    }
}
