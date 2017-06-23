package com.krokhmal.practice.exerciseString;

import java.util.Scanner;

/**
 * Created by NKrok on 20.06.2017.
 */
public class OperationsWithString {
    public static void main(String[] args) {

        System.out.print("Enter string with numbers: ");
        Scanner read = new Scanner(System.in);
        String content = read.nextLine();
        read.close();

        int sumOfDigit = 0;
        int digitOffset = 0;
        char value;

        for (int index = 0; index < content.length(); index++) {

            value = content.toCharArray()[index];

            if (Character.isDigit(value)) digitOffset++;
            else if (digitOffset > 0) {
                sumOfDigit += Integer.parseInt(content.substring(index - digitOffset, index));
                digitOffset = 0;
            }
        }

        if (digitOffset > 0)
            sumOfDigit += Integer.parseInt(content.substring(content.length() - digitOffset, content.length()));

        String answer = String.format("Sum of digits in your string is %d.", sumOfDigit);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(answer);
    }
}
