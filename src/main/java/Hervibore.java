/*
* Травоядные животные
 */
public class Hervibore extends Entity{
    String hervibore = "H";

    public Hervibore(int coordinatesX, int coordinatesY){
        super(coordinatesX, coordinatesY);
    }

    public String getHervibore(){
        return hervibore;
    }
    /*Травоядное, наследуется от Creature. Cтремятся найти ресурс (траву), может потратить свой ход на
    движение в сторону травы, либо на её поглощение.*/
}
