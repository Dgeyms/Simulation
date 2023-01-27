package simulation.objectmap;

import simulation.GeneratorCoordinates;

/*
 * Абстрактный класс для всех существ и объектов существующих в симуляции
 */
abstract public class Entity {

    protected int coordinatesX;
    protected int coordinatesY;
GeneratorCoordinates go = new GeneratorCoordinates();
    public Entity() {
        this.coordinatesX = go.coordinatesX();
        this.coordinatesY = go.coordinatesY();
    }

    abstract public String getSprite();

}
