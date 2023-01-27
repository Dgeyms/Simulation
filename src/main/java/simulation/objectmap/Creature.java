package simulation.objectmap;
/*
* Существа
 */
public class Creature extends Entity {
    int HP; // Количество жизней
    int speed; // Скорость (сколько клеток существо может пройти за 1 ход)
    int direction; // Направление движения

    @Override
    public String getSprite() {
        return null;
    }



    /*Абстрактный класс, наследуется от objectmap.Entity. Существо, имеет скорость (сколько клеток может пройти за 1 ход),
    количество HP. Имеет абстрактный метод makeMove() - сделать ход. Наследники будут реализовывать этот метод
    каждый по-своему.*/
}
