package simulation;

/*
 * Поиск в ширину
 */
public class Bfs{
    SearchCoordinatesInHashMap searchCoordinatesInHashMap = new SearchCoordinatesInHashMap();
    Constant cons = new Constant();

    // Обходим соседние ячейки по Х
    public Coordinates identifyAdjacentCellsX(int coorX, int coorY) {
        for (int x = coorX - 1; x < 3; x++) {
            if (x == -1 || x > cons.getSIZE_MAP_X()) {
                break;
            } else {
                return new Coordinates(x, coorY);
            }
        }
        return null;
    }

    // Идентифицируем соседние ячейки по Y
    public Coordinates identifyAdjacentCellsY(int coorX, int coorY) {
        for (int y = coorY - 1; y < 3; y++) {
            if (y == -1 || y > cons.getSIZE_MAP_Y()) {
                break;
            } else {
                return new Coordinates(coorX, y);
            }
        }
        return null;
    }
    /*public void bfs(int coorX, int coorY, Coordinates coordinatesTwo) {
        for (int x = coorX - 1; x < 3; x++) {
            for (int y = coorY - 1; y < 3; y++) {
                if(!new Coordinates(coorX, coorY).equals(coordinatesTwo)){
                    break;
                }else {

                }
            }
        }
        while (){

        }*/
        //coordinates.wasVisited = true; //   Пометка, что визит был (wasVisited переменная)
        //x < -1 || x > cons.getSIZE_MAP_X() || y < -1 || y > cons.getSIZE_MAP_Y()
        //Coordinates<T> coordinates1 = searchCoordinates.identifyAdjacentCellsX(coorX, coorY); // Обходим соседние ячейки по Х
        //Coordinates<T> coordinates2 = searchCoordinates.identifyAdjacentCellsY(coorX, coorY); // Обходим соседние ячейки по Y
       // queue.insertQueue(coordinates1); // Помещаем в очередь





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

