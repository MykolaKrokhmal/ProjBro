package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by NKrok on 12.06.2017.
 */
public class Arr06 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter integer value N > 2: ");
        int nValue = read.nextInt();
        System.out.print("Enter integer value A > 0: ");
        int aValue = read.nextInt();
        System.out.print("Enter integer value B > 0: ");
        int bValue = read.nextInt();
        read.close();

        if (nValue <= 2)
            System.out.println("Incorrect entry. N must be greater, then 2. Restart the program.");
        else
        if (aValue <= 0)
            System.out.println("Incorrect entry. A must be greater, then 0. Restart the program.");
        else
        if (bValue <= 0)
            System.out.println("Incorrect entry. B must be greater, then 0. Restart the program.");
        else {

            int[] fibonacciArray = new int[nValue];

            fibonacciArray[0] = aValue;
            fibonacciArray[1] = bValue;

            for (int index = 2; index < fibonacciArray.length; index++)
                fibonacciArray[index] = fibonacciArray[index - 2] + fibonacciArray[index - 1];

            System.out.println(Arrays.toString(fibonacciArray));

        }
    }
}