package com.krokhmal.practice.exerciseIf;


import java.util.Scanner;

/**
 * Created by User on 27.05.2017.
 */
public class If01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("If inputValue is positive add 1 else do nothing.");
        System.out.println("------------------------------------------------------------");
        System.out.print("Enter Value: ");
        int inputValue = scanner.nextInt();

        if(inputValue >= 0){
            inputValue++;
        }
        System.out.println("============================================================");
        System.out.println("Result Value is " + inputValue);










        //If15
//        firstNumber = scanner.nextInt();
//        secondNumber = scanner.nextInt();
//        int thirdNumber = scanner.nextInt();
//        if (firstNumber <= secondNumber && firstNumber <= thirdNumber){


    }
}
