package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For37 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Enter int N (>0). Find 1^1 + 2^2 + .. + N^N.");
        System.out.println("-------------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int N (>0): ");
        int nValue = scanner.nextInt();

        if (nValue < 0)
            System.out.println("N should be positive. Please restart the program.");
        else {
            double sumValue = 0;

            for (int i = 1; i <= nValue; i++){

                double valuePower = 1;

                for (int j = 1; j <= i; j++)
                    valuePower *= i;

                sumValue += valuePower;
            }
            System.out.println("=================================================================================================");
            System.out.println("Result is " + sumValue);
        }

        scanner.close();
    }
}
