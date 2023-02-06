package simulation.objectmap;

import simulation.Coordinates;
import simulation.generator.GeneratorCoordinates;
import simulation.generator.GeneratorMove;

/*
 * Абстрактный класс для всех существ и объектов существующих в симуляции
 */
abstract public class Entity {
    public Coordinates coordinates;

    protected int coordinatesX;
    protected int coordinatesY;
    GeneratorCoordinates go = new GeneratorCoordinates();

    public Entity() {
        coordinatesX = go.coordinatesX();
        coordinatesY = go.coordinatesY();
    }

    public Entity(int coordinatesX, int coordinatesY) {
        coordinates = new Coordinates(coordinatesX, coordinatesY);
    }

    abstract public String getSprite();


}
