package org.sparta.tk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.tk.display.DisplayManager;
import org.sparta.tk.manager.SortFactory;
import org.sparta.tk.sorters.Sorter;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Made by Tolga Komur.
 */
public class SorterTester {
    private int[] unsortedArray;
    private int[] sortedArray;
    private int[] emptyArray;
    private int[] zeroArray;
    private Sorter sorter;


    @BeforeEach
    void setUp() {
        sorter = SortFactory.getInstance();
        unsortedArray = new int[]{12, 3, 7, 6, -5, -4};
        emptyArray = new int[]{};
        zeroArray = new int[]{0, 0, 0, 0, 0, 0};

    }

    @Test
    @DisplayName("Check Empty Array")
    void testIfEmptyArray() {
        sortedArray = sorter.sortArray(emptyArray);
        assertEquals(Arrays.toString(sortedArray), Arrays.toString(new int[]{}));
    }

    @Test
    @DisplayName("Check Expected Result For Sorter")
    void testIfExpectedSorter() {
        sortedArray = sorter.sortArray(unsortedArray);
        assertEquals(Arrays.toString(sortedArray), Arrays.toString(new int[]{-5, -4, 3, 6, 7, 12}));
        System.out.println(Arrays.toString(sortedArray));
    }

    @Test
    @DisplayName("Check " + " values Results")
    void testHandlingOfZeroValueArray() {
        sortedArray = sorter.sortArray(zeroArray);
        assertEquals(Arrays.toString(sortedArray), Arrays.toString(new int[]{0, 0, 0, 0, 0, 0}));
    }

    @Test
    @DisplayName("Performance")
    void testPerformance() {
        SorterPerformanceTester sorterPerformanceTester = new SorterPerformanceTester();
        sorterPerformanceTester.runPerformanceTest();
    }

    @Test
    @DisplayName("get message")
    void getTheDisplay() {
        DisplayManager displayManager = new DisplayManager();
        displayManager.getTerminalReply();
    }
}
