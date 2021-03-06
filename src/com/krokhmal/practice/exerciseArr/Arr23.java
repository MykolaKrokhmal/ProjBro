package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Arr23 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter array length(N): ");
        int NValue = read.nextInt();
        System.out.println("Enter two values K and L, that 1 <= K <= L <= N");
        System.out.print("Enter K value: ");
        int KValue = read.nextInt();
        System.out.print("Enter L value: ");
        int LValue = read.nextInt();
        read.close();

        if (KValue <= 0) System.out.println("Incorrect enter. It must be 1 <= K.");
        else if (KValue >= LValue) System.out.println("Incorrect enter. It must be K < L.");
        else if (LValue > NValue) System.out.println("Incorrect enter. It must be L <= N.");
        else {
            Random random = new Random();
            int[] array = new int[NValue];
            for (int element = 0; element < array.length; element++) array[element] = random.nextInt(10);

            System.out.println("----------------------------------------------------------------------");
            System.out.println(Arrays.toString(array));

            int sumValue = 0;
            for (int index = 0; index < array.length; index++)
                if (index < KValue - 1 || index > LValue - 1)
                    sumValue += array[index];
            double averageValue = sumValue / (array.length - (LValue - KValue + 1.0));

            String result = String.format("Average value of elements exclude range from %d to %d is %f", KValue, LValue, averageValue);
            System.out.println(result);
        }
    }
}