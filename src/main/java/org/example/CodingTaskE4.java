package org.example;

public class CodingTaskE4 {

    public static void main(String[] args) {

    /* Create a 2D array of integers. Develop a program which will calculate the
       sum of even and odd numbers for that array.
    */


        int[][] values = {
                {101, 13, 44},
                {62, 111, 102},
                {4, 72, 9},
                {36, 58, 21}
        };
            int evenSum = 0;
            int oddSum = 0;


    // for loop/ nested for loop example
        for (int i = 0; i < values.length; i++) {

            for (int j = 0; j < values[j].length; j++) {
             if (values[i][j] % 2 == 0) {
                 evenSum += values[i][j];
             } else {
                 oddSum += values[i][j];
             }
            }
        }
            System.out.println("Total sum of EVEN numbers are: " + evenSum);
            System.out.println("Total sum of ODD numbers are: " + oddSum);

    }
}