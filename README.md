# SortManager

The sort manager sorts an array of unordered numbers, using Bubble sort, Merge sort or Binary Search Tree sort algorithms into an ordered sequence. This program was done using Intellij in Java with unit testing done using JUNIT, MVC design pattern & factory method pattern, Log4j for logging and error reporting. The program functions by using a sort factory to get an instance of a sorter depending on the user input in the terminal. Each sorting algorithm requires only the Sorter interface to be implemented which the sort manager uses to pass the unordered array and retrieve a response. This eliminates the need to bind different sorting algorithm in code, allows for lose-coupling and any new sorting algorithm just need the Sorter interface implemented.

If the user wishes to do unit testing for specific sort algorithms, the sort factory can get an instance of a specific sort type by writing the directory of the new sort algorithm into the sort.properties file.



# Guide

How to use?

1. Enter random unordered sequence of positive and/or negative numbers into declared int array in Main.

  `int[] arrayOfIntToSort = {2, -4, 5, 67, 3};`
  
2. Run application.

3. Select sort type you wish to use.




