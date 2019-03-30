package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;



public class Main {

    public static void main(String[] args) {
        
        int[] array = new int[20];
        Initializer fibInitializer = new FibonacciInitializer();
        fibInitializer.initialize(array);
        
        int summ = 0;
        for(int i=0; i< array.length; i++){
            summ = summ + array[i];
        }
        
        System.out.println("Сумма Фибоначчи: " + summ);
        
        int[] newArrayBubble = new int[20];
        RandomInitializer randInitializerBubble = new RandomInitializer(-50, 50);
        randInitializerBubble.initialize(newArrayBubble);
        new BubbleSort().sort(newArrayBubble);
        System.out.println("Bubble: ");
        printArray(newArrayBubble);
        
               
        
        //for(int i=0; i< newArrayBubble.length; i++){
          //  System.out.println("Buuble: " + newArrayBubble[i]);
        //}
        
        int[] newArraySelection = new int[20];
        RandomInitializer randInitializerSelection = new RandomInitializer(-50, 50);
        randInitializerSelection.initialize(newArraySelection);
        new BubbleSort().sort(newArraySelection);
        System.out.println("Selection: ");
        printArray(newArraySelection);
        
        //for(int i=0; i< newArraySelection.length; i++){
          //  System.out.println("Selection: " + newArraySelection[i]);
        //}
        
        int[] newArrayShell = new int[20];
        RandomInitializer randInitializerShell = new RandomInitializer(-50, 50);
        randInitializerShell.initialize(newArrayShell);
        new BubbleSort().sort(newArrayShell);
        System.out.println("Shell: ");
        printArray(newArrayShell);
        
        //for(int i=0; i< newArrayShell.length; i++){
          //  System.out.println("Shell: " + newArrayShell[i]);
        //}
    }
    
        public static void printArray(int[] myArray){
        
            for(int i=0; i< myArray.length; i++){
            System.out.print(myArray[i] + " ");
            }
            System.out.println();
        }   
        
          
}            
        
        
        
        
    
          
        
        
       

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */


