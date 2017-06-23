package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Enter float A and int N (>0). Find A^N, using A*A*A*.. N times.");
        System.out.println("----------------------------------------------------------------------------------");

        System.out.print("Enter A value: ");
        double aValue = scanner.nextDouble();
        System.out.print("Enter N value: ");
        int nValue = scanner.nextInt();

        System.out.println("==================================================================================");
        if (nValue <= 0) {
            System.out.println("Please enter N > 0.");
        }
        else {
            double sumValue = 1;
            for (int i = 1; i <= nValue; i++){
                sumValue *= aValue;
                System.out.println(i +". " + aValue + "^" + i + " is " + sumValue);
            }
        }

        scanner.close();
    }
}
