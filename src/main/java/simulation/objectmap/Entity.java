package simulation.objectmap;

import simulation.generator.GeneratorCoordinates;
import simulation.generator.GeneratorMove;

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

    public Entity(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }

    abstract public String getSprite();


}
