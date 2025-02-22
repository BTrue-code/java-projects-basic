package org.example;

public class CodingTaskE1 {

    public static void main(String[] args) {

        /* Create a program that uses an array to store a list of temperatures for a week,
           and then uses a loop to find the highest and lowest temperature for the week
        */

        int[] temps = {79, 66, 74, 68, 84, 80, 82};
        int highestTemp = temps[0];
        int lowestTemp = temps[0];

        // for loop example
        for (int i = 0; i < temps.length; i++) {
           if (temps[i] > highestTemp) {
               highestTemp = temps[i];
           }else if (temps[i] < lowestTemp) {
               lowestTemp = temps[i];
            }
        }
        System.out.println("Highest temperature this week is: " + highestTemp + "°F");
        System.out.println("Lowest temperature this week is: " + lowestTemp + "°F");


        // Enhanced for loop example
        for(int temperature : temps) {
            if(temperature > highestTemp) {
                highestTemp = temperature;
            }
            if (temperature < lowestTemp) {
                lowestTemp = temperature;
            }
        }
        System.out.println("Highest temperature this week is: " + highestTemp + "°F");
        System.out.println("Lowest temperature this week is: " + lowestTemp + "°F");
    }

}
