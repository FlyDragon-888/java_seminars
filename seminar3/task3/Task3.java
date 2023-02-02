// 3. Пройти по списку из задания 2 с урока и удалить повторяющиеся элементы.

package seminar3.task3;

import java.util.Random;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Task3 {
    private static final String[] solarSystemPlanets =
            {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<String> planetList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            planetList.add(solarSystemPlanets[random.nextInt(solarSystemPlanets.length)]);
        }
        System.out.println("Cписок с повторяющимися элементами:");
        System.out.println(planetList);
        System.out.println();

        Set<String> uniqueList = new HashSet<>(planetList);
        System.out.println("Cписок с уникальными элементами:");
        System.out.println(uniqueList);
    }
}
