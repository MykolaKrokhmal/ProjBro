package com.krokhmal.practice.exerciseArr;

import java.util.Scanner;


public class Arr17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number N: ");

        int nValue = sc.nextInt();
        sc.close();

        if (nValue <= 0)
            System.out.println("Incorrect N value. It must be greater then 0.");
        else {


            int[] array = new int[nValue];

            for (int i = 0; i < array.length; i++) array[i] = i;

            for (int i = 1, j = array.length - 2; i < array.length && j >= 0 ; i+=2, j-=2) {
                System.out.print(array[i - 1] + " " + array[i] + " ");
                System.out.print(array[j + 1] + " " + array[j] + " ");
            }
        }
    }
}