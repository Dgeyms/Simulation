import java.util.HashMap;

/*
* Карта, содержит в себе коллекцию для хранения существ и их расположения.
 */
public class Map {
public HashMap<Coordinates, String> hashMap = new HashMap<>();

    // Добавление объектов в hashMap
    public void addHashMap(Entity  entity) {
        hashMap.put(new Coordinates(), entity.getSprite());
    }

    Constant cons = new Constant();
    public void printConsoleMap(){
        for (int y = 0; y < cons.SIZE_MAP_X; y++) {
            for (int x = 0; x < cons.SIZE_MAP_Y; x++) {
                if(getByCoordinates(x, y)) {
                    System.out.print("|" + "\t");
                }else{
                    System.out.print("R" + "\t");
                }
            }
            System.out.println();
        }
    }
    // Проверка, есть ли в hashMap объект с такими координатоми
    public boolean getByCoordinates(int x, int y) {// Вторая проблема
        return false;
        //return !hashMap.containsKey(new Entity(x, y));  // Не работает проверка на координаты, на карте не отображаются значения.
    }

public void printMap(){
    for (Coordinates name: hashMap.keySet()){
        String key = name.toString();
        String value = hashMap.get(name);
        System.out.println("Key: " + key + " Value: "
                + value);
    }

}
}
