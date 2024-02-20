package algos.sorting;

import java.util.Arrays;

public class Heapsort {

    public static void main(String[] args) {
        int[] array = {1, 12, 9,5, 6, 10};
        sort(array);

        System.out.println("heapsort: " + Arrays.toString(array));
    }

    // O(n log(n)) TIME complexity
    public static void sort(int[] array) {
        // heapify
        // based on the max heap strategy so the largest node has to be on the root

        // after heapifying we have to do the exchange and put the largest at the end and cut of from the tree

        int n = array.length;

        for(int i = n/2-1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // from end to beginning
        for (int i = n-1; i >0;i--) {

            // root element
            int temp = array[0];

            // move last element to the root
            array[0] = array[i];
            array[i] = temp;

            // only heapify the root node
            heapify(array, i,0);
        }
    }

    private static void heapify(final int[] array, final int n, final int i) {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            // swapping
            int temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;

            heapify(array, n, largest);
        }

    }
}
