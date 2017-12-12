package org.astanis.sort.sorters;

public class CombSort {
    private CombSort() {
    }

    public static void sort(int[] array) {
        long startTime = System.currentTimeMillis();
        int factor = (int) (array.length / 1.247330950103979);
        while (true) {
            int changeCount = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if ((i + factor < array.length)) {
                    if (array[i] > array[i + factor]) {
                        int temp = array[i + factor];
                        array[i + factor] = array[i];
                        array[i] = temp;
                        changeCount++;
                    }
                }
            }
            if (changeCount == 0 && factor == 1) {
                break;
            }
            if (factor > 1) {
                factor = Math.round(factor / 2);
            } else {
                factor = 1;
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Comb Sort: " + (finishTime - startTime));
    }
}
