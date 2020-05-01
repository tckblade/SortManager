package org.sparta.tk.sorters;

import org.sparta.tk.manager.BinaryTreeImpl;
import org.sparta.tk.sorter.BinaryTree;
import java.util.Arrays;
/**
 * Made by Tolga Komur.
 */
public class BinarySorter implements Sorter {

    @Override
    public int[] sortArray(int[] unsortedArray) {
        BinaryTree binaryTree = new BinaryTreeImpl(unsortedArray[0]);
        int[] unsortedArrayWithoutRoot = Arrays.copyOfRange(unsortedArray, 1, unsortedArray.length);
        binaryTree.addElements(unsortedArrayWithoutRoot);
        return binaryTree.getSortedTreeAsc();
    }
}
