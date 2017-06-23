package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by NKrok on 08.06.2017.
 */
public class While07 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------");
        System.out.println("Enter int N >0. Find minimum int K, where K^2 > N");
        System.out.println("-------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N > 0: ");
        int nValue = sc.nextInt();

        System.out.println("-------------------------------------------------------");
        if (nValue <= 0) {
            System.out.println("N must be greater, then 0. Please restart the program.");
        }
        else{
            int kValue = 1;
            while (nValue > kValue * kValue) kValue ++;

            System.out.println("Minimum K = " + kValue);
        }
        sc.close();
    }
}
