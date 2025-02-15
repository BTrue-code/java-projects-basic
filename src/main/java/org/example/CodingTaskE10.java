package org.example;

public class CodingTaskE10 {

    public static void main(String[] args) {

    // Write a program to print out duplicate elements from an Array of Strings?


        String[] myArray = {
                "January",
                "February",
                "March",
                "April",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "September",
                "October",
                "November",
                "December",
                "December"
        };

        // Example using nested for loop
        for(int i = 0; i < myArray.length; i++) {
            for(int j = i+1; j < myArray.length; j++) {
                if(myArray[i] == myArray[j]) {
                    System.out.println("Duplicate Elements are: " + myArray[i]);
                }
            }
        }


    // Example using Enhanced for loop
        for(String month : myArray) {

        }

    }
}
