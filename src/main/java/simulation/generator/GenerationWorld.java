package simulation.generator;

import simulation.WorldMap;
import simulation.objectmap.*;

/*
 * Генерация объектов игрового мира
 */
public class GenerationWorld {
    WorldMap worldMap = new WorldMap();

    public void initActionAll() {
        // Генерируется на карту камень
        //Rock rock = new Rock();
        //worldMap.addHashMap(rock);

        // Генерируется на карту деревья
        //Tree tree = new Tree();
        //worldMap.addHashMap(tree);

        // Генерируется на карту трава
        Grass grass = new Grass();
        worldMap.addHashMap(grass);

        // Генерируется на карту хищники
        Predator predator = new Predator();
        worldMap.addHashMap(predator);

        // Генерируется на карту травоядные
        Herbivore herbivore = new Herbivore();
        worldMap.addHashMap(herbivore);

        // Проверка генерации объектов, если true то игра запускается
        if (worldMap.sizeHashMap() >= 3) {
            worldMap.printMap();
            System.out.println("-----------------------------");
            worldMap.printConsoleMap();
            System.out.println("-----------------------------");
            System.out.println("P - predator; R - rock; T -tree; H - herbivore; G - grass");
            System.out.println("-----------------------------");
        } else {
            System.out.println("Error in generation. Try again.");
        }
    }
}
