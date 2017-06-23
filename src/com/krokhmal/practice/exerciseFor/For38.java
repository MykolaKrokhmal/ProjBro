package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For38 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Enter int N (>0). Find 1^N + 2^N-1 + .. + N^1.");
        System.out.println("-------------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int N (>0): ");
        int nValue = scanner.nextInt();

        if (nValue < 0)
            System.out.println("N should be positive. Please restart the program.");
        else {
            double sumValue = 0;

            for (int i = 0; i <= nValue - 1; i++){

                double valuePower = 1;

                for (int j = 1; j <= nValue - i; j++)
                    valuePower *= (i + 1);

                sumValue += valuePower;
            }
            System.out.println("=================================================================================================");
            System.out.println("Result is " + sumValue);
        }

        scanner.close();
    }
}
