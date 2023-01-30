// 2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
// который запишет эту строку в простой текстовый файл, обработайте исключения.

package seminar2.task2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class program {
    public static void main(String[] args) {
        String r = strTest("TEST");
        writeFile(r);
    }

    public static String strTest(String t) {
        t = t.repeat(100);
        System.out.println(t);
        return t;
    }

    private static void writeFile(String text) {

        try(PrintWriter pw = new PrintWriter("seminar2\\task2.txt")) {
            pw.print(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
