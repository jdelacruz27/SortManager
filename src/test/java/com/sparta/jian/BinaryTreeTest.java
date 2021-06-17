package com.sparta.jian;

import com.sparta.jian.Exception.ChildNotFoundException;
import com.sparta.jian.Interface.BinaryTree;
import com.sparta.jian.Sorter.BinaryTreeSortImplementation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {
    BinaryTree binaryTree;

    @BeforeEach
    public void init(){
        binaryTree = new BinaryTreeSortImplementation();
    }

    @Test
    @DisplayName("Return the root element")
    public void shouldReturnRootElement() {
        int[] array = {15, 6, 20, 18, 7};
        binaryTree.addElements(array);
        Assertions.assertEquals(15, binaryTree.getRootElement());
    }

    @Test
    @DisplayName("return the number of elements in the tree")
    public void shouldReturnNumberOfElements() {
        int[] array = {15, 6, 20, 18, 7};
        binaryTree.addElements(array);
        Assertions.assertEquals(5, binaryTree.getNumberOfElements());
    }

    @Test
    @DisplayName("should not add duplicate values in the binary tree")
    public void shouldNotAddDuplicateValuesInTheTree() {
        int[] array = {5, 27, 10, 5, 1};
        binaryTree.addElements(array);
        Assertions.assertEquals(4, binaryTree.getNumberOfElements());
    }

    @Test
    @DisplayName("should be able to check if the element is in the tree")
    public void shouldCheckIfTheElementExist() {
        int[] array = {5, 27, 10, 5, 1};
        binaryTree.addElements(array);
        Assertions.assertTrue(binaryTree.findElement(27));
        Assertions.assertFalse(binaryTree.findElement(20));
    }

    @Test
    @DisplayName("should return the left or right child of an element in the tree")
    public void shouldReturnChild() throws ChildNotFoundException {
        int[] array = {5, 27, 10, 4, 1};
        binaryTree.addElements(array);
        Assertions.assertEquals(10, binaryTree.getLeftChild(27));
        Assertions.assertEquals(27, binaryTree.getRightChild(5));
    }

    @Test
    @DisplayName("should return an exception if a child does not exist")
    public void shouldThrowAnException() {
        int[] array = {5, 27, 15, 4, 1};
        binaryTree.addElements(array);
        Assertions.assertThrows(ChildNotFoundException.class, () -> binaryTree.getLeftChild(15));

    }

    @Test
    @DisplayName("Should return a sorted tree in Ascending order")
    public void shouldReturnAscOrder() {
        int[] array = {27, 20, 29, 28, 30, 15, 24};
        binaryTree.addElements(array);
        Assertions.assertArrayEquals(new int[]{15, 20, 24, 27, 28, 29, 30}, binaryTree.getSortedTreeAsc());
    }

    @Test
    @DisplayName("Should return a sorted tree in Ascending order")
    public void shouldReturnDescOrder() {
        int[] array = {27, 20, 29, 28, 30, 15, 24};
        binaryTree.addElements(array);
        Assertions.assertArrayEquals(new int[]{30, 29, 28, 27, 24, 20, 15}, binaryTree.getSortedTreeDesc());
    }

}
