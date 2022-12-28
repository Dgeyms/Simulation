/*
 * Действия, совершаемые перед стартом симуляции
 */
public class InitActions {
    private GeneratorObject generatorObject;

    public void initActionAll() {

        Map map = new Map();
        // Генерируется на карту камень
        Rock rock = new Rock();
        map.addHashMap(rock);

        // Генерируется на карту деревья
        Tree tree = new Tree();
        map.addHashMap(tree);

        // Генерируется на карту трава
        Grass grass = new Grass();
        map.addHashMap(grass);

        // Генерируется на карту хищники
        Predator predator = new Predator();
        map.addHashMap(predator);

        // Генерируется на карту травоядные
        Herbivore herbivore = new Herbivore();
        map.addHashMap(herbivore);

        map.printMap();
        System.out.println("-----------------------------");
        map.printConsoleMap();



    }


}
