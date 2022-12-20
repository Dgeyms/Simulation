import java.util.HashMap;

/*
* Карта, содержит в себе коллекцию для хранения существ и их расположения.
 */
public class Map {
public HashMap<Entity, String> hashMap = new HashMap<>();

    // Добавляем объекты камень в hashMap
    public void addRockMap(Rock rock){
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
    // Добавляем Predator в hashMap
    public void addHerbivore(Herbivore he){
        hashMap.put(he, he.getHerbivore());
    }


    Constant cons = new Constant();
    public void printConsole(Rock rock){
        for (int y = 0; y < cons.SIZE_MAP_X; y++) {
            for (int x = 0; x < cons.SIZE_MAP_Y; x++) {
                if(getRockByCoordinates(x, y)) {
                    System.out.print("|" + "\t");
                }else{
                    System.out.print("R" + "\t");
                }
            }
            System.out.println();
        }
    }
    // Проверка есть ли в hashMap объект с такими координатоми
    public boolean getRockByCoordinates(int x, int y) {
        return !hashMap.containsKey(new Rock(x, y)); // проверка на ключ
    }




public void printMap(){
    for (Entity key : hashMap.keySet()) {
        System.out.println("Key: " + key);
    }
    for (Entity name: hashMap.keySet()){
        String key = name.toString();
        String value = hashMap.get(name);
        System.out.println("Key: " + key + " Value: "
                + value);
    }

}
}
