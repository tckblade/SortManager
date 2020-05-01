package org.sparta.tk;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.tk.exceptions.SorterException;
import org.sparta.tk.manager.SortManager;

class SorterPerformanceTester {
    @Test
    @DisplayName("Test Performance")
    public void runPerformanceTest() {
        long startTime = System.currentTimeMillis();
        int[] arrayOfIntToSort = {2, 4, 5, 67, 3,7,8,13,55};
        SortManager sortManager = new SortManager();
        try {
            sortManager.runArraySorter(arrayOfIntToSort);
        } catch (SorterException e) {
            String message = e.getMessage();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken in millis: " + (endTime - startTime));
    }
}
