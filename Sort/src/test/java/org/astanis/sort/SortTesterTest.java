package org.astanis.sort;

import org.astanis.sort.sorters.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

class SortTesterTest {

    @Test
    void main() {
        int size = 50000;
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        int[] testArray = new int[size];
        int[] arraySelection = new int[size];
        int[] arrayBubble = new int[size];
        int[] arrayShaker = new int[size];
        int[] arrayEvenOdd = new int[size];
        int[] arrayInsertion = new int[size];
        int[] arrayComb = new int[size];
        int[] arrayShell = new int[size];
        int[] arrayMerge = new int[size];

        System.arraycopy(array, 0, testArray, 0, size);
        System.arraycopy(array, 0, arraySelection, 0, size);
        System.arraycopy(array, 0, arrayBubble, 0, size);
        System.arraycopy(array, 0, arrayShaker, 0, size);
        System.arraycopy(array, 0, arrayEvenOdd, 0, size);
        System.arraycopy(array, 0, arrayInsertion, 0, size);
        System.arraycopy(array, 0, arrayComb, 0, size);
        System.arraycopy(array, 0, arrayShell, 0, size);
        System.arraycopy(array, 0, arrayMerge, 0, size);

        long before = System.currentTimeMillis();
        Arrays.sort(testArray);
        long after = System.currentTimeMillis();
        System.out.println("Arrays.sort: " + (after - before));

        BubbleSort.sort(arrayBubble);
        ShakerSort.sort(arrayShaker);
        EvenOddSort.sort(arrayEvenOdd);
        CombSort.sort(arrayComb);
        SelectionSort.sort(arraySelection);
        InsertionSort.sort(arrayInsertion);
        ShellSort.sort(arrayShell);
        MergeSort.sort(arrayMerge);

        Assertions.assertArrayEquals(testArray, arrayBubble);
        Assertions.assertArrayEquals(testArray, arrayShaker);
        Assertions.assertArrayEquals(testArray, arrayEvenOdd);
        Assertions.assertArrayEquals(testArray, arrayComb);
        Assertions.assertArrayEquals(testArray, arraySelection);
        Assertions.assertArrayEquals(testArray, arrayInsertion);
        Assertions.assertArrayEquals(testArray, arrayShell);
        Assertions.assertArrayEquals(testArray, arrayMerge);
    }
}