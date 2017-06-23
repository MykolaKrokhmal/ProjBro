package com.krokhmal.practice.exerciseCase;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class Case05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter A value : ");
        int aValue = scanner.nextInt();
        System.out.print("Enter B value : ");
        int bValue = scanner.nextInt();
        System.out.print("Enter number of action(1-4): ");
        int action = scanner.nextInt();
        String named = "";

        switch(action){
            case 1: System.out.println("A + B = " + (aValue + bValue)); break;
            case 2: System.out.println("A - B = " + (aValue - bValue)); break;
            case 3: System.out.println("A * B = " + (aValue * bValue)); break;
            case 4: if (bValue != 0)
                        System.out.println("A / B = " + (aValue + bValue));
                    else
                        System.out.println("B can not be equal zero");
                    break;
            default: System.out.println("Incorrect number of action"); break;
        }
    }

}
