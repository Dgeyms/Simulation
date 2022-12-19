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
    // Добавляем Predator в hashMap
    public void addHerbivore(Herbivore he){
        hashMap.put(he, he.getHerbivore());
    }




public void printMap(){
    for (Entity name: hashMap.keySet()){
        String key = name.toString();
        String value = hashMap.get(name).toString();
        System.out.println(key + " " + value);
    }

}
}
