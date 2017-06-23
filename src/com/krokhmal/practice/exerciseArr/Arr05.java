package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by NKrok on 12.06.2017.
 */
public class Arr05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter integer value N > 2: ");
        int nValue = read.nextInt();
        read.close();

        if (nValue <= 2)
            System.out.println("Incorrect entry. N must be greater, then 2. Restart the program.");
        else {

            int[] fibonacciArray = new int[nValue];

            fibonacciArray[0] = fibonacciArray[1] = 1;

            for (int index = 2; index < fibonacciArray.length; index++)
                fibonacciArray[index] = fibonacciArray[index - 2] + fibonacciArray[index - 1];

            System.out.println(Arrays.toString(fibonacciArray));

        }
    }
}