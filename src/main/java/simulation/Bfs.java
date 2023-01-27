package simulation;


/*
 * Поиск в ширину
 */
public class Bfs<T> {
    Queue queue = new Queue();

    // Обход в ширину
    public void bfs(Coordinates<T> coordinates) {
        //coordinates.wasVisited = true; //   Пометка, что визит был (wasVisited переменная)
        int coorX = queue.searchCoordinateX(coordinates); // Находим координаты X первоночального расположения объекта
        int coorY = queue.searchCoordinateY(coordinates); // Находим координаты X первоночального расположения объекта
        Coordinates<T> coordinates1 = queue.identifyAdjacentCellsX(coorX, coorY); // Обходим соседние ячейки по Х
        Coordinates<T> coordinates2 = queue.identifyAdjacentCellsY(coorX, coorY); // Обходим соседние ячейки по Y
       // queue.insertQueue(coordinates1); // Помещаем в очередь


    }


}





   /* // Вставка элемента в конец очереди
    public void insert(int j) {
        if (rear == SIZE - 1) {
            rear = -1;
            queArray[++rear] = j;
        }
    }
    //-------------------------------------------
    // Извлечение элемента в начале очереди
    public int remove() {
        int temp = queArray[front++];
        if (front == SIZE) {
            front = 0;
        }
        return temp;
    }
    //--------------------------------------------
    // true,  если очередь пуста
    public boolean isEmpty() {
        return (rear + 1 == front || (front + SIZE - 1 == rear));
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////
class Vertex{
    public char label; // Метка
    public boolean wasVisited;

    public Vertex(char lab) {
        label = lab;
        wasVisited = false;
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////
class Graf{
    private Vertex vertexList[]; // Список вершин
    private int adjMat[][]; // Матрица смежности
    private int nVerts; // Текущее количество вершин
    private Queue theQueue;

    public Graf() {
        vertexList = new Vertex[cons.getMAX_VERTS()];
        adjMat = new int[cons.getMAX_VERTS()][cons.getMAX_VERTS()];
        nVerts = 0;
        for (int j = 0; j < cons.getMAX_VERTS(); j++) {
            for (int k = 0; k < cons.getMAX_VERTS(); k++) {
                adjMat[j][k] = 0;
            }
        }
        theQueue = new Queue();
    }
}*/
//////////////////////////////////////////////////////////////////////////////////////////////

