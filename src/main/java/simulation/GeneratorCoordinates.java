package simulation;

/*
* Генерация объектов мира
 */
public class GeneratorCoordinates {
    Constant cons = new Constant();
    // Генерация координат объектов мира
    public int coordinatesX(){
        int coordinatesX = (int) (Math.random() * cons.getSIZE_MAP_X());
        return coordinatesX;
    }
    public int coordinatesY(){
        int coordinatesY = (int)(Math.random() * cons.getSIZE_MAP_Y());
        return coordinatesY;
    }
}
