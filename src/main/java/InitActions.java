/*
* Действия, совершаемые перед стартом симуляции
 */
public class InitActions {
    public void initActionAll(){
        Generator generator = new Generator();
        // Генерация камней
        int rockCoordinatesX = generator.rockCoordinatesX();
        int rockCoordinatesY = generator.rockCoordinatesY();
        System.out.println(rockCoordinatesX + " " + rockCoordinatesY);
    }

}
