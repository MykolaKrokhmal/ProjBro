package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by nkrok on 31.05.2017.
 */
public class If29 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Write description of entered number.");
        System.out.println("--------------------------------------------------------------------------");

        Scanner aScanner = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int inputValue  = aScanner.nextInt();


        System.out.println("==========================================================================");
        System.out.print("Entered value is ");

        if (inputValue == 0){
            System.out.print("zero.");
        }
        else
        if (inputValue % 2 == 0) {
            System.out.print("even ");

            if (inputValue < 0) {
                System.out.println("and negative.");
            }
            else
            {
                System.out.println("and positive.");
            }

        }
        else{
            System.out.print("odd ");

            if (inputValue < 0) {
                System.out.println("and negative.");
            }
            else
            {
                System.out.println("and positive.");
            }

        }



    }
}
