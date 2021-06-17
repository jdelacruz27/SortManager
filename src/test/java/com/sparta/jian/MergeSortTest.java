package com.sparta.jian;

import com.sparta.jian.Sorter.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeSortTest {
    @Test
    @DisplayName("returns a sorted array using merge sort")
    public void shouldReturnSortedArrayMergeSort() {
        int[] array = {10, 5, 65, 1, 27, 7, 96};
        MergeSort mergeSort = new MergeSort();
        Assertions.assertArrayEquals(new int[]{1, 5, 7, 10, 27, 65, 96}, mergeSort.sortArray(array));
    }
}
