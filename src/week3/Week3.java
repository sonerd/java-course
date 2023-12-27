package week3;

import java.util.*;

public class Week3 {
    public static void main(String[] args) {
        System.out.println("Hello world");

        // 1. create a class called Human which has attributes like firstname, lastname and nationality
        // 2. create collection of humans
        // 3. group the humans by their nationality


        Human firstHuman = new Human("Faris","Alali","Saudi");
        Human secondHuman = new Human("Klaus","schmidt","German");
        Human thirdHuman = new Human("Jake","Smith","Spanish");
        Human fourthHuman = new Human("Hassan","Dag","Turkish");
        Human fifthHuman = new Human("Ali","Dag","Turkish");


        List<Human> humans = new ArrayList<>();
        humans.add(firstHuman);
        humans.add(secondHuman);
        humans.add(thirdHuman);
        humans.add(fourthHuman);

        Map<String,List<Human>> humanGroups = new HashMap<>();

    }

}

