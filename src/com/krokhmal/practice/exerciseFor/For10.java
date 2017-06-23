package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Enter N (>0). Find sum 1 + 1/2 + .. + 1/N");
        System.out.println("----------------------------------------------------------------------------------");

        System.out.print("Enter N value: ");
        int nValue = scanner.nextInt();

        System.out.println("==================================================================================");
        if (nValue <= 0) {
            System.out.println("Please enter N > 0.");
        }
        else {
            double sumValue = 0;
            for (int i = 1; i <= nValue; i++)
                sumValue += 1.0 / i;
                System.out.println("Sum of (1 + 1/2 + .. + 1/N) is " + String.format("%.6f",sumValue));
        }

        scanner.close();
    }
}
