package simulation;

import simulation.generator.GeneratorMove;
import simulation.objectmap.Grass;
import simulation.objectmap.Herbivore;

public class Activity {

    public void turnActions(){
        WorldMap worldMap = new WorldMap();
        worldMap.sizeHashMap(); // проверка сколько объектов в hashMap

        // Находим объект трава в hashMap
        Grass grass = new Grass();
        Coordinates grassCoordinates = worldMap.getKeysByValue(grass.getSprite());
        System.out.println("Coordinates grass: " + grassCoordinates);

        // Находим объект травоядного в hashMap
        Herbivore herbivore = new Herbivore();
        Coordinates herbivoreCoordinates = worldMap.getKeysByValue(herbivore.getSprite());
        System.out.println("Coordinates herbivore: " + herbivoreCoordinates);

        // Находим координаты X и Y объекта (травоядного)
        SearchCoordinatesInHashMap searchCoordinatesInHashMap = new SearchCoordinatesInHashMap();
        int coorX = searchCoordinatesInHashMap.searchCoordinateX(herbivoreCoordinates);
        int coorY = searchCoordinatesInHashMap.searchCoordinateY(herbivoreCoordinates);

        // Генерируем ход травоядного
        GeneratorMove generatorMove = new GeneratorMove();

        int numberOne_Two = generatorMove.makeGeneratorX_Y(); // рандом 1 или 2
        if(numberOne_Two == 0){
            int getNewCoordinateX = generatorMove.makeObjectMove(coorX); // рандом по Х
            System.out.println("newCoor X: " + getNewCoordinateX);
        }else {
            int getNewCoordinateY = generatorMove.makeObjectMove(coorY); // рандом по У
            System.out.println("newCoor Y: " + getNewCoordinateY);
        }



       /* // Ищем кратчайший путь до травы
        Bfs bfs = new Bfs();
        bfs.identifyAdjacentCellsX(coorX, coorY); // Обходим соседние ячейки по Х
        bfs.identifyAdjacentCellsY(coorX, coorY); // Обходим соседние ячейки по Y
        */

        //bfs.bfs(coorX, coorY, grassCoordinates);

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
