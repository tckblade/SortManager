package org.sparta.tk.manager;

import org.sparta.tk.sorters.Sorter;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
/**
 * Made by Tolga Komur.
 */
public class SortFactory {

    //Get instance of sort type corresponding to user input from terminal.
    public static Sorter getInstanceTerminalReply(String name) {
        if (name != null) {
            Class selectedSorter = null;
            try {
                selectedSorter = Class.forName("org.sparta.tk.sorters." + name);
                return (Sorter) selectedSorter.getDeclaredConstructor().newInstance();
            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    //Get instance of sort type specified in "sort.properties" file
    public static Sorter getInstance() {
        try (FileReader reader = new FileReader("resources/sort.properties")) {
            Properties properties = new Properties();
            properties.load(reader);
            String sorter = properties.getProperty("sorter");
            Class selectedSorter = Class.forName(sorter);
            return (Sorter) selectedSorter.getDeclaredConstructor().newInstance();
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
