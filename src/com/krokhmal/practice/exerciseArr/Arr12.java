package com.krokhmal.practice.exerciseArr;

import java.util.Scanner;

/**
 * Created by User on 10.06.2017.
 */
public class Arr12 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter even number N: ");

        int nValue = sc.nextInt();
        sc.close();

        if (nValue %2 == 1)
            System.out.println("Incorrect N value. It must be even.");
        else {

            int[] array = new int[nValue];
            for (int i = 0; i < array.length; i++) array[i] = i + 1;


            for (int i = 1; i < array.length; i += 2) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
