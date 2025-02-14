package org.example;
import java.util.Scanner;

public class CodingTaskE6 {

    public static void main(String[] args) {

    //Write a java program to check whether a given number is prime or not

        Scanner scanner = new Scanner(System.in);

        int number;
        int indicator = 0;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        //Prime number can't start with 0 or 1... if it does will automatically state "not prime number"
        if (number < 0 || number == 0 || number == 1) {
            System.out.println(number + " is NOT a prime number");
        }else { //Start number from 2 and will calucalte to fine the middle number of the selected number... EX middle number of 20 is 10
            int midNumber = number / 2;
            for (int i = 2; i <= midNumber; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is NOT a prime number");
                    indicator = 1;
                    break; //IMPORTANT to break out of the after checking the middle number
                }
            }
            //INDICATOR value is serve as an indicator if it 0 then will print as a Prime number
            if (indicator == 0) {
                System.out.println(number + " is a Prime number!");
            }
        }
        scanner.close();

    }
}

