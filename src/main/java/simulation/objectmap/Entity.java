package simulation.objectmap;

import simulation.GeneratorObjectWorld;

/*
 * Абстрактный класс для всех существ и объектов существующих в симуляции
 */
abstract public class Entity {

    protected int coordinatesX;
    protected int coordinatesY;
GeneratorObjectWorld go = new GeneratorObjectWorld();
    public Entity() {
        this.coordinatesX = go.coordinatesX();
        this.coordinatesY = go.coordinatesY();
    }

    abstract public String getSprite();

}
