
/*
* Генерация объектов мира
 */
public class GeneratorObject {
    Constant cons = new Constant();
    // Генерация объектов мира
    public int coordinatesX(){
        int coordinatesX = (int) (Math.random() * cons.SIZE_MAP_X);
        return coordinatesX;
    }
    public int coordinatesY(){
        int coordinatesY = (int)(Math.random() * cons.SIZE_MAP_Y);
        return coordinatesY;
    }
}
