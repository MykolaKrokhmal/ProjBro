package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Enter N (>0). Find quarter of N, using formula N^2=1+3+5+..+(2*N-1).");
        System.out.println("----------------------------------------------------------------------------------");

        System.out.print("Enter N value: ");
        int nValue = scanner.nextInt();

        System.out.println("==================================================================================");
        if (nValue <= 0) {
            System.out.println("Please enter N > 0.");
        }
        else {
            int sumValue = 0;
            for (int i = 1; i <= nValue; i++) {
                sumValue += 2 * i - 1;
                System.out.println("Result " + i +"^2 is " + sumValue);
            }
        }

        scanner.close();
    }
}
