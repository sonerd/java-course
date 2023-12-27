package week2.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections2 {

    public static void main(String[] args) {

        // Set family

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("banana");

        System.out.println(fruits);
        System.out.println("================================");

        Fruit granny = new Fruit("Apple Granny Smith", true, "green");
        Fruit delicious = new Fruit("Red delicious", true, "red");
        Fruit delicious2 = new Fruit("Red delicious", true, "red");

        Set<Fruit> fruitSet = new HashSet<>();
        fruitSet.add(granny);
        fruitSet.add(delicious);
        fruitSet.add(delicious2);
        printFruits(fruitSet);

        System.out.println("================================");

        Set<String> fruitNames = new TreeSet<>();
        fruitNames.add("Banana");
        fruitNames.add("Ananas");
        System.out.println(fruitNames);
        System.out.println("================================");

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(23);
        numbers.add(12);
        numbers.add(45);
        System.out.println(numbers);

        System.out.println("================================");
        Fruit banana = new Fruit("Banana", true, "banana");
        Map<Integer, Fruit> fruitMap = new HashMap<>();
        fruitMap.put(1, granny);
        fruitMap.put(2, delicious);
        fruitMap.put(3, banana);
        System.out.println(fruitMap);

        if (fruitMap.containsKey(3)){
            final Fruit fruit = fruitMap.get(3);
            System.out.println(fruit.getName());
        }
        // create a map where you group fruits: apple -> [granny, delicious], dates -> [sukeri, ajwaa]....

        Map<String,Set<Fruit>> fruitGroups = new HashMap<>();
        Set<Fruit> apples = new HashSet<>();
        apples.add(granny);
        apples.add(delicious);
        fruitGroups.put("apples",apples);
        Set<Fruit> bananas = new HashSet<>();
        bananas.add(banana);
        fruitGroups.put("bananas",bananas);

        for (Map.Entry<String,Set<Fruit>> fruitEntry:fruitGroups.entrySet()){
            System.out.println(fruitEntry.getKey()+"--->"+fruitEntry.getValue());
        }



    }

    public static void printFruits(Set<Fruit> fruitsToPrint){
        for (Fruit fruit : fruitsToPrint) {
            if (fruit.isSweet() && fruit.getColor().equals("red")) {
                System.out.println(fruit.getName());
            }
        }
    }
}
