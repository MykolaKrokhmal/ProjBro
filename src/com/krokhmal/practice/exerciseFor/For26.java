package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For26 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Enter double |X| < 1 and int N (>0). Find X - (X^3)/3 + (X^5)/5 - .. + ((-1)^N)*(X^(2*N+1))/2*N+1.");
        System.out.println("-------------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X value: ");
        double xValue = scanner.nextDouble();

        System.out.print("Enter N value: ");
        int nValue = scanner.nextInt();

        scanner.close();

        System.out.println("=================================================================================================");
        if (nValue <= 0)
            System.out.println("Please enter N > 0. Restart program.");
        else
        if (Math.abs(xValue) >= 1)
            System.out.println("Please enter |X| < 1. Restart program.");
        else
        {
            double sumValue   = xValue;
            double valuePower = xValue;
            for (int i = 3; i <= 2 * nValue + 1; i +=2)
            {
                valuePower *= (-1) * xValue * xValue;
                sumValue   += valuePower / i;
            }
            System.out.println("Arctg(X) = X - (X^3)/3 + (X^5)/5 - .. + ((-1)^N)*(X^(2*N+1))/2*N+1 is " + sumValue);
            System.out.println(Math.atan(xValue));
        }
    }
}
