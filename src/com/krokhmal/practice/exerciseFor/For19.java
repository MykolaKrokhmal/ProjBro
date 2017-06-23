package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Enter N (>0). Find N! = 1 * 2 * 3 * .. * N.");
        System.out.println("----------------------------------------------------------------------------------");

        System.out.print("Enter N value: ");
        int nValue = scanner.nextInt();

        System.out.println("==================================================================================");
        if (nValue <= 0) {
            System.out.println("Please enter N > 0.");
        }
        else {
            double sumValue = 1;
            for (int i = 2; i <= nValue; i++) {
                sumValue *= i;
            }
            System.out.println("Result of N! = 1 * 2 * 3 * .. * N is " + sumValue);
        }

        scanner.close();
    }
}
