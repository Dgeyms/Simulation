/*
* Распечатка игрового мира в консоли
 */
public class PrintMapConsole {
    Constant cons = new Constant();
    Map map = new Map();

        public void printRockConsole(){
            for (int y = 0; y < cons.SIZE_MAP_X; y++) {
                for (int x = 0; x < cons.SIZE_MAP_Y; x++) {
                    if(map.getRockByCoordinates(x, y)) {
                        System.out.print("|" + "\t");
                    }else{
                        System.out.print(map.hashMap.keySet() + "\t");
                    }
                }
                System.out.println();
            }
        }
}
