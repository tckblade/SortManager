package org.sparta.tk.sorters;

/**
 * Made By Tolga Komur
 */
public class MergeSorter implements Sorter {

    @Override
    public int[] sortArray(int[] unsortedArray) {
        return mergeSorter(unsortedArray);
    }

    private int[] mergeSorter(int[] splittingUnsortedArray) {
        if (splittingUnsortedArray.length < 2) {
            return splittingUnsortedArray;
        }

        int indexArrayFirst = splittingUnsortedArray.length / 2;
        int indexArraySecond = splittingUnsortedArray.length - indexArrayFirst;
        int[] arrayOne = new int[indexArrayFirst];
        int[] arrayTwo = new int[indexArraySecond];

        for (int i = 0; i < indexArrayFirst; i++) {
            arrayOne[i] = splittingUnsortedArray[i];
        }
        for (int j = 0; j < indexArraySecond; j++) {
            arrayTwo[j] = splittingUnsortedArray[j + indexArrayFirst];
        }
        return mergeArray(mergeSorter(arrayOne), mergeSorter(arrayTwo));
    }

    private int[] mergeArray(int[] leftArray, int[] rightArray) {
        int sizeOfArray = leftArray.length + rightArray.length;
        int[] toBeCombinedArray = new int[sizeOfArray];
        int leftArrayLength = leftArray.length;
        int rightArrayLength = rightArray.length;
        int leftArrayIndex = 0;
        int rightArrayIndex = 0;

        for (int i = 0; i < sizeOfArray; i++) {
            if (leftArrayIndex == leftArrayLength) {
                toBeCombinedArray[i] = rightArray[rightArrayIndex];
                rightArrayIndex++;
            } else if (rightArrayIndex == rightArrayLength) {//change to else later --
                toBeCombinedArray[i] = leftArray[leftArrayIndex];
                leftArrayIndex++;
            } else if (leftArray[leftArrayIndex] < rightArray[rightArrayIndex]) {
                toBeCombinedArray[i] = leftArray[leftArrayIndex];
                leftArrayIndex++;
            } else {//change to else later -- if (leftArray[leftArrayIndex] >= rightArray[rightArrayIndex])
                toBeCombinedArray[i] = rightArray[rightArrayIndex];
                rightArrayIndex++;
            }
        }
        return toBeCombinedArray;
    }

    @Override
    public String toString() {
        return "Merge Sorter";
    }
}


