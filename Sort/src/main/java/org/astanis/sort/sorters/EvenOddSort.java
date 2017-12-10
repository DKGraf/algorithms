package org.astanis.sort.sorters;

public class EvenOddSort {
    private EvenOddSort() {
    }

    public static void sort(int[] array) {
        long startTime = System.currentTimeMillis();
        int j = 0;
        while (true) {
            int changeCount = 0;
            for (int i = j; i < array.length - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    changeCount++;
                }
            }
            j = (j == 0 ? 1 : 0);
            if (changeCount == 0) {
                break;
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Even Odd Sort: " + (finishTime - startTime));
    }
}
