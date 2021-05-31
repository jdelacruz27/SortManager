package com.sparta.jian.System;

import java.util.Scanner;

public class Input {

    public static int[] inputNumbers() {
        int[] array;
        int size;
        System.out.println("How many numbers to enter:");
        Scanner scanSize = new Scanner(System.in);
        size = scanSize.nextInt();

        array = new int[size];

        for (int i = 0; i <= size-1; i++) {
            System.out.println("Enter number " + (i+1) + ": ");
            Scanner scanNumbers = new Scanner(System.in);
            array[i] = scanNumbers.nextInt();
        }

        return array;
    }
    public static int menu(){
        int option;
        System.out.println("Select a sorter\n" +
                "----------------\n" +
                "1. Bubble sort\n" +
                "2. Merge sort\n" +
                "3. Binary Tree sort\n" +
                "Enter number corresponding to a sorter:");
        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();
        return option;
    }
    public static int whichOrder(){
        int option;
        System.out.println("In order options:\n" +
                "------------------\n" +
                "1. Ascending order\n" +
                "2. Descending order\n" +
                "Enter a number corresponding to an order option:");
        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();
        return  option;
    }
}
