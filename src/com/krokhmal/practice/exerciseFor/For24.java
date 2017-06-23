package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Enter X and N (>0). (SIN) Find X - (X^3)/3! + (X^5)/5! - .. + ((-1)^N)*(X^(2*N+1))/((2*N+1)!).");
        System.out.println("----------------------------------------------------------------------------------------------");

        System.out.print("Enter X value: ");
        double xValue = scanner.nextDouble();
        System.out.print("Enter N value: ");
        int nValue = scanner.nextInt();

        System.out.println("==============================================================================================");
        if (nValue <= 0) {
            System.out.println("Please enter N > 0.");
        }
        else {
            double factorialValue = 1;
            double sumValue       = xValue;
            double valuePower     = xValue;
            for (int i = 3; i <= 2 * nValue + 1; i += 2){
                valuePower     *= (-1) * xValue * xValue;
                factorialValue *= (i - 1) * i;
                sumValue       += valuePower / factorialValue;
            }
            System.out.println("Sin(X) = 1 + (X^1)/1! + (X^2)/2! + (X^3)/3! + .. + (X^N)/N! is " + sumValue);
            System.out.println(Math.sin(xValue));
        }

        scanner.close();
    }
}
