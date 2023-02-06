package simulation.generator;

import simulation.Constant;
import simulation.Coordinates;
import simulation.SearchCoordinatesInHashMap;

import java.util.Random;

/*
 * Генератор шагов травоядного или хищника (по оси Х или У) и (один шаг от места где стоишь)
 */
public class GeneratorMove {
    private int newCoordinateX;
    private int newCoordinateY;

    Random random = new Random();
    Constant cons = new Constant();

    SearchCoordinatesInHashMap searchCoordinatesInHashMap = new SearchCoordinatesInHashMap();


    public Coordinates newMoveCoordinates(Coordinates object) {

        int coorX = searchCoordinatesInHashMap.searchCoordinateX(object);
        int coorY = searchCoordinatesInHashMap.searchCoordinateY(object);

        // Рандом Х или У (по какой оси делать генерацию шага), Х = 0, У > 0
        int randomNumberX_Y = (int) (Math.random() * 2);

        // Рандом новых координат
        int[] arrayNumbers = {-1, 1};
        int randomIndex = random.nextInt(arrayNumbers.length);

        if (randomNumberX_Y == 0) { // рандом новых координат выполняется по Х
            if (coorX <= 0) { // Проверка на выход за приделы поля
                newCoordinateX = coorX + 1;
                newCoordinateY = coorY;
            } else if (coorX >= cons.getSIZE_MAP_X()) {
                newCoordinateX = coorX - 1;
                newCoordinateY = coorY;
            } else {
                newCoordinateX = arrayNumbers[randomIndex] + coorX;
                newCoordinateY = coorY;
            }

        } else { // рандом новых координат выполняется по У
            if (coorY <= 0) { // Проверка на выход за приделы поля
                newCoordinateY = coorY + 1;
                newCoordinateX = coorX;
            } else if (coorY >= cons.getSIZE_MAP_Y()) {
                newCoordinateY = coorY - 1;
                newCoordinateX = coorX;
            } else {
                newCoordinateY = arrayNumbers[randomIndex] + coorY;
                newCoordinateX = coorX;
            }
        }

        return new Coordinates(newCoordinateX, newCoordinateY);
    }

    @Override
    public String toString() {
        return "GeneratorMove{" +
                "newCoordinateX=" + newCoordinateX +
                ", newCoordinateY=" + newCoordinateY +
                '}';
    }
}
