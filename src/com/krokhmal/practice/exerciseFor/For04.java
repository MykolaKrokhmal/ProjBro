package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Enter price of 1 kg candies. Write cost of 1..10 kg.");
        System.out.println("-----------------------------------------------------------------");

        System.out.print("Enter price of 1 kg: ");
        float priceOfOneKg = scanner.nextFloat();

        System.out.println("=================================================================");

        for (int kg = 1; kg  <=  10; kg++)
            System.out.println(kg + " kg cost " + (kg * priceOfOneKg));

        scanner.close();
    }
}
