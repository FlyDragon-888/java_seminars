// 2. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). 
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

package seminar1.task2;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int y = in.nextInt();
        in.close();
        doYear(y);
    }
    
    private static void doYear(int year) {
        boolean a;
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) a = true;
        else a = false;
        if (a) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}
