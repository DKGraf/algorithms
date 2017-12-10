package org.astanis.sort.sorters;

public class BubbleSort {
    private BubbleSort() {
    }

    public static void sort(int[] array) {
        long startTime = System.currentTimeMillis();
        int temp;
        for (int i = 0, j = array.length - 1; i < j; j--) {
            for (int k = 0; k < j; k++) {
                if (array[k] > array[k + 1]) {
                    temp = array[k + 1];
                    array[k + 1] = array[k];
                    array[k] = temp;
                }
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Bubble Sort: " + (finishTime - startTime));
    }
}
