/*
* Травоядные животные
 */
public class Herbivore extends Creature{
    String herbivore = "H";

    public String getSprite(){
        return herbivore;
    }

    /*@Override
    public String toString() {
        return "Herbivore{" +
                "coordinatesX=" + coordinatesX +
                ", coordinatesY=" + coordinatesY +
                '}';
    }*/
    /*Травоядное, наследуется от Creature. Cтремятся найти ресурс (траву), может потратить свой ход на
    движение в сторону травы, либо на её поглощение.*/
}
