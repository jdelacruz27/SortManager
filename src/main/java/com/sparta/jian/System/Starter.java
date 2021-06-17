package com.sparta.jian.System;


import com.sparta.jian.Factory.SortFactory;
import com.sparta.jian.Interface.Sorter;

import java.util.Arrays;
import java.util.InputMismatchException;


public class Starter {


    public static void start() {
        long start;
        long end;
        int option;
        int[] arrayNumbers;
        int inOrder;
        try {
            option = Input.menu();
            switch (option) {
                case 1:
                    arrayNumbers = Input.inputNumbers();
                    System.out.println("Array to sort:\n" + Arrays.toString(arrayNumbers));
                    Sorter bubbleSort = SortFactory.getSort(1);
                    start = System.nanoTime();
                    System.out.println("Sorted array:\n" + Arrays.toString(bubbleSort.sortArray(arrayNumbers)));
                    end = System.nanoTime();
                    System.out.println("Time taken to sort the array: " + (end - start)/1000000 + "ms");
                    break;
                case 2:
                    arrayNumbers = Input.inputNumbers();
                    System.out.println("Array to sort:\n" + Arrays.toString(arrayNumbers));
                    Sorter mergeSort = SortFactory.getSort(2);
                    start = System.nanoTime();
                    System.out.println("Sorted array:\n" + Arrays.toString(mergeSort.sortArray(arrayNumbers)));
                    end = System.nanoTime();
                    System.out.println("Time taken to sort the array: " + (end - start)/1000000 + "ms");
                    break;

                case 3:
                    arrayNumbers = Input.inputNumbers();
                    System.out.println("Array to sort:\n" + Arrays.toString(arrayNumbers));
                    Sorter tree = SortFactory.getSort(3);
                    start = System.nanoTime();
                    System.out.println("Sorted array:\n" + Arrays.toString(tree.sortArray(arrayNumbers)));
                    end = System.nanoTime();
                    System.out.println("Time taken to sort the array: " + (end - start)/1000000 + "ms");

                    break;
                default:
                    System.out.println("Invalid input. Please select enter a number corresponding to a bubbleSort");
            }
        } catch (InputMismatchException e) {
            Logging.logger.error(e.getMessage(), e);
            System.out.println("Please enter a number corresponding to the number");
        }
    }
}
