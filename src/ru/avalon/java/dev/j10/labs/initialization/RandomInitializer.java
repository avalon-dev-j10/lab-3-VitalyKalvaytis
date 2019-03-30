package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {
    int prA;
    int prB;
    public RandomInitializer(int a, int b){
        this.prA = a;
        this.prB = b;
    }
   
    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    @Override
    public void initialize(int[] array) {
        for (int i = 0; i < array.length; i++){
            int b = (int)(-50 + ((Math.random()* (prB - prA))));
            array[i] = b;
            //System.out.println(array[i]);
        }

        
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
    }
}
