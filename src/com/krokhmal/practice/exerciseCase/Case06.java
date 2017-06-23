package com.krokhmal.practice.exerciseCase;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class Case06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter number of unit : ");
        int action = scanner.nextInt();
        System.out.print("Enter value : ");
        double aValue = scanner.nextDouble();

        switch(action){
            case 1: System.out.println("dm to m is " + (aValue / 10)); break;
            case 2: System.out.println("km to m is " + (aValue * 1000)); break;
            case 3: System.out.println("m is m " + aValue); break;
            case 4: System.out.println("mm to m is " + (aValue / 1000)); break;
            case 5: System.out.println("sm to m" + (aValue / 100)); break;
            default: System.out.println("Incorrect number of unit"); break;
        }
    }

}
