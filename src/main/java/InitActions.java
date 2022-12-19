/*
* Действия, совершаемые перед стартом симуляции
 */
public class InitActions {
    private Generator generator;

    public void initActionAll(){
        Generator generator = new Generator();
        Map map = new Map();
        // Генерация камней
        Rock rock1 = new Rock( generator.coordinatesX(), generator.coordinatesY());
        Rock rock2 = new Rock( generator.coordinatesX(), generator.coordinatesY());

        map.addRockMap(rock1); // добавляем в Map камень
        map.addRockMap(rock2); // добавляем в Map камень

        map.printMap();
        // Распечатываем камень в консоли
        map.printConsole(rock1);

        // Генерация травы
        // Генерация деревьев
        // Генерация травоядных
        // Генерация хищников



    }




}
