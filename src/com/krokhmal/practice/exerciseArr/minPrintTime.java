package com.krokhmal.practice.exerciseArr;

import java.util.Scanner;

public class minPrintTime {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        StringBuilder answers = new StringBuilder();

        System.out.print("Enter number of tests_________________: ");
        int testNumber = Integer.parseInt(read.nextLine());

        for (int value = 1; value <= testNumber; value++){

            //System.out.println("Test number " + value + ": ");
            //System.out.print("Enter first  printer printing time (X): ");
            int firstPrintTime = Integer.parseInt(read.next());
            //System.out.print("Enter second printer printing time (Y): ");
            int secondPrintTime = Integer.parseInt(read.next());
            //System.out.print("Number of pages (N)___________________: ");
            int pageNumber = Integer.parseInt(read.next());
            int minPrintTime = firstPrintTime * pageNumber;

            for (int printerPages = 1; printerPages <= pageNumber - 1; printerPages++){
                int first = printerPages * firstPrintTime;
                int second = (pageNumber - printerPages) * secondPrintTime;
                int currentPrintTime = first > second ? first : second;
                minPrintTime = (minPrintTime > currentPrintTime) ? currentPrintTime : minPrintTime;
            }
            answers.append(" " + minPrintTime);
        }
        read.close();
        System.out.print("Answer is:");
        System.out.println(answers);


    }
}
