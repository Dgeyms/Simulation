package simulation;

import simulation.generator.GeneratorMove;
import simulation.objectmap.Grass;
import simulation.objectmap.Herbivore;
import simulation.objectmap.Rock;
import simulation.objectmap.Tree;

public class Activity {
    private boolean trueGrassHerbivore = true;
    private boolean trueRockHerbivore;
    private boolean trueTreeCoordinates;

    Herbivore herbivore = new Herbivore();
    Rock rock = new Rock();
    Tree tree = new Tree();
    WorldMap worldMap = new WorldMap();
    CoordinatesObject coordinatesObject = new CoordinatesObject();
    GeneratorMove generatorMove = new GeneratorMove();
    StepBack sterBack = new StepBack();

    public void turnActions() {

        // ------------------ Движение травоядного за травой -------------------
        int total = 0;
        while (trueGrassHerbivore) {
            Coordinates herbivoreCoordinates = herbivoreCoordinates();

            trueGrassHerbivore = coordinatesObject.grassCoordinates.equals(herbivoreCoordinates);
            //trueRockHerbivore = coordinatesObject.rockCoordinates.equals(herbivoreCoordinates);
            //trueTreeCoordinates = coordinatesObject.treeCoordinates.equals(herbivoreCoordinates);

            if (trueRockHerbivore || trueTreeCoordinates) { //true
                //Coordinates newCoordinates = generatorMove.newMoveCoordinates(herbivoreCoordinates); // Получаем новые координаты
                //worldMap.addHashMapNewCoordinate(newCoordinates); // Отправляем новые координаты
                //worldMap.deleteHashMap(herbivoreCoordinates); // Удаляем старые координаты

                trueGrassHerbivore = true;

            } else if (!trueGrassHerbivore) { //false
                Coordinates newCoordinates = generatorMove.newMoveCoordinates(herbivoreCoordinates); // Получаем новые координаты (следующий ход)
                worldMap.addHashMapNewCoordinate(newCoordinates); // Отправляем новые координаты
                worldMap.deleteHashMap(herbivoreCoordinates); // Удаляем старые координаты

                System.out.println("----------------------------");
                //worldMap.printMap();
                worldMap.printConsoleMap();
                trueGrassHerbivore = true;
            } else {
                worldMap.hashMap.remove(coordinatesObject.grassCoordinates); // Удаляем траву
                System.out.println("Grass eat");
                trueGrassHerbivore = false;
            }
            total = total + 1;
            //System.out.println("Move: " + total);

        }
        System.out.println("Total cycles: " + total);
    }

    //--------------------------private---------------------
    private Coordinates herbivoreCoordinates() {
        return worldMap.getKeysByValue(herbivore.getSprite()); //Находим объект травоядного в hashMap
    }
}
