/*
* Травоядные животные
 */
public class Herbivore extends Creature{
    String herbivore = "H";

    public String getSprite(){
        return herbivore;
    }

    // Движения травоядного за травой (поиск в ширину)
    public void makeMove(){
        for(int x = 0; x <= 7; x++) {

        }
    }



    /*Травоядное, наследуется от Creature. Cтремятся найти ресурс (траву), может потратить свой ход на
    движение в сторону травы, либо на её поглощение.*/
}
