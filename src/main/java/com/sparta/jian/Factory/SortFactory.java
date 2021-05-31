package com.sparta.jian.Factory;

import com.sparta.jian.Sorter.BinaryTreeSortImplementation;
import com.sparta.jian.Sorter.BubbleSort;
import com.sparta.jian.Sorter.MergeSort;
import com.sparta.jian.Sorter.SorterAlgorithm;
import com.sparta.jian.System.Input;

import java.util.Arrays;
import java.util.Scanner;

public class SortFactory {
    public SorterAlgorithm getSort(int option){
//        int[] arrayNumbers;
//        arrayNumbers = Input.inputNumbers();
        SorterAlgorithm sortAlgo = null;
        switch (option){
            case 1:
                sortAlgo = new BubbleSort();
                break;
            case 2:
                sortAlgo = new MergeSort();
                break;
            case 3:
              sortAlgo = new BinaryTreeSortImplementation();
                break;
        }
        return sortAlgo;
    }
}
