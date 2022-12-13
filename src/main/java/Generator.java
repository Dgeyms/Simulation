import java.util.Random;

/*
* Генерация объектов мира
 */
public class Generator {
    Constant cons = new Constant();
    // Генерация камней
    public int rockCoordinatesX(){
        int i = (int) (Math.random() * cons.SIZE_MAP_X);
        return i;
    }
    public int rockCoordinatesY(){
        return (int)(Math.random() * cons.SIZE_MAP_Y);
    }
}
