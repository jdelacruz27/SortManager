package com.sparta.jian.System;


import com.sparta.jian.Factory.SortFactory;
import com.sparta.jian.Sorter.SorterAlgorithm;

import java.util.Arrays;
import java.util.InputMismatchException;


public class Starter {


    public static void start() {
        long start;
        long end;
        SortFactory sortFactory = new SortFactory();
        int option;
        int[] arrayNumbers;
        int inOrder;
        try {
            option = Input.menu();
            switch (option) {
                case 1:
                    arrayNumbers = Input.inputNumbers();
                    System.out.println("Array to sort:\n" + Arrays.toString(arrayNumbers));
                    SorterAlgorithm sortAlgo2 = sortFactory.getSort(1);
                    start = System.nanoTime();
                    System.out.println("Sorted array:\n" + Arrays.toString(sortAlgo2.sortArray(arrayNumbers)));
                    end = System.nanoTime();
                    System.out.println("Time taken to sort the array: " + (end - start) + "ns");
                    break;
                case 2:
                    arrayNumbers = Input.inputNumbers();
                    System.out.println("Array to sort:\n" + Arrays.toString(arrayNumbers));
                    SorterAlgorithm mergeSort = sortFactory.getSort(2);
                    start = System.nanoTime();
                    System.out.println("Sorted array:\n" + Arrays.toString(mergeSort.sortArray(arrayNumbers)));
                    end = System.nanoTime();
                    System.out.println("Time taken to sort the array: " + (end - start) + "ns");
                    break;

                case 3:
                    arrayNumbers = Input.inputNumbers();
                    inOrder = Input.whichOrder();
                    System.out.println("Array to sort:\n" + Arrays.toString(arrayNumbers));
                    SorterAlgorithm tree = sortFactory.getSort(3);
                    tree.addElements(arrayNumbers);
                    if (inOrder == 1){
                        start = System.nanoTime();
                        System.out.println("Sorted array:\n" + Arrays.toString(tree.getSortedTreeAsc()));
                        end = System.nanoTime();
                        System.out.println("Time taken to sort the array: " + (end - start) + "ns");
                    } else if (inOrder == 2){
                        start = System.nanoTime();
                        System.out.println("Sorted array:\n" + Arrays.toString(tree.getSortedTreeDesc()));
                        end = System.nanoTime();
                        System.out.println("Time taken to sort the array: " + (end - start) + "ns");
                    }

                    break;
                default:
                    System.out.println("Invalid input. Please select enter a number corresponding to a sorter");
            }
        } catch (InputMismatchException e) {
            Logging.logger.error(e.getMessage(), e);
            System.out.println("Please enter a number corresponding to the number");
        }
    }
}
