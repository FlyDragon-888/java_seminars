// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

package seminar1.task1;

import java.util.Random;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        ex();
    }

    private static void ex() {
        int[] Array = new int[10];
        int min = 100;
        int max = 0;
        Random random = new Random();

        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(10);
        }

        for (int num : Array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
        System.out.println("max element: " + max);
        System.out.println("min element: " + min);
    }
}