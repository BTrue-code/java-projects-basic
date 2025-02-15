package org.example;

public class CodingTaskE7 {

    public static void main(String[] args) {

    //Write a Java Program to print the first 10 numbers of Fibonacci series
    int limit = 10, firstNum = 0, secondNum = 1;
    int nextNum;

    // for loop example
    for (int i = 1; i <= limit; i++) {
        System.out.print(firstNum + " ");
        nextNum = firstNum + secondNum;
        firstNum = secondNum;
        secondNum = nextNum;
    }


    // While loop example
    /*int counter = 1;

    while(counter <= limit) {
        System.out.print(firstNum + ", ");
        nextNum = firstNum + secondNum;
        firstNum = secondNum;
        secondNum = nextNum;
        counter++;
    }*/

    }
}
