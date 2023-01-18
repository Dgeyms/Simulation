package simulation.searchbreadth;

/*
 * Поиск в ширину
 */
public class Queue {
    private final int SIZE = 8;
    private int[] queArray;
    private int front; // перед
    private int rear; // задний
// ---------------------------------------
    public Queue() { // конструктор
        queArray = new int[SIZE];
        front = 0;
        rear = -1;
    }
//----------------------------------------
    // Вставка элемента в конец очереди
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



