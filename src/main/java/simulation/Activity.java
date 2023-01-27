package simulation;

import simulation.objectmap.Grass;
import simulation.objectmap.Herbivore;

public class Activity {

    public void turnActions(){
        WorldMap worldMap = new WorldMap();
        worldMap.sizeHashMap();

        // Находим координаты травы в hashMap
        Grass grass = new Grass();
        Object grassCoordinates = worldMap.getKeysByValue(worldMap.hashMap, grass.getSprite());
        System.out.println("Coordinates grass: " + grassCoordinates);

        // Находим координаты травоядного в hashMap
        Herbivore herbivore = new Herbivore();
        Object herbivoreCoordinates = worldMap.getKeysByValue(worldMap.hashMap, herbivore.getSprite());
        System.out.println("Coordinates herbivore: " + herbivoreCoordinates);

        // Ищем кратчайший путь до травы
        Bfs bfs = new Bfs();
        //bfs.bfs(grassCoordinates);

    }
    //ПЛАН реализации
    // Находим координаты травы
    // Находим координаты травоядного
    // Ищем кратчайший путь от травоядного до травы

    /*
    `simulation.Action` - действие, совершаемое над миром. Например - сходить всеми существами. Это действие итерировало
    бы существ и вызывало каждому `makeMove()`. Каждое действие описывается отдельным классом и совершает операции
    над картой. Симуляция содержит 2 массива действий:

- `turnActions` - действия, совершаемые каждый ход. Примеры - передвижение существ, добавить травы или травоядных, если их осталось слишком мало
     */
}
