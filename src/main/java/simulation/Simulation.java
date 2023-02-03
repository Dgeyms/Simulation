package simulation;

import simulation.generator.GenerationWorld;

/*
* Главный класс приложения
 */
public class Simulation {
    public static void main(String[] args){

        // Генерация мира
        GenerationWorld initGenerationWorld = new GenerationWorld();
        initGenerationWorld.initActionAll();

        // Активные действия объектов игрового мира
        ActivityWorld actWorld = new ActivityWorld();
        actWorld.activityWorld();


    }
}
