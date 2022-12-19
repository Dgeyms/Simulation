/*
* Существа
 */
public class Creature extends Entity {
    public Creature(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }



    /*Абстрактный класс, наследуется от Entity. Существо, имеет скорость (сколько клеток может пройти за 1 ход),
    количество HP. Имеет абстрактный метод makeMove() - сделать ход. Наследники будут реализовывать этот метод
    каждый по-своему.*/
}
