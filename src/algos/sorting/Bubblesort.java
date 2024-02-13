package algos.sorting;

import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {
        int[] numbers = new int[]{4,3,5,1,7,2,9,11,6,10};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    // O(n^2)
    static void sort(int[] numbers) {
        for (int i = 0;i < numbers.length; ++i) {
            boolean swapped = false;
            for (int j = 0; j < numbers.length - 1; ++j) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
