/*
 * Действия, совершаемые перед стартом симуляции
 */
public class InitActions {
    private Generator generator;

    public void initActionAll() {

        Map map = new Map();
        // Добавляем в Map камень
        Rock rock = new Rock();
        map.addHashMap(rock);

        // Добавляем в Map деревья
        Tree tree = new Tree();
        map.addHashMap(tree);

        // Добавляем в Map траву
        Grass grass = new Grass();
        map.addHashMap(grass);

        // Генерация хищников
        Predator predator = new Predator();
        map.addHashMap(predator);

        // Генерация травоядных
        Herbivore herbivore = new Herbivore();
        map.addHashMap(herbivore);

        map.printMap();
        map.printConsoleMap();



    }


}
