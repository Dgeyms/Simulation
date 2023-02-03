package simulation.objectmap;

/*
* Травоядные животные
 */
public class Herbivore extends Creature {
    String herbivore = "H";



    public String getSprite(){
        return herbivore;
    }


   /*Травоядное, наследуется от objectmap.Creature. Cтремятся найти ресурс (траву), может потратить свой ход на
    движение в сторону травы, либо на её поглощение.*/
}
