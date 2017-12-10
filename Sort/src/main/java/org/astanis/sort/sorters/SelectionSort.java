package org.astanis.sort.sorters;

public class SelectionSort {
    private SelectionSort() {
    }

    public static void sort(int[] array) {
        long startTime = System.currentTimeMillis();
        int min;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Selection Sort: " + (finishTime - startTime));
    }
}
