package simulation;

import simulation.generator.GenerationWorld;

import java.io.IOException;
/*
* Главный класс приложения
 */
public class Simulation {
    public static void main(String[] args){

        // Генерация мира
        GenerationWorld initGenerationWorld = new GenerationWorld();
        initGenerationWorld.initActionAll();

        // Активные действия объектов игрового мира
        Activity activity = new Activity();
        activity.turnActions();

    }
}
