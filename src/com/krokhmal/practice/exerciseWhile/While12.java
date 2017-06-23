package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by NKrok on 08.06.2017.
 */
public class While12 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Enter int N > 0. Find minimum K, where 1+2+..+K <= N.");
        System.out.println("------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N > 0: ");
        int nValue = sc.nextInt();

        if (nValue <= 0)
            System.out.println("N must be greater, then zero. Please restart the program.");
        else{

            int kValue = 0;
            int sumOfKValues = 0;
            while (sumOfKValues < nValue){
                sumOfKValues += kValue++;
            }
            System.out.println("=========================================================================");
            System.out.println("Minimum K is " + kValue);
        }

        sc.close();
    }
}
