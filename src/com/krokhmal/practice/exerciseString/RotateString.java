package com.krokhmal.practice.exerciseString;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter quantity of cases: ");
        int casesQuantity = Integer.parseInt(read.nextLine());
        System.out.println("--------------------------------------------------------------------");

        if (casesQuantity < 1) System.out.println("Incorrect enter. Quantity must be greater 0");
        else {

            int offsetValue;
            String testCase;
            StringBuilder testCaseResult = new StringBuilder("Answer is:");

            for (int number = 0; number < casesQuantity; number++) {

                String header = String.format("Test case number %d. Enter offset: ", number + 1);
                System.out.print(header);
                offsetValue = Integer.parseInt(read.next());
                testCase = read.next();

                int offset = 0;

                offset = Math.abs(offsetValue);
                if (offsetValue > 0) {

                    testCaseResult.append(" ").
                                   append(testCase.substring(offset)).
                                   append(testCase.substring(0, offset));

                } else if (offsetValue < 0) {

                    testCaseResult.append(" ").
                                   append(testCase.substring(0, testCase.length() - offset)).
                                   append(testCase.substring(testCase.length() - offset));
                }

            }
            System.out.println("-------------------------------------------------");
            System.out.print(testCaseResult);
        }
        read.close();
    }
}
