package com.krokhmal.practice.exerciseMatrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by NKrok on 22.06.2017.
 */
public class Matrix50 {

    private int linesCount = 0;
    private int columnsCount = 0;
    private int[][] matrix;

    public static void main(String[] args) {

        Matrix50 matrix = new Matrix50();

        matrix.getDimensions();

        if (matrix.dimensionCorrect()) {
            matrix.create();
            matrix.fillByRandomValues(50);
            matrix.print();
            matrix.changeMinAndMaxValuesInColumns();
            matrix.print();
        }
    }

    private void getDimensions() {

        Scanner read = new Scanner(System.in);
        this.getMatrixLinesCount(read);
        this.getMatrixColumnsCount(read);
        read.close();
    }

    private void getMatrixLinesCount(Scanner read) {
        System.out.print("Enter quantity of matrix lines(M): ");
        this.linesCount = read.nextInt();
    }

    private void getMatrixColumnsCount(Scanner read) {
        System.out.print("Enter quantity of matrix columns(N): ");
        this.columnsCount = read.nextInt();
    }

    private boolean dimensionCorrect() {
        boolean result = false;
        if (this.linesCount < 1) System.out.println("Incorrect enter. M must be > 0");
        else if (this.columnsCount < 1) System.out.println("Incorrect enter. N must be > 0");
        else result = true;

        return result;
    }

    private void create() {
        matrix = new int[this.linesCount][this.columnsCount];
    }

    private void fillByRandomValues(int bound) {

        Random random = new Random();

        for (int lineIndex = 0; lineIndex < matrix.length; lineIndex++)
            for (int columnIndex = 0; columnIndex < matrix[lineIndex].length; columnIndex++)
                matrix[lineIndex][columnIndex] = random.nextInt(bound);
    }

    private void print() {

        System.out.println("------------------------------------------");
        for (int line[] : matrix)
            System.out.println(Arrays.toString(line));
    }

    private void changeMinAndMaxValuesInColumns() {

        int minValueIndex;
        int maxValueIndex;

        /*****
         * Implementation with vertical passing
         *****************************************************************************************/
        for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
            maxValueIndex = 0;
            minValueIndex = 0;
            for (int lineIndex = 0; lineIndex < matrix.length; lineIndex++)
                if (matrix[lineIndex][columnIndex] > matrix[maxValueIndex][columnIndex]) maxValueIndex = lineIndex;
                else if (matrix[lineIndex][columnIndex] < matrix[minValueIndex][columnIndex]) minValueIndex = lineIndex;

            matrix[maxValueIndex][columnIndex] =
                    matrix[minValueIndex][columnIndex] + matrix[maxValueIndex][columnIndex] -
                            (matrix[minValueIndex][columnIndex] = matrix[maxValueIndex][columnIndex]);

        }
        /*****
         * Implementation with horizontal passing
         *****************************************************************************************
         int[] minElementLine = new int[nColumns];
         int[] maxElementLine = new int[nColumns];

         for (int lineIndex = 0; lineIndex < matrix.length; lineIndex++)
         for (int columnIndex =0; columnIndex < matrix[lineIndex].length; columnIndex++)
         if (matrix[maxElementLine[columnIndex]][columnIndex] < matrix[lineIndex][columnIndex])
         maxElementLine[columnIndex] = lineIndex;
         else if (matrix[minElementLine[columnIndex]][columnIndex] > matrix[lineIndex][columnIndex])
         minElementLine[columnIndex] = lineIndex;

         for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++)
         matrix[maxElementLine[columnIndex]][columnIndex] =
         matrix[minElementLine[columnIndex]][columnIndex] + matrix[maxElementLine[columnIndex]][columnIndex] -
         (matrix[minElementLine[columnIndex]][columnIndex] = matrix[maxElementLine[columnIndex]][columnIndex]);
         */
    }


}
