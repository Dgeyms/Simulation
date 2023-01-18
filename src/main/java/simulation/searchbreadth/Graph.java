package simulation.searchbreadth;

import simulation.objectmap.Entity;

public class Graph {
    int coordinatesX;
    int coordinatesY;


    // Обход в ширину
    public void bfs(Entity entity){
        entity.wasVisited = true; //   Пометка, что визит был (wasVisited переменная)
        String coordinate = entity.toString();
        System.out.println(coordinate);
        // Обходим следующие клетки
        //for(int x = entity)

    }

}
