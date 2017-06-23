package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User on 10.06.2017.
 */
public class Arr15 {
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

            System.out.println(Arrays.toString(array));
            for (int i = 1; i < array.length; i += 2) {
                System.out.print(array[i] + " ");
            }
            for (int i = array.length - 1 - ((array.length - 1) % 2); i >= 0; i -= 2) {
                System.out.print(array[i] + " ");
            }
        }
    }
}