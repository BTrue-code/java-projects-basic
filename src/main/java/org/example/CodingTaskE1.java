package org.example;

public class CodingTaskE1 {

    public static void main(String[] args) {

        int[] temps = {79, 66, 74, 68, 84, 80, 82};
        int highestTemp = temps[0];
        int lowestTemp = temps[0];


        for (int i = 0; i < temps.length; i++) {
           if (temps[i] > highestTemp) {
               highestTemp = temps[i];
           }else if (temps[i] < lowestTemp) {
               lowestTemp = temps[i];
            }
        }

        System.out.println("Highest temperature this week is: " + highestTemp + "°F");
        System.out.println("Lowest temperature this week is: " + lowestTemp + "°F");
    }

}
