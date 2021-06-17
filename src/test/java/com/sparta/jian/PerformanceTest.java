package com.sparta.jian;

import com.sparta.jian.Sorter.BinaryTreeSortImplementation;
import com.sparta.jian.Sorter.BubbleSort;
import com.sparta.jian.Sorter.MergeSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class PerformanceTest {

    BubbleSort bubbleSort;
    MergeSort mergeSort;
    BinaryTreeSortImplementation binaryTree;
    Random rand;

    @BeforeEach
    public void init(){
        bubbleSort = new BubbleSort();
        mergeSort = new MergeSort();
        binaryTree = new BinaryTreeSortImplementation();
        rand = new Random();
    }


    @Test
    @DisplayName("BubbleSort, MergeSort and Binary Sort handling 100 elements")
    public void PerformanceTest100Elements(){
        long bubbleTime, mergeTime, treeAscTime, treeDescTime, start, end;
        int[] array10 = new int[100];
        for (int i = 0; i < 10; i++){
            array10[i] = rand.nextInt(2000000);
        }
        start = System.nanoTime();
        bubbleSort.sortArray(array10);
        end = System.nanoTime();
        bubbleTime = end - start;

        start = System.nanoTime();
        mergeSort.sortArray(array10);
        end = System.nanoTime();
        mergeTime = end - start;

        binaryTree.addElements(array10);
        start = System.nanoTime();
        binaryTree.getSortedTreeAsc();
        end = System.nanoTime();
        treeAscTime = end - start;

        start = System.nanoTime();
        binaryTree.getSortedTreeDesc();
        end = System.nanoTime();
        treeDescTime = end - start;

        double bubbleTimeMs = (double)bubbleTime / 1000000;
        double mergeTimeMs = (double)mergeTime/1000000;
        double treeAscTimeMS = (double)treeAscTime/1000000;
        double treeDescTimeMS = (double)treeDescTime/1000000;

        System.out.println("\nTime for a sorter to sort 100 elements: ");
        System.out.println("Bubble Sort: " + bubbleTime + "ns or " + bubbleTimeMs + "ms" );
        System.out.println("Merge Sort: " + mergeTime + "ns or " + mergeTimeMs + "ms" );
        System.out.println("Binary Tree Sort - Ascending: " + treeAscTime + "ns or " + treeAscTimeMS + "ms" );
        System.out.println("Binary Tree Sort - Descending: " + treeDescTime + "ns or " + treeDescTimeMS + "ms" );

    }

    @Test
    @DisplayName("BubbleSort, MergeSort and Binary Sort handling 1,000 elements")
    public void PerformanceTest1000Elements(){
        long bubbleTime, mergeTime, treeAscTime, treeDescTime, start, end;
        int[] array10 = new int[1000];
        for (int i = 0; i < 100; i++){
            array10[i] = rand.nextInt(2000000);
        }
        start = System.nanoTime();
        bubbleSort.sortArray(array10);
        end = System.nanoTime();
        bubbleTime = end - start;

        start = System.nanoTime();
        mergeSort.sortArray(array10);
        end = System.nanoTime();
        mergeTime = end - start;

        binaryTree.addElements(array10);
        start = System.nanoTime();
        binaryTree.getSortedTreeAsc();
        end = System.nanoTime();
        treeAscTime = end - start;

        start = System.nanoTime();
        binaryTree.getSortedTreeDesc();
        end = System.nanoTime();
        treeDescTime = end - start;

        double bubbleTimeMs = (double)bubbleTime / 1000000;
        double mergeTimeMs = (double)mergeTime/1000000;
        double treeAscTimeMS = (double)treeAscTime/1000000;
        double treeDescTimeMS = (double)treeDescTime/1000000;

        System.out.println("\nTime for a sorter to sort 1,000 elements: ");
        System.out.println("Bubble Sort: " + bubbleTime + "ns or " + bubbleTimeMs + "ms" );
        System.out.println("Merge Sort: " + mergeTime + "ns or " + mergeTimeMs + "ms" );
        System.out.println("Binary Tree Sort - Ascending: " + treeAscTime + "ns or " + treeAscTimeMS + "ms" );
        System.out.println("Binary Tree Sort - Descending: " + treeDescTime + "ns or " + treeDescTimeMS + "ms" );

    }

    @Test
    @DisplayName("BubbleSort, MergeSort and Binary Sort handling 10,000 elements")
    public void PerformanceTest10000Elements(){
        long bubbleTime, mergeTime, treeAscTime, treeDescTime, start, end;
        int[] array10 = new int[10000];
        for (int i = 0; i < 100; i++){
            array10[i] = rand.nextInt(2000000);
        }
        start = System.nanoTime();
        bubbleSort.sortArray(array10);
        end = System.nanoTime();
        bubbleTime = end - start;

        start = System.nanoTime();
        mergeSort.sortArray(array10);
        end = System.nanoTime();
        mergeTime = end - start;

        binaryTree.addElements(array10);
        start = System.nanoTime();
        binaryTree.getSortedTreeAsc();
        end = System.nanoTime();
        treeAscTime = end - start;

        start = System.nanoTime();
        binaryTree.getSortedTreeDesc();
        end = System.nanoTime();
        treeDescTime = end - start;

        double bubbleTimeMs = (double)bubbleTime / 1000000;
        double mergeTimeMs = (double)mergeTime/1000000;
        double treeAscTimeMS = (double)treeAscTime/1000000;
        double treeDescTimeMS = (double)treeDescTime/1000000;

        System.out.println("\nTime for a sorter to sort 10,000 elements: ");
        System.out.println("Bubble Sort: " + bubbleTime + "ns or " + bubbleTimeMs + "ms" );
        System.out.println("Merge Sort: " + mergeTime + "ns or " + mergeTimeMs + "ms" );
        System.out.println("Binary Tree Sort - Ascending: " + treeAscTime + "ns or " + treeAscTimeMS + "ms" );
        System.out.println("Binary Tree Sort - Descending: " + treeDescTime + "ns or " + treeDescTimeMS + "ms" );

    }

    @Test
    @DisplayName("BubbleSort, MergeSort and Binary Sort handling 1,000,000 elements")
    public void PerformanceTest100000Elements(){
        long bubbleTime, mergeTime, treeAscTime, treeDescTime, start, end;
        int[] array10 = new int[1000000];
        for (int i = 0; i < 100; i++){
            array10[i] = rand.nextInt(2000000);
        }
        start = System.nanoTime();
        bubbleSort.sortArray(array10);
        end = System.nanoTime();
        bubbleTime = end - start;

        start = System.nanoTime();
        mergeSort.sortArray(array10);
        end = System.nanoTime();
        mergeTime = end - start;

        binaryTree.addElements(array10);
        start = System.nanoTime();
        binaryTree.getSortedTreeAsc();
        end = System.nanoTime();
        treeAscTime = end - start;

        start = System.nanoTime();
        binaryTree.getSortedTreeDesc();
        end = System.nanoTime();
        treeDescTime = end - start;

        double bubbleTimeMs = (double)bubbleTime / 1000000;
        double mergeTimeMs = (double)mergeTime/1000000;
        double treeAscTimeMS = (double)treeAscTime/1000000;
        double treeDescTimeMS = (double)treeDescTime/1000000;

        System.out.println("\nTime for a sorter to sort 1,000,000 elements: ");
        System.out.println("Bubble Sort: " + bubbleTime + "ns or " + bubbleTimeMs + "ms" );
        System.out.println("Merge Sort: " + mergeTime + "ns or " + mergeTimeMs + "ms" );
        System.out.println("Binary Tree Sort - Ascending: " + treeAscTime + "ns or " + treeAscTimeMS + "ms" );
        System.out.println("Binary Tree Sort - Descending: " + treeDescTime + "ns or " + treeDescTimeMS + "ms" );

    }
}
