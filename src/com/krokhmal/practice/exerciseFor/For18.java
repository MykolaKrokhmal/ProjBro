package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Enter float A and int N (>0). Find sum 1-A+A^2-A^3+..+(-1)^N*A^N.");
        System.out.println("----------------------------------------------------------------------------------");

        System.out.print("Enter A value: ");
        double aValue = scanner.nextDouble();
        System.out.print("Enter N value: ");
        int nValue = scanner.nextInt();

        System.out.println("==================================================================================");
        if (nValue <= 0) {
            System.out.println("Please enter N > 0.");
        }
        else {
            double sumValue = 1;
            double powerOfA = 1;
            for (int i = 1; i <= nValue; i++) {
                powerOfA *= (-1) * aValue;
                sumValue += powerOfA;
            }
            System.out.println("Result of 1-A+A^2-A^3+..+(-1)^N*A^N is " + sumValue);
        }

        scanner.close();
    }
}
