package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For25 {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Enter double |X| < 1 and int N (>0). Find X - (X^2)/2 + (X^3)/3 - .. + ((-1)^N-1)*(X^(N))/N.");
        System.out.println("----------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X value: ");
        double xValue = scanner.nextDouble();

        System.out.print("Enter N value: ");
        int nValue = scanner.nextInt();

        scanner.close();

        System.out.println("==============================================================================================");
        if (nValue <= 0)
            System.out.println("Please enter N > 0. Restart program.");
        else
        if (Math.abs(xValue) >= 1)
            System.out.println("Please enter |X| < 1. Restart program.");
        else
        {
            double sumValue   = xValue;
            double valuePower = xValue;
            for (int i = 2; i <= nValue; i++)
            {
                valuePower *= (-1) * xValue;
                sumValue   += valuePower / i;
            }
            System.out.println("Ln(1+X) = X - (X^2)/2 + (X^3)/3 - .. + ((-1)^N-1)*(X^(N))/N is " + sumValue);
            System.out.println(Math.log(1 + xValue));
        }


    }
}
