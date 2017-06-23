package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Arr47 {
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
                array[index] = randomValue.nextInt(10);
            System.out.println(Arrays.toString(array));

            int differentValuesCount = 0;
            boolean isUnicValue;
            for(int index = 0; index < array.length; index++) {
                isUnicValue = true;
                for (int subIndex = 0; subIndex < array.length; subIndex++)
                    if (array[index] == array[subIndex] && index != subIndex){
                        isUnicValue = false;
                        break;
                    }
                if (isUnicValue) differentValuesCount++;
            }
            String answer = String.format("Different value count is %d", differentValuesCount);
            System.out.println(answer);
        }
    }
}