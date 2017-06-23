package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 28.05.2017.
 */
public class If11 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        System.out.println("If A!=B then A=B= max from A or B. If A=B then A=B=0.");
        System.out.println("-----------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value \"A\": ");
        int aValueInput = scanner.nextInt();

        System.out.print("Enter value \"B\": ");
        int bValueInput = scanner.nextInt();

        System.out.println("=====================================================");
        if(aValueInput != bValueInput){
            aValueInput = bValueInput = Math.max(aValueInput, bValueInput);
        }
        else{
            aValueInput = bValueInput = 0;
        }

        System.out.println("A = " + aValueInput + ", B = " + bValueInput);
    }
}
