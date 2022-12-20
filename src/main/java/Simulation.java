import java.io.IOException;

/*
* Главный класс приложения
 */
public class Simulation {
    public static void main(String[] args) throws IOException {

        // Генерация мира
        InitActions initActions = new InitActions();
        initActions.initActionAll();
        // Чтение данных из файла
        //FileRead fr = new FileRead();
        //fr.fileRead();

    }
}
