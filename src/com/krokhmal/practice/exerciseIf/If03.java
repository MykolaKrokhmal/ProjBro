package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 27.05.2017.
 */
public class If03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("If input value is positive add 1, if negative deduct 2, if zero change to 10");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Enter Value: ");
        int inputValue = scanner.nextInt();
        if(inputValue < 0){
            inputValue -= 2;
        }
        else {
            if(inputValue == 0){
                inputValue = 10;
            }
            else{
                inputValue++;
            }
        }
        System.out.println("============================================================================");
        System.out.println("Result Value is " + inputValue);


    }
}
