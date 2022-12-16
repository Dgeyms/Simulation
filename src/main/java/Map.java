import java.util.Arrays;
import java.util.HashMap;

/*
* Карта, содержит в себе коллекцию для хранения существ и их расположения.
 */
public class Map {
HashMap<Entity, String> hashMap = new HashMap<>();

    // Добавляем ключ (координаты) и значение (переменную камни) в hashMap
    public void addRock(Rock r){
        hashMap.put(r, r.getRocks());
    }



public void printMap(){
    for (Entity name: hashMap.keySet()){
        String key = name.toString();
        String value = hashMap.get(name).toString();
        System.out.println(key + " " + value);
    }

}
}
