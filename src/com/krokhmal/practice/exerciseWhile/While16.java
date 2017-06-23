package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by NKrok on 08.06.2017.
 */

public class While16 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Enter percent day growth 0 < P < 50%. Start from distance 10 kg.");
        System.out.println("In how many days sum distance will be more then 200 km.");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 0 < P < 50: ");
        double pValue = sc.nextDouble();

        if (0>= pValue || pValue > 50)
            System.out.println("P must be between 0 and 50%. Please restart the program.");
        else{

            int daysCounter = 0;
            double sumLength = 10;
            while (sumLength < 200.0){
                sumLength += 10 * pValue /100;
                daysCounter++;
            }
            System.out.println("=====================================================================================================");
            System.out.println("He will pas it in " + daysCounter + " days. And summary will pass " + sumLength + " km.");
        }

        sc.close();
    }
}
