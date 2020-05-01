package org.sparta.tk.manager;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.sparta.tk.exceptions.SorterException;

public class Starter {
    static final String LOG_PROPERTIES_FILE = "resources/log4j.properties";
    static Logger log = Logger.getLogger(Starter.class.getName());

    public static void main(String[] args) {
        initialiseLogging();
        log.debug("Entering application.");
        //long startTime = System.currentTimeMillis();
        int[] arrayOfIntToSort = {2, 4, 5, 67, 3};
        SortManager sortManager = new SortManager();
        try {
            sortManager.runArraySorter(arrayOfIntToSort);
        } catch (SorterException e) {
            String message = e.getMessage();
            log.debug(message);
        }
        //long endTime = System.currentTimeMillis();
        //System.out.println("Time taken in nano seconds: "+ (startTime - endTime));
    }

    public static void initialiseLogging() {
        PropertyConfigurator.configure(LOG_PROPERTIES_FILE);
    }
}
