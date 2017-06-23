package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by NKrok on 08.06.2017.
 */
public class While17 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Enter N >0. Write all digits of this number. Direction from right to left.");
        System.out.println("-------------------------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N >0: ");
        int nValue = sc.nextInt();
        sc.close();

        if (nValue <= 0) {
            System.out.println("Please enter N more then 0. Restart the program.");
        }
        else{
            System.out.println("===========================================================================================");
            while (nValue > 0) {
                System.out.print(nValue % 10 +" ");
                nValue /= 10;
            }
        }
    }
}
