package simulation;

import simulation.Action;

import java.io.IOException;
/*
* Главный класс приложения
 */
public class Simulation {
    public static void main(String[] args) throws IOException {

        // Генерация мира
        Action initAction = new Action();
        initAction.initActionAll();
        // Активные действия объектов игрового мира
        initAction.turnActions();

    }
}
