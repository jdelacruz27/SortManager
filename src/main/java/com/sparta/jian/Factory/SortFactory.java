package com.sparta.jian.Factory;

import com.sparta.jian.Interface.Sorter;
import com.sparta.jian.Sorter.BinaryTreeSortImplementation;
import com.sparta.jian.Sorter.BubbleSort;
import com.sparta.jian.Sorter.MergeSort;

public class SortFactory {
    public static Sorter getSort(int option){
        Sorter sortAlgo = null;
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
