package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by NKrok on 08.06.2017.
 */
public class While08 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Enter int N > 0. Find maximum int K, where K^2 <= N");
        System.out.println("-----------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N value (>0): ");
        int nValue = sc.nextInt();

        if (nValue <= 0)
            System.out.println("N must be greater then 0. Please restart the program.");
        else{

            int kValue = 0;
            while ((kValue + 1) * (kValue + 1) <= nValue )kValue++;

            System.out.println("Maximum K value, where K^2 <= N is " + kValue);
        }

        sc.close();
    }
}
