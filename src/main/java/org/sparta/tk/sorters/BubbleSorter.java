package org.sparta.tk.sorters;

public class BubbleSorter implements Sorter{

    @Override
    public int[] sortArray(int[] unsortedArray) {
        return bubbleSorter(unsortedArray);
    }

    public int[] bubbleSorter(int[] listOfNumbers) {
        boolean sortCompleted = false;
        do {
            sortCompleted = true;
            for (int i = 0; i < listOfNumbers.length - 1; i++) {
                if (listOfNumbers[i] > listOfNumbers[i + 1]) {
                    int temp = listOfNumbers[i];
                    listOfNumbers[i] = listOfNumbers[i + 1];
                    listOfNumbers[i + 1] = temp;
                    sortCompleted = false;
                }
            }
        } while (!sortCompleted);
        return listOfNumbers;
    }

    @Override
    public String toString() {
        return "Bubble Sorter";
    }

    //    public int[] sortArrayNumbers(int[] compiledArray) {
//        boolean sortCompleted = false;
//        while (!sortCompleted) {
//            sortCompleted = true;
//            for (int i = 0; i < compiledArray.length - 1; i++) {
//                if (compiledArray[i] > compiledArray[i + 1]) {
//                    int temp = compiledArray[i];
//                    compiledArray[i] = compiledArray[i + 1];
//                    compiledArray[i + 1] = temp;
//                    sortCompleted = false;
//                }
//            }
//        }
//        return compiledArray;
//    }

}
