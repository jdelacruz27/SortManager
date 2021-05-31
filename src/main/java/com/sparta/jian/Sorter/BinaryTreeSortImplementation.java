package com.sparta.jian.Sorter;

import com.sparta.jian.Exception.ChildNotFoundException;
import com.sparta.jian.Interface.BinaryTree;


public class BinaryTreeSortImplementation extends SorterAlgorithm implements BinaryTree {
    private Node rootNode;
    private int numberOfNodes = 1;
    private int[] sorted;
    private int count;


    //Inner Class Node
    public static class Node {
        private final int value;
        Node leftChild = null;
        Node rightChild = null;

        public Node(int value) {
            this.value = value;
        }
    }


    public BinaryTreeSortImplementation() {
    }


    @Override
    public int getRootElement() {
        return rootNode.value;
    }


    @Override
    public int getNumberOfElements() {

        return numberOfNodes;
    }

    @Override
    public void addElement(int element) {
        Node node = rootNode;
        boolean track = true;
        while (track) {
            if (node.value == element) {
                return;
            } else if (node.value > element) {
                if (node.leftChild == null) {
                    node.leftChild = new Node(element);
                    numberOfNodes++;
                    track = false;
                } else {
                    node = node.leftChild;
                }
            } else {
                if (node.rightChild == null) {
                    node.rightChild = new Node(element);
                    numberOfNodes++;
                    track = false;
                } else {
                    node = node.rightChild;
                }
            }
        }
    }

    @Override
    public void addElements(int[] elements) {
        rootNode = new Node(elements[0]);
        for (int i = 1; i < elements.length; i++) {
            addElement(elements[i]);
        }
    }


    @Override
    public boolean findElement(int element) {
        //return findElement(rootNode, element);
        Node node = rootNode;
        while (true) {
            if (node.value == element) {
                return true;
            } else if (node.value > element) {
                if (node.leftChild != null) {
                    node = node.leftChild;
                } else {
                    return false;
                }
            } else {
                if (node.rightChild != null) {
                    node = node.rightChild;
                } else {
                    return false;
                }
            }
        }
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        if (!findElement(element)) {
            throw new ChildNotFoundException("Element does not exist");
        }

        Node node = rootNode;

        while (true) {
            if ((node.value == element) && (node.leftChild != null)) {
                return node.leftChild.value;
            } else if ((node.value > element) && (node.leftChild != null)) {
                node = node.leftChild;
            } else if ((node.value < element) && (node.rightChild != null)) {
                node = node.rightChild;
            } else {
                throw new ChildNotFoundException("Left child not Found");
            }
        }
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        if (!findElement(element)) {
            throw new ChildNotFoundException("Child not found");
        }
        Node node = rootNode;
        while (true) {
            if ((node.value == element) && (node.rightChild != null)) {
                return node.rightChild.value;
            } else if ((node.value > element) && (node.leftChild != null)) {
                node = node.leftChild;
            } else if ((node.value < element) && (node.rightChild != null)) {
                node = node.rightChild;
            } else {
                throw new ChildNotFoundException("Right child not found");
            }
        }
    }

    @Override
    public int[] getSortedTreeAsc() {
        sorted = new int[numberOfNodes];
        count = 0;
        sortTreeAsc(rootNode);
        return sorted;
    }

    private void sortTreeAsc(Node node) {
        if (node.leftChild != null) {
            sortTreeAsc(node.leftChild);
        }
        sorted[count++] = node.value;

        if (node.rightChild != null) {
            sortTreeAsc(node.rightChild);
        }
    }

    @Override
    public int[] getSortedTreeDesc() {
        sorted = new int[numberOfNodes];
        count = 0;
        sortTreeDesc(rootNode);
        return sorted;
    }

    private void sortTreeDesc(Node node) {
        if (node.rightChild != null) {
            sortTreeDesc(node.rightChild);
        }
        sorted[count++] = node.value;

        if (node.leftChild != null) {
            sortTreeDesc(node.leftChild);
        }
    }
}
