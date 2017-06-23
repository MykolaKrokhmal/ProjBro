package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by NKrok on 12.06.2017.
 */
public class Arr04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter integer value N > 1: ");
        int nValue = read.nextInt();
        System.out.print("Enter start value >= 0...: ");
        int startValue = read.nextInt();
        System.out.print("Enter incremnt step > 0..: ");
        int incrementStep = read.nextInt();

        read.close();

        if (nValue <= 1)
            System.out.println("Incorrect entry. N must be greater, then 1. Restart the program.");
        else if (startValue < 0)
            System.out.println("Incorrect entry. Start value must be greater, then 0. Restart the program.");
        else if (incrementStep < 1)
            System.out.println("Incorrect entry. Increment step must be greater, then 0. Restart the program.");
        else {
            int[] powerOfTwo = new int[nValue];
            int nextPower = incrementStep;
            for (int index = 0; index < powerOfTwo.length; index++) {
                powerOfTwo[index] = startValue + nextPower;
                nextPower *= incrementStep;
            }

            System.out.println(Arrays.toString(powerOfTwo));

        }
    }
}