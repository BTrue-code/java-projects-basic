package org.example;

public class CodingTaskE2 {
    public static void main(String[] args) {

       int[] values = {5, 10, 2, 4, 7};
       int[] values2 = {20, 12, 8, 38, 1};
       int sum1 = 0;
       int sum2 = 0;


       for (int i = 0; i < values.length; i++) {
           sum1 += values[i];
           sum2 += values2[i];
       }
        System.out.println("The total sum of my array is: " + sum1);
        System.out.println("The total sum of my array is: " + sum2);
    }

}
