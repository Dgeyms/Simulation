/*
* Действия, совершаемые перед стартом симуляции
 */
public class InitActions {
    private Generator generator;


    public void initActionAll(){
        Generator generator = new Generator();
        // Генерация камней
       // int coordinatesX = generator.coordinatesX();
      //  int coordinatesY = generator.coordinatesY();
       // System.out.println(coordinatesX + " " + coordinatesY);
        Rock rock1 = new Rock( generator.coordinatesX(), generator.coordinatesY(), "R");
        System.out.println(rock1);


    }



}
