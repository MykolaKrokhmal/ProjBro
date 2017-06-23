package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 30.05.2017.
 */
public class If26 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------");
        System.out.println("For float x find f(x)=-x, if x<=0; f(x)=x^2, if 0<x<2; else f(x)=4");
        System.out.println("------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter \"x\" value: ");
        double xInputValue = scanner.nextFloat();

        double resultValue;
        if (xInputValue <= 0){
            resultValue = - xInputValue;
        }
        else
        if (0 < xInputValue && xInputValue < 2)
        {
            resultValue = Math.pow(xInputValue, 2);
        }
        else
        {
            resultValue = 4;
        }
        System.out.println("==================================================================");
        System.out.println("Result f(" + xInputValue + ") = " + resultValue);

    }
}
