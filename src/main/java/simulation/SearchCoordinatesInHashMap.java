package simulation;

public class SearchCoordinatesInHashMap {
    Constant cons = new Constant();

    // Находим координат X первоночального расположения объекта
    public int searchCoordinateX(Coordinates coordinates) {
        for (int x = 0; x < cons.getSIZE_MAP_X(); x++) {
            for (int y = 0; y < cons.getSIZE_MAP_Y(); y++) {
                if (new Coordinates(x, y).equals(coordinates)) {
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
    public int searchCoordinateY(Coordinates coordinates) {
        for (int x = 0; x < cons.getSIZE_MAP_X(); x++) {
            for (int y = 0; y < cons.getSIZE_MAP_Y(); y++) {
                if (new Coordinates(x, y).equals(coordinates)) {
                    int coorX = x;
                    int coorY = y;
                    System.out.println(coorX + "," + coorY);
                    return coorY;
                }
            }
        }
        return 0;
    }
}
