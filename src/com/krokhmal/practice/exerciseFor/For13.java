package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Enter N (>0). Find result of the formula 1.1-1.2+1.3-1.4+.. N times.");
        System.out.println("----------------------------------------------------------------------------------");

        System.out.print("Enter N value: ");
        int nValue = scanner.nextInt();

        System.out.println("==================================================================================");
        if (nValue <= 0) {
            System.out.println("Please enter N > 0.");
        }
        else {
            double sumValue = 0;
            for (int i = 11; i <= 10 + nValue; i +=2)
                sumValue += i/10.0;
            for (int i = 12; i <= 10 + nValue; i +=2)
                sumValue -= i/10.0;
            System.out.println("Result of the formula 1.1-1.2+1.3-1.4+.. N times is " + String.format("%.1f",sumValue));
        }

        scanner.close();
    }
}
