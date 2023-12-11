package day1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arrayOfInt = {1, 2, 3, 4, 5, 6};
        int secondItem = arrayOfInt[1];

        List<Integer> integers = new ArrayList<>();
        final Integer one = Integer.valueOf(1);
        integers.add(one);
        integers.add(2);
        integers.add(3);
        integers.remove(one);

        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");

        strings.remove("3");

        System.out.println(strings);
    }
}