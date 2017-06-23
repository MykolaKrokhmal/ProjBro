package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 29.05.2017.
 */
public class If20 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Enter three numbers - A, B, C. What number B or C is closer to A?");
        System.out.println("-----------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        int aValue = scanner.nextInt();
        System.out.print("Enter B: ");
        int bValue = scanner.nextInt();
        System.out.print("Enter C: ");
        int cValue = scanner.nextInt();

        System.out.println("=================================================================");
        System.out.print("This is closer to A number ");
        if(Math.abs(aValue - bValue) > Math.abs(aValue - cValue)) {
            System.out.println("C");
        }
        else {
            System.out.println("B");
        }

    }
}
