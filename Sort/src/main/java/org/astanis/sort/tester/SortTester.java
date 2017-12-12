package org.astanis.sort.tester;

import org.astanis.sort.sorters.ShellSort;

import java.util.Random;

public class SortTester {
    private static int[] array;

    public static void main(String[] args) {
        int size = 25;
        arrayInit(size);
        //int[] arrayBubble = new int[size];
        //int[] arrayShaker = new int[size];
        //int[] arrayEvenOdd = new int[size];
        //int[] arrayInsertion = new int[size];
        //int[] arraySelection = new int[size];
        //int[] arrayComb = new int[size];
        int[] arrayShell = new int[size];
        //System.arraycopy(array, 0, arrayBubble, 0, size);
        //System.arraycopy(array, 0, arrayShaker, 0, size);
        //System.arraycopy(array, 0, arrayEvenOdd, 0, size);
        //System.arraycopy(array, 0, arrayInsertion, 0, size);
        //System.arraycopy(array, 0, arraySelection, 0, size);
        //System.arraycopy(array, 0, arrayComb, 0, size);
        System.arraycopy(array, 0, arrayShell, 0, size);
        //BubbleSort.sort(arrayBubble);
        //ShakerSort.sort(arrayShaker);
        //EvenOddSort.sort(arrayEvenOdd);
        //InsertionSort.sort(arrayInsertion);
        //SelectionSort.sort(arraySelection);
        //CombSort.sort(arrayComb);
        ShellSort.sort(arrayShell);
        for (int i :
                arrayShell) {
            System.out.println(i);
        }
    }

    private SortTester() {
    }

    private static void arrayInit(int size) {
        array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }
}
