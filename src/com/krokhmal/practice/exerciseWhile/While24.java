package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by NKrok on 08.06.2017.
 */
public class While24 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Enter N >1. Define is this from Fibonacci sequence.");
        System.out.println("-------------------------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N >1: ");
        int nValue = sc.nextInt();
        sc.close();

        if (nValue <= 1) {
            System.out.println("Please enter N more then 0. Restart the program.");
        }
        else{
            System.out.println("===========================================================================================");
            boolean isFalse = false;
            int stepDivider = 2;
            while (!isFalse && stepDivider < nValue) {
                isFalse = nValue % stepDivider == 0;
                stepDivider++;
            }
            System.out.println("N is simple number is " + !isFalse);
        }
    }
}
