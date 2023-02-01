// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа 
// (в языке уже есть что-то готовое для этого)

package seminar3.task1;

import java.util.Random;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listNum.add(random.nextInt(10));
        }
        System.out.println("Исходный список:");
        System.out.println(listNum);

        listNum.removeIf(x -> x % 2 == 0);

        System.out.println();
        System.out.println("Список без чётных чисел:");
        System.out.println(listNum);
    }
    
}
