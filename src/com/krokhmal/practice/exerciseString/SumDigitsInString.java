package com.krokhmal.practice.exerciseString;

import java.util.Arrays;
import java.util.Scanner;

public class SumDigitsInString {
    public static void main(String[] args) {

        System.out.print("Enter string with numbers: ");
        Scanner read = new Scanner(System.in);
        String content = "iuy9 kkjj 865 kk 7 kj3214";//read.nextLine();
        read.close();
        int sumOfDigits = 0;
        StringBuilder digitValue = new StringBuilder();
        char[] symbol = content.toCharArray();
        System.out.println(Arrays.toString(symbol));

        for (int index = 0; index < symbol.length; index++) {

            if (Character.isDigit(symbol[index])) {
                digitValue.append(Character.toString(symbol[index]));
                if (index == symbol.length - 1) sumOfDigits += Integer.valueOf(digitValue.toString());
            }
            else {
                if (!digitValue.toString().isEmpty()) sumOfDigits += Integer.valueOf(digitValue.toString());
                digitValue = new StringBuilder();
            }

        }

        String answer = String.format("Sum of digits in your string is %d.", sumOfDigits);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(answer);
    }
}
