package simulation.generator;

import simulation.Constant;

import java.util.Random;

/*
* Генератор шагов травоядного или хищника
*/
public class GeneratorMove {
    Random random =new Random();
    Constant cons = new Constant();
    // Рандом Х или У
    public int makeGeneratorX_Y(){
        int randomNumberX_Y = (int) (Math.random() * 2);
        return randomNumberX_Y;
    }
    // Генерация шагов
    public int makeObjectMove(int coor) {

        int[] arrayNumbers = {-1, 0, 1};
        int randomIndex = random.nextInt(arrayNumbers.length);

        if(randomIndex < 0 || randomIndex > cons.getSIZE_MAP_X() || randomIndex > cons.getSIZE_MAP_Y() ){

        }
        return arrayNumbers [randomIndex] + coor;
    }
}
