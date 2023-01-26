// 3. Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

package seminar1.task3;

import java.util.Arrays;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        ex3();
    }

    private static void ex3() {
        int val = 3;
        int[] arr = new int[20];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(4);
        }
        System.out.print("Исходный массив:   ");
        System.out.println(Arrays.toString(arr));

        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex <= rightIndex) {
            if (arr[leftIndex] == val && arr[rightIndex] != val) {
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = val;
                leftIndex++;
                rightIndex--;
            } else {
                if (arr[leftIndex] != val) {
                    leftIndex++;
                }
                if (arr[rightIndex] == val) {
                    rightIndex--;
                }
            }
        }

        System.out.print("Изменённый массив: ");
        System.out.println(Arrays.toString(arr));
    }
}
