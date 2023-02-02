// 2. Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.

package seminar3.task2;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listNum.add(random.nextInt(100));
        }
        System.out.println("Список:");
        System.out.println(listNum);

        System.out.printf("Минимальное число: %d%n", Collections.min(listNum));
        System.out.printf("Максимальное число: %d%n", Collections.max(listNum));
        System.out.printf("Среднее арифметическое: %f%n", calcAverage(listNum));
    }

    private static double calcAverage(ArrayList<Integer> listNum) {
        Integer sum = 0;
        if (!listNum.isEmpty()) {
            for (Integer num: listNum) {
                sum += num;
            }
            return sum.doubleValue() / listNum.size();
        }
        return sum;
    }
}
