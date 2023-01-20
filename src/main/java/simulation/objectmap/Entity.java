package simulation.objectmap;

/*
 * Абстрактный класс для всех существ и объектов существующих в симуляции
 */
abstract public class Entity {

    String rocks;
    protected int coordinatesX;
    protected int coordinatesY;

    abstract public String getSprite();

}
