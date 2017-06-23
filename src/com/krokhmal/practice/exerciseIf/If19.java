package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 29.05.2017.
 */
public class If19 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("Enter 4 Value. Three random of then should be same. ");
        System.out.println("Print order of single value.");
        System.out.println("----------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 of 4 values: ");
        int firstValue = scanner.nextInt();
        System.out.print("Enter 2 of 4 values: ");
        int secondValue = scanner.nextInt();
        System.out.print("Enter 3 of 4 values: ");
        int thirdValue = scanner.nextInt();
        System.out.print("Enter 4 of 4 values: ");
        int fourthValue = scanner.nextInt();

        int singleValueOrder = 0;
        if ((firstValue == secondValue)){
                if (firstValue == thirdValue)
                    singleValueOrder = 4;
                else
                    singleValueOrder = 3;
        }
        else
        if (secondValue == thirdValue){
                if (secondValue == fourthValue)
                    singleValueOrder = 1;
                else
                    singleValueOrder = 4;
        }
        else
        if (thirdValue == fourthValue)
                if (fourthValue == firstValue)
                    singleValueOrder = 2;
                else
                    singleValueOrder = 1;
        else
        if (fourthValue == firstValue)
                if (firstValue == secondValue)
                    singleValueOrder = 3;
                else
                    singleValueOrder = 2;

        System.out.println("====================================================");
        System.out.println("Order of single value is  " + singleValueOrder);
    }
}
