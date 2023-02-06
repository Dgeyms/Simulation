package simulation;

import simulation.objectmap.Grass;
import simulation.objectmap.Herbivore;
import simulation.objectmap.Rock;
import simulation.objectmap.Tree;

/*
* Находим координаты Х и У объектов по значению из HashMap
 */
public class CoordinatesObject {
    WorldMap worldMap = new WorldMap();
    Grass grass = new Grass();
    Herbivore herbivore = new Herbivore();
    Rock rock = new Rock();
    Tree tree = new Tree();

    // Находим объект трава в hashMap
    Coordinates grassCoordinates = worldMap.getKeysByValue(grass.getSprite());

    //Находим объект травоядного в hashMap
     Coordinates herbivoreCoordinates = worldMap.getKeysByValue(herbivore.getSprite());

    // Находим объект камень в hashMap
    Coordinates rockCoordinates = worldMap.getKeysByValue(rock.getSprite());

    // Находим объект дерево в hashMap
    Coordinates treeCoordinates = worldMap.getKeysByValue(tree.getSprite());
}
