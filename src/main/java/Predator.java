/*
*  Хищники
 */
public class Predator extends Creature {
    String predator = "P";

    public String getSprite(){
        return predator;
    }

    /*@Override
    public String toString() {
        return "Predator{" +
                "coordinatesX=" + coordinatesX +
                ", coordinatesY=" + coordinatesY +
                '}';
    }*/
    /* В дополнение к полям класса `Creature`, имеет силу атаку. На что может потратить ход хищник:

- Переместиться (чтобы приблизиться к жертве - травоядному)
- Атаковать травоядное. При этом количество HP травоядного уменьшается на силу атаки хищника.
    Если значение HP жертвы опускается до 0, травоядное исчезает*/
}
