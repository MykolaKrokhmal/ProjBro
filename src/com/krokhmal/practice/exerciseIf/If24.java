package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 30.05.2017.
 */
public class If24 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------");
        System.out.println("For float x find f(x)=2*sin(x), if x>0 or f(x)=6-x, if x<=0");
        System.out.println("---------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter \"x\" value: ");
        double xInputValue = scanner.nextFloat();

        double resultValue;
        if (xInputValue > 0){
            resultValue = 2 * Math.sin(xInputValue);
        }
        else
        {
            resultValue = 6 - xInputValue;
        }
        System.out.println("===============================================================");
        System.out.println("Result f(" + xInputValue + ") = " + resultValue);
    }
}
