package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 27.05.2017.
 */
public class If12 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        System.out.println("Enter three values and find minimal.");
        System.out.println("-----------------------------------------------------");

        Scanner s = new Scanner(System.in);

        System.out.print("Enter 1 of 3 value: ");
        int firstNumber = s.nextInt();
        System.out.print("Enter 2 of 3 value: ");
        int secondNumber = s.nextInt();
        System.out.print("Enter 3 of 3 value: ");
        int thirdNumber = s.nextInt();


        //Variant 1
        //Math.min(firstNumber, Math.min(secondNumber, thirdNumber));

        //Variant 2
        int minValue = (firstNumber < secondNumber) ?
                       (firstNumber < thirdNumber)  ? firstNumber  : secondNumber :
                       (secondNumber < thirdNumber) ? secondNumber : thirdNumber;

        System.out.println("=====================================================");
        System.out.println("Minimal value is " +minValue);
    }
}

