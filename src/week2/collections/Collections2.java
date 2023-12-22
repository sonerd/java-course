package week2.collections;

import java.util.HashSet;
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

        Fruit granny = new Fruit("Apple Granny Smith", false, "green");
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
    }

    public static void printFruits(Set<Fruit> fruitsToPrint){
        for (Fruit fruit : fruitsToPrint) {
            if (fruit.isSweet()) {
                System.out.println(fruit.getName());
            }
        }
    }
}
