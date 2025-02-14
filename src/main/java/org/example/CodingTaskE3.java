package org.example;

public class CodingTaskE3 {

    public static void main(String[] args) {

    /*  Create a 2D array or integer type where you will store odd and even
        numbers. Develop a program which will identify/print the even numbers
        only.
    */

        int[][] values = {
                {101, 13, 44},
                {62, 111, 102},
                {4, 72, 9},
                {36, 58, 21}
        };


    // for loop/ nested for loop example
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[j].length; j++) {
                if (values[i][j] % 2 == 0) {
                    System.out.println(values[i][j]);
                }
            }
        }

    }
}
