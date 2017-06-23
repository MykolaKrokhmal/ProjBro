package com.krokhmal.practice.exerciseMatrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by NKrok on 22.06.2017.
 */
public class Matrix90 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter quantity of matrix lines and columns(M): ");
        int mValue = read.nextInt();
        read.close();

        if (mValue < 1) System.out.println("Incorrect enter. M must be > 0");
        else {
            int[][] matrix = new int[mValue][mValue];

            Random random = new Random();

            for (int lineIndex = 0; lineIndex < matrix.length; lineIndex++)
                for (int columnIndex = 0; columnIndex < matrix[lineIndex].length; columnIndex++)
                    matrix[lineIndex][columnIndex] = random.nextInt(50);

            System.out.println("Initial matrix");

            for (int lineIndex = 0; lineIndex < matrix.length; lineIndex++)
                System.out.println(Arrays.toString(matrix[lineIndex]));

            for (int lineIndex = 0; lineIndex < matrix.length; lineIndex++)
                for (int columnIndex = matrix[lineIndex].length - lineIndex - 1; columnIndex < matrix.length; columnIndex++)
                    matrix[lineIndex][columnIndex] = 0;

            System.out.println("Result matrix");

            for (int lineIndex = 0; lineIndex < matrix.length; lineIndex++)
                System.out.println(Arrays.toString(matrix[lineIndex]));
        }
    }
}
