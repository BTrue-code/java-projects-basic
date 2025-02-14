package org.example;

public class CodingTaskE2 {
    public static void main(String[] args) {

    /* Create an array of integer values. After the array is created, calculate the
       sum of all stored elements in that array.
     */


       int[] values = {5, 10, 2, 4, 7};
       int[] values2 = {20, 12, 8, 38, 1};
       int sum1 = 0;
       int sum2 = 0;

    // for loop example
       for (int i = 0; i < values.length; i++) {
           sum1 += values[i];
           sum2 += values2[i];
       }
        System.out.println("The total sum of my array is: " + sum1);
        System.out.println("The total sum of my array is: " + sum2);


    //Enhanced for loop example
        for (int value : values) {
            value =+ sum1;
        }
        for (int value : values) {
            value += sum2;
        }
        System.out.println("The total sum of my array is: " + sum1);
        System.out.println("The total sum of my array is: " + sum2);
    }

}
