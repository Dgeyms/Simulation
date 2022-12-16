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



    }




}
