package com.sparta.jian.Sorter;


import com.sparta.jian.Interface.Sorter;

import java.util.Arrays;

public class BubbleSort extends SorterAlgorithm implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arrayToSort.length-1; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    temp = arrayToSort[i + 1];
                    arrayToSort[i + 1] = arrayToSort[i];
                    arrayToSort[i] = temp;
                    sorted = false;
                }
            }
        }
        return arrayToSort;
    }
}
