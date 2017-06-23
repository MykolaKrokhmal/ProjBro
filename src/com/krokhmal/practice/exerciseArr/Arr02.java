package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by NKrok on 12.06.2017.
 */
public class Arr02 {
    public static void main(String[] args) {
        System.out.print("Enter integer value N > 0: ");
        Scanner read = new Scanner(System.in);

        int nValue = read.nextInt();
        read.close();

        System.out.println("----------------------------------------------------------------------");
        if (nValue <= 1)
            System.out.println("Incorrent entry. N must be greater, then 0. Restart the program.");
        else {
            int[] powerOfTwo = new int[nValue];
            int  nextPower = 2;
            
            for (int index = 0; index < powerOfTwo.length; index++){
                powerOfTwo[index] = nextPower;
                nextPower *= 2;
            }

            System.out.println(Arrays.toString(powerOfTwo));
        }
    }
}
