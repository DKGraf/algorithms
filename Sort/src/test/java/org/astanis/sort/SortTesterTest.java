package org.astanis.sort;

import org.astanis.sort.sorters.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

class SortTesterTest {

    @Test
    void main() {
        int size = 10_000;
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

        System.arraycopy(array, 0, testArray, 0, size);
        System.arraycopy(array, 0, arraySelection, 0, size);
        System.arraycopy(array, 0, arrayBubble, 0, size);
        System.arraycopy(array, 0, arrayShaker, 0, size);
        System.arraycopy(array, 0, arrayEvenOdd, 0, size);
        System.arraycopy(array, 0, arrayInsertion, 0, size);

        Arrays.sort(testArray);
        SelectionSort.sort(arraySelection);
        BubbleSort.sort(arrayBubble);
        ShakerSort.sort(arrayShaker);
        EvenOddSort.sort(arrayEvenOdd);
        InsertionSort.sort(arrayInsertion);

        Assertions.assertArrayEquals(testArray, arraySelection);
        Assertions.assertArrayEquals(testArray, arrayBubble);
        Assertions.assertArrayEquals(testArray, arrayShaker);
        Assertions.assertArrayEquals(testArray, arrayEvenOdd);
        Assertions.assertArrayEquals(testArray, arrayInsertion);
    }
}