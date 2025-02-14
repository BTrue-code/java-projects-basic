package org.example;
import java.util.Scanner;

public class CodingTaskE5 {

    public static void main(String[] args) {

    // Write a program to swap 2 numbers without a temporary variable

    // Using a Scanner to get user number
    Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        System.out.print("Enter your first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter your second number: ");
        num2 = scanner.nextInt();


        System.out.println("BEFORE swapping your first number is " + num1);
        System.out.println("BEFORE swapping your second number is " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("AFTER swapping your first number is " + num1);
        System.out.println("AFTER swapping your second number is " + num2);

    scanner.close();

        System.out.println();

    // Using set values
        int val1 = 21;
        int val2 = 7;

        System.out.println("BEFORE swapping your first number is " + val1);
        System.out.println("BEFORE swapping your second number is " + val2);

        val1 = val1 + val2;
        val2 = val1 - val2;
        val1 = val1 - val2;

        System.out.println("AFTER swapping your first number is " + val1);
        System.out.println("AFTER swapping your second number is " + val2);
    }
}
