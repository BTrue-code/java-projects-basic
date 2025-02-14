package org.example;

public class CodingTaskE8 {

    public static void main(String[] args) {

    // Maximum and minimum number in the array?
        int[] array = {59, 21, 60, 8, -2, 0, 16};
        int max = array[0];
        int min = array[0];


    // for loop example
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maximum number in your array is: " + max);
        System.out.println("Minimum number in your array is: " + min);

    // Enhance for loop example
        int[] array2 = {46, 9, -8, -2, 123, 32, 5};


        for(int value : array2) {
            if (value > max) {
                max = value;
            }if (value < min) {
                min = value;
            }
        }

        System.out.println("Maximum number in your array is: " + max);
        System.out.println("Minimum number in your array is: " + min);

    }
}
