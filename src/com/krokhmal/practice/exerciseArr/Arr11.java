package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User on 10.06.2017.
 */
public class Arr11 {
    public static void main(String[] args) {
        int[] array = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number between 1 and 100: ");

        int kValue = sc.nextInt();
        sc.close();

        if (kValue < 1 || kValue > 100)
            System.out.println("Incorrect K value. It must be between 1 and 100.");
        else {
            for (int i = 0; i < array.length; i++) array[i] = i + 1;


            for (int i = kValue; i < array.length; i += kValue) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
