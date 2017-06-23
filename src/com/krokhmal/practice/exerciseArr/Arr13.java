package com.krokhmal.practice.exerciseArr;

import java.util.Scanner;

public class Arr13 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter odd number N: ");

        int nValue = sc.nextInt();
        sc.close();

        if (nValue %2 == 0)
            System.out.println("Incorrect N value. It must be odd.");
        else {

            int[] array = new int[nValue];
            for (int i = 0; i < array.length; i++) array[i] = i + 1;


            for (int i = array.length - 1; i >= 0; i -= 2) {
                System.out.print(array[i] + " ");
            }
        }
    }
}