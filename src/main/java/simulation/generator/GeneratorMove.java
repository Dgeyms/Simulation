package simulation.generator;

import simulation.Activity;
import simulation.Constant;

import java.util.Random;

/*
 * Генератор шагов травоядного или хищника
 */
public class GeneratorMove {
    private int newCoordinateX;
    private int newCoordinateY;

    Random random = new Random();
    Constant cons = new Constant();

    public GeneratorMove() {
    }


    public void newMoveCoordinates(int coorX, int coorY) {

        // Рандом Х или У (по какой оси делать генерацию шага)
        int randomNumberX_Y = (int) (Math.random() * 2);

        // Рандом новых координат
        int[] arrayNumbers = {-1, 1};
        int randomIndex = random.nextInt(arrayNumbers.length);

        if (randomNumberX_Y == 0) { // рандом новых координат выполняется по Х
            if (coorX < 0) { // Проверка на выход за приделы поля
                newCoordinateX = coorX + 1;
                newCoordinateY = coorY;
            } else if (coorX > cons.getSIZE_MAP_X()) {
                newCoordinateX = coorX - 1;
                newCoordinateY = coorY;
            } else {
                newCoordinateX = arrayNumbers[randomIndex] + coorX;
                newCoordinateY = coorY;
            }

        } else { // рандом новых координат выполняется по У
            if (coorY < 0) { // Проверка на выход за приделы поля
                newCoordinateY = coorY + 1;
                newCoordinateX = coorX;
            } else if (coorY > cons.getSIZE_MAP_Y()) {
                newCoordinateY = coorY - 1;
                newCoordinateX = coorX;
            } else {
                newCoordinateY = arrayNumbers[randomIndex] + coorY;
                newCoordinateX = coorX;
            }
        }


       /* if (numberGeneratorXY == 0) {
            int getNewCoordinateX = generatorMove.makeObjectMove(coorX); // рандом по Х
            System.out.println("newCoor X: " + getNewCoordinateX);

            return getNewCoordinateX;
        } else {
            int getNewCoordinateY = generatorMove.makeObjectMove(coorY); // рандом по У
            System.out.println("newCoor Y: " + getNewCoordinateY);

            return getNewCoordinateY;
        }*/
    }

    @Override
    public String toString() {
        return "GeneratorMove{" +
                "newCoordinateX=" + newCoordinateX +
                ", newCoordinateY=" + newCoordinateY +
                '}';
    }
}
