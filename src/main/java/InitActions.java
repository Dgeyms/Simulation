/*
* Действия, совершаемые перед стартом симуляции
 */
public class InitActions {
    public void initActionAll(){
        Generator generator = new Generator();
        // Генерация камней
        int coordinatesX = generator.CoordinatesX();
        int coordinatesY = generator.CoordinatesY();
        System.out.println(coordinatesX + " " + coordinatesY);
    }

}
