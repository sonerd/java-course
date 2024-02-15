package algos.sorting;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        //test arrays
        int[] arr = {5, 3, 8, 2, 1, 4};
        arr = insertionsort(arr);
        System.out.println("insertion: " + Arrays.toString(arr));

        // visualizing of insertion sort
        // Start from the second element (3).
        // Compare it with the elements to its left (5).
        // If it's smaller than the element to its left, swap them.
        // Repeat this process until the element is in its correct sorted position.
        // 1. step
        //          [5, 3, 8, 2, 1, 4]   [5, 5, 8, 2, 1, 4]-->   [3, 5, 8, 2, 1, 4]
        // 2. step Move to the next element (8) and insert it into its correct position in the sorted sublist.
        //         [3, 5, 8, 2, 1, 4]   -->   [3, 5, 8, 2, 1, 4]   -->   [3, 5, 8, 2, 1, 4]
        // 3. step
        // [3, 5, 8, 2, 1, 4]   -->   [2, 3, 5, 8, 1, 4]   -->   [1, 2, 3, 5, 8, 4]   -->   [1, 2, 3, 4, 5, 8]

        int[] another = {5, 3, 8, 2, 1, 4};
        int[] result = selectionsort(another);
        System.out.println("selectionsort:" + Arrays.toString(result));

        int[] unsortedArray = {5, 3, 8, 2, 1, 4};
        mergesort(unsortedArray);
        System.out.println("mergesort: " + Arrays.toString(unsortedArray));
    }

    // O(n^2) TIME
    // after comparing elements to the left shift elements to the right to make room to insert a value
    //
    public static int[] insertionsort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1; // the left item to compare to
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }

    // O(n^2) TIME
    // declare the current number as the minimum of the current iteration and compare it with the next numbers till you find another minimum.
    // If you found another swap these numbers.
    public static int[] selectionsort(int[] array) {
        // [5, 3, 8, 2, 1, 4]
        for (int i = 0; i < array.length - 1; i++) {
            int min = i; // index of current minimum value
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            // swapping
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }

    // O(n log(n)) TIME
    private static void mergesort(int[] array) {

        int length = array.length;
        if (length <= 1)
            return; // base check

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // index for left array
        int j = 0; // index for right array

        for(; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        // recursively
        mergesort(leftArray);
        mergesort(rightArray);

        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; //indices

        // check the conditions for merging
        while(l < leftSize && r < rightSize) {

            // sorting condition
            if(leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        // logic in case there is one left over
        while(l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
