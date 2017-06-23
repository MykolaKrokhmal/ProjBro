package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Enter price of 1 kg candies. Write cost of 0,1..1 kg.");
        System.out.println("-----------------------------------------------------------------");

        System.out.print("Enter price of 1 kg: ");
        float priceOfOneKg = scanner.nextFloat();

        System.out.println("=================================================================");
        if (priceOfOneKg <= 0) {
            System.out.println("Please enter price more then zero");
        }
        else {
            for (int kg = 1; kg <= 10; kg++)
                System.out.println((kg / 10.0) + " kg cost " + (String.format("%.2f", (kg / 10.0) * priceOfOneKg)));
        }

        scanner.close();
    }
}
