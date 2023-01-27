package simulation;

/*
* Константы
 */
public class Constant {
    // Размеры карты
    private final int SIZE_MAP_X = 8;
    private final int SIZE_MAP_Y = 8;
    private final int MAX_VERTS = getSIZE_MAP_X() * getSIZE_MAP_Y();
    public int getSIZE_MAP_X() {
        return SIZE_MAP_X;
    }
    public int getSIZE_MAP_Y() {
        return SIZE_MAP_Y;
    }

    public int getMAX_VERTS() {
        return MAX_VERTS;
    }
}
