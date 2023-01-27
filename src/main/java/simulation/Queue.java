package simulation;

import java.util.ArrayList;

public class Queue<T> {
    Constant cons = new Constant();

    // Находим координат X первоночального расположения объекта
    public int searchCoordinateX(Coordinates<T> coordinates) {
        for (int x = 0; x < cons.getSIZE_MAP_X(); x++) {
            for (int y = 0; y < cons.getSIZE_MAP_Y(); y++) {
                if (new Coordinates<T>(x, y).equals(coordinates)) {
                    int coorX = x;
                    int coorY = y;
                    System.out.println(coorX + "," + coorY);
                    return coorX;
                }
            }
        }
        return 0;
    }

    // Находим координат Y первоночального расположения объекта
    public int searchCoordinateY(Coordinates<T> coordinates) {
        for (int x = 0; x < cons.getSIZE_MAP_X(); x++) {
            for (int y = 0; y < cons.getSIZE_MAP_Y(); y++) {
                if (new Coordinates<T>(x, y).equals(coordinates)) {
                    int coorX = x;
                    int coorY = y;
                    System.out.println(coorX + "," + coorY);
                    return coorY;
                }
            }
        }
        return 0;
    }

    ArrayList list = new ArrayList();

    // Обходим соседние ячейки по Х
    public Coordinates<T> identifyAdjacentCellsX(int coorX, int coorY) {
        for (int x = coorX - 1; x < 3; x++) {
            if (x == -1 && x > cons.getSIZE_MAP_X()) {
                break;
            } else {
                return new Coordinates<T>(x, coorY);
            }
        }
        return null;
    }

    // Идентифицируем соседние ячейки по Y
    public Coordinates<T> identifyAdjacentCellsY(int coorX, int coorY) {
        for (int y = coorY - 1; y < 3; y++) {
            if (y == -1 && y > cons.getSIZE_MAP_Y()) {
                break;
            } else {
                return new Coordinates<T>(coorX, y);
            }
        }
        return null;
    }

    // Вставляем объекты в очередь
    /*public void insertQueue(Coordinates coordinates1) {
        list.add(coordinates1);
    }*/
}


