package com.krokhmal.practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter numeric expression:");
        System.out.println("========================================================================");
        String expression = read.nextLine();
        System.out.println("========================================================================");
        read.close();

        System.out.print("Answer is ");
        System.out.println(resultOf(expression));
    }

    private static double resultOf(String value) {
        char[] sequence = value.toCharArray();
        StringBuilder numbers = new StringBuilder();
        StringBuilder operations = new StringBuilder();
        for (int element = 0; element < sequence.length; element++) {

            if (Character.isDigit(sequence[element])){
                do{
                    numbers.append(sequence[element]);
                    element++;

                }while (Character.isDigit(sequence[element]) && element < sequence.length - 1);

                numbers.append(", ");

            }
            if (characterIsOperator(sequence[element]))
                operations.append(sequence[element]);

        }
        System.out.println(numbers.toString());
        System.out.println(operations.toString());
        return 0;
    }

    private static boolean characterIsOperator(char value) {
        boolean result = false;
        if (value == '+' || value == '-' || value == '*' || value == '/' || value == '(' || value == ')')
            result = true;

        return result;
    }
}
