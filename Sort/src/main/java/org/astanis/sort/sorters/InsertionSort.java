package org.astanis.sort.sorters;

public class InsertionSort {
    private InsertionSort() {
    }

    public static void sort(int[] array) {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Insertion Sort: " + (finishTime - startTime));
    }
}
