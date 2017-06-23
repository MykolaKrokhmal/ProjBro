package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Arr32 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter array length(N): ");
        int NValue = read.nextInt();
        read.close();

        if (NValue < 3) System.out.println("Incorrect enter. It must be N >= 3.");
        else {
            Random randomValue = new Random();
            int[] array = new int[NValue];
            for (int index = 0; index < array.length; index++)
                array[index] = randomValue.nextInt(20);
            System.out.println(Arrays.toString(array));
            int firstLocalMinValueIndex = 0;
            for(int index = 1; index < array.length - 1; index++)
                if (array[index] < array[index - 1] && array[index] < array[index + 1]) {
                    firstLocalMinValueIndex = index + 1;
                    break;
                }

            String result = String.format("First local minimum value number is %d", firstLocalMinValueIndex);
            System.out.println(result);
        }
    }
}