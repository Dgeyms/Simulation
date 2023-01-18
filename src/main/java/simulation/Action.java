package simulation;

import simulation.objectmap.*;
import simulation.searchbreadth.Graph;
import simulation.searchbreadth.GoHerbivore;

/*
 * Действия, совершаемые над миром.
 */
public class Action {
    private GeneratorObject generatorObject;
    // Действия, совершаемые перед стартом симуляции (генерация мира)
    Grass grass = new Grass();
    Herbivore herbivore = new Herbivore();
    Rock rock = new Rock();
    Tree tree = new Tree();
    Predator predator = new Predator();
    WorldMap worldMap = new WorldMap();


    public void initActionAll() {
        // Генерируется на карту камень
        worldMap.addHashMap(rock);

        // Генерируется на карту деревья
        worldMap.addHashMap(tree);

        // Генерируется на карту трава
        worldMap.addHashMap(grass);

        // Генерируется на карту хищники
        worldMap.addHashMap(predator);

        // Генерируется на карту травоядные
        worldMap.addHashMap(herbivore);

        // Проверка генерации объектов
        if(worldMap.sizeHashMap() >= 5 ){
            worldMap.printMap();
            System.out.println("-----------------------------");
            worldMap.printConsoleMap();
            System.out.println("-----------------------------");
            System.out.println("P - predator; R - rock; T -tree; H - herbivore; G - grass");
            System.out.println("-----------------------------");
        }else{
            System.out.println("Error in generation. Try again.");
        }

    }
    // Действия, совершаемые каждый ход
    Graph graph = new Graph();
    GoHerbivore goHerbivore = new GoHerbivore();

    public void turnActions(){
        // Травоядное ищет траву
        herbivore.toString();
       goHerbivore.goHerbivore(herbivore); // передаем ссылку на объект herbivore
       // map.MeetObject();
        graph.bfs(herbivore);
    }

    /*
    `simulation.Action` - действие, совершаемое над миром. Например - сходить всеми существами. Это действие итерировало
    бы существ и вызывало каждому `makeMove()`. Каждое действие описывается отдельным классом и совершает операции
    над картой. Симуляция содержит 2 массива действий:

- `initActions` - действия, совершаемые перед стартом симуляции. Пример - расставить объекты и существ на карте
- `turnActions` - действия, совершаемые каждый ход. Примеры - передвижение существ, добавить травы или травоядных, если их осталось слишком мало
     */
}
