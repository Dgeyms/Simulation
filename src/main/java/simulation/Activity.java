package simulation;

import simulation.generator.GeneratorMove;
import simulation.objectmap.Grass;
import simulation.objectmap.Herbivore;

public class Activity {
    private boolean trueGrassHerbivore = true;
    private boolean trueRockHerbivore = false;
    Herbivore herbivore = new Herbivore();


    public void turnActions() {
        WorldMap worldMap = new WorldMap();
        CoordinatesObject coordinatesObject = new CoordinatesObject();
        GeneratorMove generatorMove = new GeneratorMove();
        // ------------------ Движение травоядного за травой -------------------

        while (trueGrassHerbivore){
            Coordinates herbivoreCoordinates = worldMap.getKeysByValue(herbivore.getSprite());

            trueGrassHerbivore = coordinatesObject.grassCoordinates.equals(herbivoreCoordinates);

            if (trueRockHerbivore) { //true
               // Coordinates newCoordinates = generatorMove.newMoveCoordinates(coordinatesObject.herbivoreCoordinates); // Получаем новые координаты
                //worldMap.addHashMapNewCoordinate(newCoordinates); // Отправляем новые координаты в HashMap
               // worldMap.hashMap.remove(coordinatesObject.herbivoreCoordinates); // Удаляем старые координаты

            } else if (!trueGrassHerbivore) { //false
                Coordinates newCoordinates = generatorMove.newMoveCoordinates(herbivoreCoordinates); // Получаем новые координаты (следующий ход)
                worldMap.addHashMapNewCoordinate(newCoordinates); // Отправляем новые координаты
                worldMap.deleteHashMap(herbivoreCoordinates); // Удаляем старые координаты

                //System.out.println(generatorMove.toString()); // удалить
                // Меняем старые координаты на новые

                System.out.println("----------------------------");
                worldMap.printMap();
                worldMap.printConsoleMap();
                trueGrassHerbivore = true;
            }else{
                worldMap.hashMap.remove(coordinatesObject.grassCoordinates); // Удаляем траву
                System.out.println("Grass eat");
                trueGrassHerbivore = false;
            }
           // trueRockHerbivore = coordinatesObject.rockCoordinates.equals(herbivoreCoordinates);

        }
    }
}
