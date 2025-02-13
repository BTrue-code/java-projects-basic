package org.example;

public class CodingTaskE3 {

    public static void main(String[] args) {

        int[][] values = {
                {101, 13, 44},
                {62, 111, 102},
                {4, 72, 9},
                {36, 58, 21}
        };

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[j].length; j++) {
                if (values[i][j] % 2 == 0) {
                    System.out.println(values[i][j]);
                }
            }
        }

    }
}
