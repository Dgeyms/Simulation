package simulation;

import simulation.generator.GeneratorMove;
import simulation.objectmap.Herbivore;
import simulation.objectmap.Predator;

public class MovementObjects {
    //private boolean trueGrassHerbivore = true;
    //private boolean truePredatorHerbivore;
    private boolean everybodyIsAlive = true;
    WorldMap worldMap = new WorldMap();
    Herbivore herbivore = new Herbivore();
    Predator predator = new Predator();
    CoordinatesObject coordinatesObject = new CoordinatesObject();
    GeneratorMove generatorMove = new GeneratorMove();


    public void movementObjects() {

        // ------------------ Движение травоядного -------------------
        int total = 0;
        while (everybodyIsAlive) {
            Coordinates herbivoreCoordinates = coordinatesObject.herbivoreCoordinates;
            Coordinates predatorCoordinates = predatorCoordinates();

            boolean trueGrassHerbivore = coordinatesObject.grassCoordinates.equals(herbivoreCoordinates); // сравниваем объект трава и травоядного
            boolean truePredatorHerbivore = predatorCoordinates.equals(herbivoreCoordinates); // сравниваем объект травоядного и хищника

            //trueRockHerbivore = coordinatesObject.rockCoordinates.equals(herbivoreCoordinates);
            //trueTreeCoordinates = coordinatesObject.treeCoordinates.equals(herbivoreCoordinates);


            if (!trueGrassHerbivore & !truePredatorHerbivore) { //false
                Coordinates newCoordinatesHerbivore = generatorMove.newMoveCoordinates(herbivoreCoordinates); // Получаем новые координаты (следующий ход)
                worldMap.addHashMapNewCoordinate(newCoordinatesHerbivore); // Отправляем новые координаты
                worldMap.deleteHashMap(herbivoreCoordinates); // Удаляем старые координаты
                System.out.println("----------------------------");
                //worldMap.printMap();
                worldMap.printConsoleMap();
                everybodyIsAlive = true;
            }else if (trueGrassHerbivore){
                worldMap.hashMap.remove(coordinatesObject.grassCoordinates); // Удаляем траву
                System.out.println("Grass eat");
                everybodyIsAlive = false;
            }else{
                //worldMap.deleteHashMap(herbivoreCoordinates);
                worldMap.hashMap.remove(coordinatesObject.herbivoreCoordinates); // Удаляем травоядного
                System.out.println("Herbivore eat");
                everybodyIsAlive = false;
            }
            total = total + 1;
        }
        System.out.println("Total cycles: " + total);
    }

    //--------------------------private---------------------

    private Coordinates predatorCoordinates() {
        return worldMap.getKeysByValue(predator.getSprite()); //Находим объект хищник в hashMap
    }

}
