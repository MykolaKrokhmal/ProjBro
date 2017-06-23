package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Arr40 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter array length(N): ");
        int nValue = read.nextInt();
        System.out.print("Enter number A: ");
        int aValue = read.nextInt();
        read.close();

        if (nValue < 1) System.out.println("Incorrect enter. It must be N >= 1.");
        else {
            Random randomValue = new Random();
            int[] array = new int[nValue];
            for (int index = 0; index < array.length; index++)
                array[index] = randomValue.nextInt(20);
            System.out.println(Arrays.toString(array));
            int closerValueIndex = 0;
            for(int index = 1; index < array.length; index++)
                if (Math.abs(array[closerValueIndex] - aValue) > Math.abs(array[index] - aValue)) closerValueIndex = index;

            String result = String.format("Closer value to %d is %d", aValue, array[closerValueIndex]);
            System.out.println(result);
        }
    }
}