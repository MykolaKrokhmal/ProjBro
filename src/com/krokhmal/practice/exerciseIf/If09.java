package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 27.05.2017.
 */
public class If09 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Enter two double values A,B. Change values, that a has less");
        System.out.println("value and b has greater value.");
        System.out.println("-----------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value \"A\": ");
        double aInputValue = scanner.nextDouble();

        System.out.print("Enter value \"B\": ");
        double bInputValue = scanner.nextDouble();

        if(aInputValue > bInputValue){
            aInputValue = aInputValue + bInputValue - (bInputValue = aInputValue);
        }
        System.out.println("============================================================");
        System.out.println("A is " + aInputValue + ", B is " + bInputValue);
    }
}
