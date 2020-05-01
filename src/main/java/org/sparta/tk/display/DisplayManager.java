package org.sparta.tk.display;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Made by Tolga Komur.
 */
public class DisplayManager {
    private Scanner scanner = new Scanner(System.in);

    public void displayUnsortedArray(int[] arrayToDisplay){
        System.out.println("Unsorted Array: "+Arrays.toString(arrayToDisplay));
    }
    public void displaySortedArray(int[] arrayToDisplay){
        System.out.println("Sorted Array:   "+Arrays.toString(arrayToDisplay));
    }
    public void displaySortType(String type){
        System.out.println("Sorted using "+type+", sort has been run!");
    }

    public String getTerminalReply(){
        System.out.println("Enter which sort you want: ");
        String[] sortNames =  getMenuItems();
        String sortTypeEnter = scanner.nextLine();
        return sortNames[Integer.parseInt(sortTypeEnter)-1];
    }

    private String[] getMenuItems(){
        File sortDirectory = new File("src/main/java/org/sparta/tk/sorters");
        String[] names = sortDirectory.list();
        int index = 1;
        assert names != null;
        for (int i = 0; i <names.length-1; i++)
        {
            names[i]=names[i].substring(0,names[i].indexOf("."));
            System.out.println(index + ". "+names[i]);
            index++;
        }
        return names;
    }
}
