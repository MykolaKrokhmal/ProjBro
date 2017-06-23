package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by NKrok on 08.06.2017.
 */
public class While23 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Enter int A and B. By using Euclid algorithm find greatest common divisor.");
        System.out.println("-------------------------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int aValue = sc.nextInt();
        System.out.print("Enter B: ");
        int bValue = sc.nextInt();
        sc.close();

        System.out.println("===========================================================================================");

        while (aValue !=0 && bValue != 0) {
        if (aValue > bValue)
            aValue %= bValue;
        else
            bValue %= aValue;
        }
        System.out.println("The greatest common divisor of A and B is " + (aValue + bValue));
    }
}
