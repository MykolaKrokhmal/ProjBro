package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by NKrok on 08.06.2017.
 */
public class While10 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Enter int N > 1. Find minimum K, where 3^K < N.");
        System.out.println("------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N > 1: ");
        int nValue = sc.nextInt();

        if (nValue <= 1)
            System.out.println("N must be greater, then zero. Please restart the program.");
        else{

            int threeInKPower = 3;
            int kPower = 0;
            while (threeInKPower < nValue){
                threeInKPower *= 3;
                kPower++;
            }
            System.out.println("=========================================================================");
            System.out.println("Minimum K power of 3, that less then N is " + kPower);
        }

        sc.close();
    }
}
