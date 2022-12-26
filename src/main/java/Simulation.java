import java.io.IOException;

/*
* Главный класс приложения
 */
public class Simulation {
    public static void main(String[] args) throws IOException {

        // Генерация мира
        InitActions initActions = new InitActions();
        initActions.initActionAll();
        System.out.println("-----------------------------");
        System.out.println("P - predator; R - rock; T -tree; H - herbivore; G - grass");
        System.out.println("-----------------------------");

    }
}
