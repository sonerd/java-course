package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Week3 {
    public static void main(String[] args) {
        System.out.println("Hello world");

        // 1. create a class called Human which has attributes like firstname, lastname and nationality
        // 2. create collection of humans
        // 3. group the humans by their nationality

        Human firstHuman = new Human("Faris", "Alali", "Saudi");
        Human secondHuman = new Human("Klaus", "schmidt", "German");
        Human thirdHuman = new Human("Jake", "Smith", "Spanish");
        Human fourthHuman = new Human("Hassan", "Dag", "Turkish");
        Human fifthHuman = new Human("Ali", "Demir", "Turkish");
        Human sixthHuman = new Human("Chung", "Lee", "Chinese");
        Human seventhHuman = new Human("Abdul", "King", "Saudi");

        List<Human> humans = Arrays.asList(firstHuman, secondHuman, thirdHuman, fourthHuman, fifthHuman, sixthHuman, seventhHuman);

        Map<String, List<Human>> nationalityToHumans = new HashMap<>();

        // manually filling hashmap
        List<Human> germans = new ArrayList<>();
        germans.add(secondHuman);

        // using of immutable collection creation which is there since Java 9
        List<Human> spanish = List.of(thirdHuman);
        List<Human> turks = List.of(fourthHuman, fifthHuman);
        List<Human> chinese = List.of(sixthHuman);

        nationalityToHumans.put("German", germans);
        nationalityToHumans.put("Spanish", spanish);
        nationalityToHumans.put("Turkish", turks);
        nationalityToHumans.put("Chinese", chinese);

        // dynamically grouping values in a hashmap
        nationalityToHumans.clear();
        for (Human human: humans) {
            String nationality = human.getNationality();
            List<Human> group = nationalityToHumans.getOrDefault(nationality, new ArrayList<>());
            group.add(human);
            nationalityToHumans.put(nationality, group);
        }

        for (Map.Entry<String, List<Human>> human: nationalityToHumans.entrySet()) {
            System.out.println(human.getKey() + "--->" + human.getValue());
        }

    }

}

