package algos.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bucketsort {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 8, 9, 2, 7};
        int n = array.length;

        System.out.println("Original array:" + Arrays.toString(array));

        bucketSort(array, n);

        System.out.println("Sorted array:" + Arrays.toString(array));
    }

    public static void bucketSort(int[] arr, int arraysize) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int minValue = arr[0];
        int maxValue = arr[0];
        // find the min and max values of the input array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            } else if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        int bucketCount = (maxValue - minValue) / arraysize + 1; // --> 2
        List<List<Integer>> buckets = new ArrayList<>(bucketCount); // list of buckets (which are also lists)
        // initialize buckets
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int value : arr) {
            // calculation of bucket index where to add the value to
            // based on the min and max values
            int bucketIndex = (value - minValue) / arraysize; // will be 0 or 1
            buckets.get(bucketIndex).add(value);
        }

        int index = 0;
        // go through the buckets and sort each one
        for (List<Integer> bucket : buckets) {

            // here we use the java sorting but other sorting algorithms canbe used instead
            Collections.sort(bucket);

            // after sorting go through all buckets and place the item from there to the input array
            for (int value : bucket) {
                arr[index++] = value;
            }
        }

    }
}
