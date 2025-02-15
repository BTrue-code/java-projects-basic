package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class CodingTaskE9 {

    public static void main(String[] args) {

    // Write a java program to find the second largest number in the array?


    // Example using set array
        int[] array = {0, 2, 21, 15, 34, 16};

        Arrays.sort(array);

        System.out.println("Second Highest number in the array is: " + array[array.length-2]);

    }
}
