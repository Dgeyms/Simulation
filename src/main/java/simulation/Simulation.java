package simulation;

import java.io.IOException;
/*
* Главный класс приложения
 */
public class Simulation {
    public static void main(String[] args) throws IOException {

        // Генерация мира
        GenerationWorld initGenerationWorld = new GenerationWorld();
        initGenerationWorld.initActionAll();
        // Активные действия объектов игрового мира
        Activity activity = new Activity();
        activity.turnActions();

    }
}
