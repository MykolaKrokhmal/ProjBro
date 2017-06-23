package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 30.05.2017.
 */
public class If27 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("For float x find f(x)=0, if x<0;f(x)=1, if x=0,x=2; f(x)=-1, if x=1,x=3;");
        System.out.println("------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter \"x\" value: ");
        double xInputValue = scanner.nextFloat();

        double resultValue = 0;
        if (xInputValue <= 0){
            resultValue = 0;
        }
        else
        if (xInputValue % 2 == 0)
        {
            resultValue = 1;
        }
        else
        if (xInputValue % 2 == 1)
        {
            resultValue = -1;
        }
        System.out.println("========================================================================");
        System.out.println("Result f(" + xInputValue + ") = " + resultValue);

    }
}
