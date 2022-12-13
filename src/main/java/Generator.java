import java.util.Random;

/*
* Генерация объектов мира
 */
public class Generator {
    Constant cons = new Constant();
    // Генерация объектов мира
    public int CoordinatesX(){
        int CoordinatesX = (int) (Math.random() * cons.SIZE_MAP_X);
        return CoordinatesX;
    }
    public int CoordinatesY(){
        int coordinatesY = (int)(Math.random() * cons.SIZE_MAP_Y);
        return coordinatesY;
    }
}
