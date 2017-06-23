package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For28 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Enter double |X| < 1 and int N (>0). ");
        System.out.println("Find SQRT(1+X) = 1 + X/2 - 1*X^2/2*4 + 1*3*X^3/(2*4*6)-..+(-1)^N-1*(1*3*..*2*N-3)*X^N/2*4*..*(2*N).");
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
            double sumValue     = 1;
            double valuePower   = 1;
            double factorialOne = 1;
            double factorialTwo = 1;

            for (int i = 1; i <= 2 * nValue; i +=1)
            {
                factorialOne *= (-1) * (2 * i -3);
                valuePower   *= xValue;
                factorialTwo *= 2 * i;
                sumValue     += factorialOne * valuePower / factorialTwo;
            }
            System.out.println("SQRT(1+X) = 1 + X/2 - 1*X^2/2*4 + 1*3*X^3/(2*4*6)-..+(-1)^N-1*(1*3*..*2*N-3)*X^N/2*4*..*(2*N) is " + sumValue);
            System.out.println(Math.sqrt(1 + xValue));
        }
    }
}
