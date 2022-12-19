/*
*   Деревья
 */
public class Tree extends Entity{

    private String tree = "T";

    public Tree(int coordinatesX, int coordinatesY){
        super(coordinatesX, coordinatesY);
    }
    public String getTree(){
        return tree;
    }
}
