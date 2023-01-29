package simulation.generator;

import simulation.Constant;

import java.util.Random;

/*
 * Генератор шагов травоядного или хищника
 */
public class GeneratorMove {
    Random random = new Random();
    Constant cons = new Constant();

    // Рандом Х или У (по какой оси делать генерацию шага)
    public int makeGeneratorX_Y() {
        int randomNumberX_Y = (int) (Math.random() * 2);
        return randomNumberX_Y;
    }

    // Генерация шага (новый координат)
    public int makeObjectMove(int coor) {
        int[] arrayNumbers = {-1, 0, 1};
        int randomIndex = random.nextInt(arrayNumbers.length);

            if(randomIndex < 0){ // Проверка на выход за приделы поля
                return randomIndex + 1;
            }else if(randomIndex > cons.getSIZE_MAP_X()){
                return randomIndex - 1;
            }else if(randomIndex > cons.getSIZE_MAP_Y()){
                return randomIndex - 1;}
            else {
                return arrayNumbers[randomIndex] + coor;
            }
    }

}
