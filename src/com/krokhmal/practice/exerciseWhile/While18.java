package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by NKrok on 08.06.2017.
 */
public class While18 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Enter N >0. Write quantity and sum of digits.");
        System.out.println("-------------------------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N >0: ");
        int nValue = sc.nextInt();
        sc.close();

        if (nValue <= 0) {
            System.out.println("Please enter N more then 0. Restart the program.");
        }
        else{
            System.out.println("===========================================================================================");
            int quantityOfDigits = 0;
            int sumOfDigits = 0;
            while (nValue > 0) {
                sumOfDigits += nValue % 10;
                nValue /= 10;
                quantityOfDigits++;
            }
            System.out.println("Sum of digits is " + sumOfDigits + " and quantity of digits is " + quantityOfDigits);
        }

    }
}
