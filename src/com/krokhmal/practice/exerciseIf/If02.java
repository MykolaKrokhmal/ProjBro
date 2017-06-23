package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 27.05.2017.
 */
public class If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------------------------");
        System.out.println("If input value is positive, then add 1, if negative minus 2.");
        System.out.println("------------------------------------------------------------");
        System.out.print("Enter Value: ");
        int inputParameter = scanner.nextInt();
        int inp = sc.nextInt();

        if(inputParameter >= 0){
            inputParameter++;
        }
        else{
            inputParameter = inputParameter - 2;
        }
        System.out.println("============================================================");
        System.out.println("Result Value is " + inputParameter + " - " + inp);
    }
}
