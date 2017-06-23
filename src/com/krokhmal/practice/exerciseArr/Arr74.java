package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Arr74 {
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

            int minValueIndex = 0;
            int maxValueIndex = 0;
            for (int index = 0; index < array.length; index++)
                if (array[minValueIndex] > array[index]) minValueIndex = index;
                else if (array[maxValueIndex] < array[index]) maxValueIndex = index;

            int zeroIndex = 0;
            while (Math.abs(minValueIndex - maxValueIndex) != 1){
                zeroIndex = minValueIndex < maxValueIndex ? ++minValueIndex : ++maxValueIndex;
                array[zeroIndex] = 0;
            }
            System.out.println("Result array:");
            System.out.println(Arrays.toString(array));
        }
    }
}