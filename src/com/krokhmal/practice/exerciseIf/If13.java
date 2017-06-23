package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 28.05.2017.
 */
public class If13 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("Find middle value from three digits");
        System.out.println("-----------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 of 3 digit: ");
        int firstValue = scanner.nextInt();

        System.out.print("Enter 2 of 3 digit: ");
        int secondValue = scanner.nextInt();

        System.out.print("Enter 3 of 3 digit: ");
        int thirdValue = scanner.nextInt();

        int middleValue = -1;

        // check second < first < third
        if(secondValue < firstValue && firstValue < thirdValue){
                middleValue = firstValue;
        }
        else
        // check third < first < second
        if(thirdValue < firstValue && firstValue < secondValue){
                middleValue = firstValue;
        }
        else
        // check first < second < third
        if(firstValue < secondValue && secondValue < thirdValue){
                middleValue = secondValue;
        }
        else
        // check third < second < first
        if(thirdValue < secondValue && secondValue < firstValue){
                middleValue = secondValue;
        }
        else
        // check first < third < second
        if(firstValue < thirdValue && thirdValue < secondValue){
                middleValue = thirdValue;
        }
        else
        // check second < third < first
        if(secondValue < thirdValue && thirdValue < firstValue){
                middleValue = thirdValue;
        }

        System.out.println("===============================================");
        System.out.println("Middle Value is " + middleValue);
    }
}
