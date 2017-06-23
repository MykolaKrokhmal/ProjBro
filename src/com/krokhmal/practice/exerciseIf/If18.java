package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 29.05.2017.
 */
public class If18 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("Enter 3 Value. Two random of then should be same. ");
        System.out.println("Print order of single value.");
        System.out.println("----------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 of 3 values: ");
        int firstValue = scanner.nextInt();
        System.out.print("Enter 2 of 3 values: ");
        int secondValue = scanner.nextInt();
        System.out.print("Enter 3 of 3 values: ");
        int thirdValue = scanner.nextInt();

        int singleValueOrder = 0;
        if ((firstValue == secondValue)){
            singleValueOrder = 3;
        }
        else
        if (secondValue == thirdValue){
            singleValueOrder = 1;
        }
        else
        if (thirdValue == firstValue)
            singleValueOrder = 2;

        System.out.println("====================================================");
        System.out.println("Order of single value is  " + singleValueOrder);
    }
}
