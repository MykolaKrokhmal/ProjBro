package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by NKrok on 12.06.2017.
 */
public class Arr07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter integer value N > 1: ");
        int nValue = read.nextInt();
        read.close();

        if (nValue <= 1)
            System.out.println("Incorrect entry. N must be greater, then 2. Restart the program.");
        else {

            int[] array = new int[nValue];

            for (int index = 0; index < array.length; index++) array[index] = index;

            for (int index = array.length - 1; index >= 0; index--) System.out.print(String.format("%d ", array[index]));

        }
    }
}