package com.sparta.jian;

import com.sparta.jian.Sorter.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    @Test
    @DisplayName("returns a sorted array using bubble sort")
    public void shouldReturnSortedArrayBubbleSort() {
        int[] array = {10, 5, 65, 1, 27, 7, 96};
        BubbleSort bubbleSort = new BubbleSort();
        Assertions.assertArrayEquals(new int[]{1, 5, 7, 10, 27, 65, 96}, bubbleSort.sortArray(array));
    }
}
