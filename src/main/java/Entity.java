/*
 * Абстрактный класс для всех существ и объектов существующих в симуляции
 */
public class Entity {
    String rocks;
    protected int coordinatesX;
    protected int coordinatesY;

    public Entity(int X, int Y) {
        coordinatesX = X;
        coordinatesY = Y;
    }

    public Entity() {

    }

    public int getCoordinatesX() {
        return coordinatesX;
    }
    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }
    public int getCoordinatesY() {
        return coordinatesY;
    }
    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

}
