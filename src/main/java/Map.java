import java.util.HashMap;
import java.util.Objects;

/*
* Карта, содержит в себе коллекцию для хранения существ и их расположения.
 */
public class Map {
public HashMap<Entity, String> hashMap = new HashMap<>();

/*public void addMap(Entity en){ // Вот тут затык
    hashMap.put(en, en.);        // Можно ли одним методом, записать КЛЮЧ-ЗНАЧЕНИЕ всех существ и предметов на карте в hashMap
}*/

    // Добавляем объекты камень в hashMap
    public void addRock(Rock rock){
        hashMap.put(rock, rock.getRocks());
    }
    // Добавляем Grass в hashMap
    public void addGrass(Grass gr){
        hashMap.put(gr, gr.getGrass());
    }
    // Добавляем Tree в hashMap
    public void addTree(Tree tr){
        hashMap.put(tr, tr.getTree());
    }
    // Добавляем Predator в hashMap
    public void addPredator(Predator pr){
        hashMap.put(pr, pr.getPredator());
    }

    public void addHerbivore(Herbivore he){
        hashMap.put(he, he.getHerbivore());
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
    public boolean getByCoordinates(int x, int y) {     // Вторая проблема
        return !hashMap.containsKey(new Entity(x, y));  // Не работает проверка на координаты, на карте не отображаются значения.
    }

public void printMap(){
    for (Entity name: hashMap.keySet()){
        String key = name.toString();
        String value = hashMap.get(name);
        System.out.println("Key: " + key + " Value: "
                + value);
    }

}
}
