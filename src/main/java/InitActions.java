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
        map.addRock(rock1); // добавляем в Map камень
        map.printMap();
        //System.out.println(rock1);

        // Генерация травы
        Grass grass1 = new Grass(generator.coordinatesX(), generator.coordinatesY());

        // Генерация деревьев
        Tree tree1 = new Tree(generator.coordinatesX(), generator.coordinatesY());

        // Генерация хищников
        Predator predator1 = new Predator(generator.coordinatesX(), generator.coordinatesY());

        // Генерация травоядных
        Herbivore herbivore1 = new Herbivore(generator.coordinatesX(), generator.coordinatesY());





    }




}
