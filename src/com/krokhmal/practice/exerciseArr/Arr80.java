package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Arr80 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter array length(N): ");
        int nValue = read.nextInt();
        read.close();

        if (nValue < 1) System.out.println("Incorrect enter. It must be N >= 1.");
        else {
            Random randomValue = new Random();
            int[] array = new int[nValue];
            for (int index = 0; index < array.length; index++)
                array[index] = randomValue.nextInt(50);
            System.out.println("Basic array:");
            System.out.println(Arrays.toString(array));

            for (int index = 1; index < array.length; index++)
                array[index - 1] = array[index];
            array[array.length - 1] = 0;

            System.out.println("Result array:");
            System.out.println(Arrays.toString(array));
        }
    }
}