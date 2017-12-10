package org.astanis.sort.sorters;

public class EvenOddSort {
    private EvenOddSort() {
    }

    public static void sort(int[] array) {
        long startTime = System.currentTimeMillis();
        int temp;
        int i = 0;
        while (true) {
            int changeCount = 0;
            for (int k = i; k < array.length - 1; k += 2) {
                if (array[k] > array[k + 1]) {
                    temp = array[k + 1];
                    array[k + 1] = array[k];
                    array[k] = temp;
                    changeCount++;
                }
            }
            i = (i == 0 ? 1 : 0);
            if (changeCount == 0) {
                break;
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Even Odd Sort: " + (finishTime - startTime));
    }
}
