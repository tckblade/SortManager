package org.sparta.tk.manager;

import org.sparta.tk.display.DisplayManager;
import org.sparta.tk.exceptions.SorterException;
import org.sparta.tk.sorters.Sorter;
import org.apache.log4j.Logger;

/**
 * Made by Tolga Komur.
 */
public class SortManager {

    static final String LOG_PROPERTIES_FILE = "resources/log4j.properties";
    static Logger log = Logger.getLogger(Starter.class.getName());
    private DisplayManager displayManager = new DisplayManager();

    //Gets the selected sort array type from user, sorts it & then displays sorted array..
    public void runArraySorter(int[] unsortedArray) throws SorterException {
        String name = displayManager.getTerminalReply();
        Sorter sorter = SortFactory.getInstanceTerminalReply(name);
        if (sorter != null) {
            int[] sortedArray = sorter.sortArray(unsortedArray.clone());
            displayOutputAndResult(unsortedArray, sortedArray, sorter.toString());
            log.debug("Successfully sorted with " + sorter.toString());
        } else {
            throw new SorterException("Unable to run the selected sorter");
        }
    }

    //Call display manager to print array
    private void displayOutputAndResult(int[] unsortedArray, int[] sortedArray, String arraySortType) {
        displayManager.displaySortType(arraySortType);
        displayManager.displayUnsortedArray(unsortedArray);
        displayManager.displaySortedArray(sortedArray);
    }
}
