package simulation;

/*
* Находим координат первоночального (сгенерированные) расположения объекта
 */

public class SearchCoordinatesInHashMap {
    Constant cons = new Constant();

    // Находим координат X первоночального расположения объекта
    public int searchCoordinateX(Coordinates her) {
        for (int x = 0; x < cons.getSIZE_MAP_X(); x++) {
            for (int y = 0; y < cons.getSIZE_MAP_Y(); y++){
                if (new Coordinates(x, y).equals(her)) {
                    int coorX = x;
                    int coorY = y;
                    return coorX;
                }
            }
        }
        return 0;
    }

    // Находим координат Y первоночального расположения объекта
    public int searchCoordinateY(Coordinates her) {
        for (int x = 0; x < cons.getSIZE_MAP_X(); x++) {
            for (int y = 0; y < cons.getSIZE_MAP_Y(); y++) {
                if (new Coordinates(x, y).equals(her)) {
                    int coorX = x;
                    int coorY = y;
                    return coorY;
                }
            }
        }
        return 0;
    }
}
