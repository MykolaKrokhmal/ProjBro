package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Enter price of 1 kg candies. Write cost of 1,2..2 kg.");
        System.out.println("-----------------------------------------------------------------");

        System.out.print("Enter price of 1 kg: ");
        float priceOfOneKg = scanner.nextFloat();

        System.out.println("=================================================================");
        if (priceOfOneKg <= 0) {
            System.out.println("Please enter price more then zero");
        }
        else {
            for (double kg = 1.2; kg <= 2.0; kg += 0.2)
                System.out.println(String.format("%.2f",kg) + " kg cost " + String.format("%.2f",(kg  * priceOfOneKg)));
        }

        scanner.close();
    }
}
