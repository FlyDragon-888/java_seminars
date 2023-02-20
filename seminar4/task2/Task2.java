// 2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package seminar4.task2;

import java.util.List;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i + 1);
        }
        System.out.println("Исходный список: " + numbers);
        System.out.println("Перевёрнутый список: " + reverseNumbers(numbers));
    }

    private static List<Integer> reverseNumbers(List<Integer> numbers) {
        List<Integer> reversedNumbers = new LinkedList<>();
        for (int i = numbers.size() - 1; i >= 0 ; i--) {
            reversedNumbers.add(numbers.get(i));
        }
        return reversedNumbers;
    }
}
