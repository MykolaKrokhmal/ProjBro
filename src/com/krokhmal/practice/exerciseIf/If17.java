package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;   

/**
 * Created by User on 29.05.2017.
 */
public class If17 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("If numbers in increasing or decreasing order, twice them all. ");
        System.out.println("In other case change values to opposite.");
        System.out.println("----------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 of 3 values: ");
        float firstValue = scanner.nextFloat();

        System.out.print("Enter 2 of 3 values: ");
        float secondValue = scanner.nextFloat();

        System.out.print("Enter 3 of 3 values: ");
        float thirdValue = scanner.nextFloat();

        //Search min value
        if((firstValue < secondValue && secondValue < thirdValue) ||
           (firstValue > secondValue && secondValue > thirdValue)){
            firstValue *= 2;
            secondValue *= 2;
            thirdValue *= 2;
        }
        else{
            firstValue = -firstValue;
            secondValue = -secondValue;
            thirdValue = -thirdValue;
        }

        System.out.println("====================================================");
        System.out.println("Result three numbers are " + firstValue + ", " + secondValue + ", " + thirdValue);
    }
}
