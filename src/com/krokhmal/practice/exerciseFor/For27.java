package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For27 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Enter double |X| < 1 and int N (>0). ");
        System.out.println("Find arcsin(X) = X + 1*X^3/2*3 + 1*3*X^5/2*4*5 +..+ (1*3*..*2*N-1)*X^(2*N+1)/2*4*..*(2*N)*(2*N+1).");
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
            double sumValue     = xValue;
            double valuePower   = xValue;
            double factorialOne = 1;
            double factorialTwo = 1;

            for (int i = 3; i <= 2 * nValue + 1; i +=2)
            {
                factorialOne *= (i-2);
                valuePower   *= xValue * xValue;
                factorialTwo *= (i-1);
                sumValue     += factorialOne * valuePower / (factorialTwo * i);
            }
            System.out.println("arcsin(X) = X + 1*X^3/2*3 + 1*3*X^5/2*4*5 +..+ (1*3*..*2*N-1)*X^(2*N+1)/2*4*..*(2*N)*(2*N+1) is " + sumValue);
            System.out.println(Math.asin(xValue));
        }
    }
}
