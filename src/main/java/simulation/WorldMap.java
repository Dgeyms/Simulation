package simulation;

import simulation.objectmap.Entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Карта, содержит в себе коллекцию для хранения существ и их расположения.
 */
public class WorldMap {
    public HashMap<Coordinates, String> hashMap = new HashMap<>();

    // Добавление объектов в hashMap
    public void addHashMap(Entity entity) {
        hashMap.put(new Coordinates(), entity.getSprite());
    }

    // Сколько объектов в hashMap
    public int sizeHashMap() {
        System.out.println("Numbers object: " + hashMap.size());
        return hashMap.size();
    }

    Constant cons = new Constant();

    public void printConsoleMap() {
        for (int y = 0; y < cons.SIZE_MAP_X; y++) {
            for (int x = 0; x < cons.SIZE_MAP_Y; x++) {
                if (getByCoordinates(x, y)) {
                    System.out.print("|" + "\t");
                } else {
                    System.out.print(hashMap.get(new Coordinates(x, y)) + "\t");
                }
            }
            System.out.println();
        }
    }

    // Проверка, есть ли в hashMap объект с такими координатоми
    public boolean getByCoordinates(int x, int y) {
        return !hashMap.containsKey(new Coordinates(x, y));
    }

    // Распечатка ключ/значение объектов игрового мира
    public void printMap() {
        for (Coordinates name : hashMap.keySet()) {
            String key = name.toString();
            String value = hashMap.get(name);
            System.out.println("Key: " + key + " Value: "
                    + value);
        }
    }

    // Нахождение координат объектов в hashMap по значению
    public Coordinates getCoordinatesObjects(String value) {
        Set<Map.Entry<Coordinates, String>> entrySet = hashMap.entrySet();

        for (Map.Entry<Coordinates, String> pair : entrySet) {
            if (value.equals(pair.getValue())) {
                return pair.getKey(); // нашли наше значение и возвращаем  ключ
            }
        }
        return null;
    }
}
