package org.astanis.sort.sorters;

public class ShellSort {
    private ShellSort() {
    }

    public static void sort(int[] array) {
        long startTime = System.currentTimeMillis();
        int interval,
                length = array.length,
                m = 0,
                i,
                j,
                temp;
        int[] d = {1, 4, 10, 23, 57, 145, 356, 911, 1968, 4711, 11969, 27901,
                84801, 213331, 543749, 1355339, 3501671, 8810089, 21521774,
                58548857, 157840433, 410151271, 1131376761, 2147483647};
        while (d[m] < length) ++m;
        while (--m >= 0) {
            interval = d[m];
            for (i = interval; i < length; i++) {
                j = i;
                temp = array[i];
                while ((j >= interval) && (array[j - interval] > temp)) {
                    array[j] = array[j - interval];
                    j -= interval;
                }
                array[j] = temp;
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Shell Sort: " + (finishTime - startTime));
    }
}
