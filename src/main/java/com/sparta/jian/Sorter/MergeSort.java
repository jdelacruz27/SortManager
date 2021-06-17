package com.sparta.jian.Sorter;

import com.sparta.jian.Interface.Sorter;

import java.util.Arrays;

public class MergeSort implements Sorter {


    @Override
    public int[] sortArray(int[] arrayToSort) {
        int[] result;
        result = doMergeSort(arrayToSort);
        return result;
    }

    public int[] doMergeSort(int[] array){
        int[] arraySplitOne = Arrays.copyOfRange(array, 0, array.length/2);
        int[] arraySplitTwo = Arrays.copyOfRange(array, array.length/2, array.length);
        if (array.length == 1){
            return array;
        }

        arraySplitOne = doMergeSort(arraySplitOne);
        arraySplitTwo = doMergeSort(arraySplitTwo);
        return merge(arraySplitOne, arraySplitTwo);
    }

    private int[] merge(int[] arraySplitOne, int[] arraySplitTwo) {
        int[] resultArray = new int[arraySplitOne.length + arraySplitTwo.length];

        int onePosition = 0;
        int twoPosition = 0;
        int resultPosition = 0;

        while(arraySplitOne.length > onePosition && arraySplitTwo.length > twoPosition){
            if (arraySplitOne[onePosition] > arraySplitTwo[twoPosition]){
                resultArray[resultPosition++] = arraySplitTwo[twoPosition++];
            } else {
                resultArray[resultPosition++] = arraySplitOne[onePosition++];
            }
        }

        while(onePosition < arraySplitOne.length){
            resultArray[resultPosition++] = arraySplitOne[onePosition++];
        }

        while(twoPosition < arraySplitTwo.length){
            resultArray[resultPosition++] = arraySplitTwo[twoPosition++];
        }

        return resultArray;

    }


}


