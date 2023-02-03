package simulation;

import java.util.Random;

/*
* Объект делает шаг назад, натыкаясь на припятствия
 */
public class StepBack {
    private int newCoordinateX;
    private int newCoordinateY;

    SearchCoordinatesInHashMap searchCoordinatesInHashMap = new SearchCoordinatesInHashMap();


    public Coordinates stepBack(Coordinates object) {

        int coorX = searchCoordinatesInHashMap.searchCoordinateX(object);
        int coorY = searchCoordinatesInHashMap.searchCoordinateY(object);

       newCoordinateX = coorX + 1;
       newCoordinateY = coorY;


        return new Coordinates(newCoordinateX, newCoordinateY);
    }
}
