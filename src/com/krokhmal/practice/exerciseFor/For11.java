package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Enter N (>0). Find sum N + (N+1)^2 + .. + (N*N)^2");
        System.out.println("----------------------------------------------------------------------------------");

        System.out.print("Enter N value: ");
        int nValue = scanner.nextInt();

        System.out.println("==================================================================================");
        if (nValue <= 0) {
            System.out.println("Please enter N > 0.");
        }
        else {
            double sumValue = 0;
            for (int i = 0; i <= nValue; i++)
                sumValue += Math.pow((i + nValue), 2);
            System.out.println("Sum of (N + (N+1)^2 + .. + (N*N)^2) is " + sumValue);
        }

        scanner.close();
    }
}
