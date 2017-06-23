package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Enter X and N (>0). Find 1 + (X^1)/1! + (X^2)/2! + (X^3)/3! + .. + (X^N)/N!.");
        System.out.println("----------------------------------------------------------------------------------");

        System.out.print("Enter X value: ");
        double xValue = scanner.nextDouble();
        System.out.print("Enter N value: ");
        int nValue = scanner.nextInt();

        System.out.println("==================================================================================");
        if (nValue <= 0) {
            System.out.println("Please enter N > 0.");
        }
        else {
            double factorialValue = 1;
            double sumValue       = 1;
            double valuePower     = 1;
            for (int i = 1; i <= nValue; i++) {
                factorialValue *= i;
                valuePower     *= xValue;
                sumValue       += valuePower / factorialValue;
            }
            System.out.println("Result of 1 + (X^1)/1! + (X^2)/2! + (X^3)/3! + .. + (X^N)/N! is " + sumValue);
            System.out.println(Math.exp(xValue));
        }

        scanner.close();
    }
}
