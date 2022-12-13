/*
 * Абстрактный класс для всех существ и объектов существующих в симуляции
 */
public abstract class Entity {

    private String tree;
    private String grass;
    private int coordinatesX;
    private int coordinatesY;

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
