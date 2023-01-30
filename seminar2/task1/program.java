// 1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

package seminar2.task1;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        if (strPalindrome(str)){
            System.out.print("Строка является палиндромом");
        } else {
            System.out.print("Строка не является палиндромом");
        }
        in.close();
    }

    public static String reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i) r += s.charAt(i);
        return r;
    }

    public static Boolean strPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}
