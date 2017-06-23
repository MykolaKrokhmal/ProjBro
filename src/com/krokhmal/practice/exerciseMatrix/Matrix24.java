package com.krokhmal.practice.exerciseMatrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by NKrok on 22.06.2017.
 */
public class Matrix24 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter quantity of matrix lines(M): ");
        int mLines = read.nextInt();
        System.out.print("Enter quantity of matrix columns(N): ");
        int nColumns = read.nextInt();
        read.close();

        if (mLines < 1) System.out.println("Incorrect enter. M must be > 0");
        else if (nColumns < 1) System.out.println("Incorrect enter. N must be > 0");
        else {
            int[][] matrix = new int[mLines][nColumns];

            Random random = new Random();

            for (int lineIndex = 0; lineIndex < matrix.length; lineIndex++)
                for (int columnIndex = 0; columnIndex < matrix[lineIndex].length; columnIndex++)
                    matrix[lineIndex][columnIndex] = random.nextInt(50);

            System.out.println("Existing matrix");
            for (int lineIndex = 0; lineIndex < matrix.length; lineIndex++)
                System.out.println(Arrays.toString(matrix[lineIndex]));

            int[] maxElements = new int[nColumns];

            for (int lineIndex = 0; lineIndex < matrix.length; lineIndex++)
                for (int columnIndex = 0; columnIndex < matrix[lineIndex].length; columnIndex++)
                    if (maxElements[columnIndex] < matrix[lineIndex][columnIndex])
                        maxElements[columnIndex] = matrix[lineIndex][columnIndex];

            System.out.println("Result array of maximum elemets from each column:");
            System.out.println(Arrays.toString(maxElements));
        }
    }
}
