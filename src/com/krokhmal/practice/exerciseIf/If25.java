package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 30.05.2017.
 */
public class If25 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------");
        System.out.println("For int x find /f(x)=2*x, if x<(-2) or x>2/ else /f(x)=-3*x");
        System.out.println("---------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter \"x\" value: ");
        int xInputValue = scanner.nextInt();

        int resultValue;
        if (xInputValue < -2 || xInputValue > 2){
            resultValue = 2 * xInputValue;
        }
        else
        {
            resultValue = -3 * xInputValue;
        }
        System.out.println("===============================================================");
        System.out.println("Result f(" + xInputValue + ") = " + resultValue);

    }
}
