package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Arr24 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter array length(N): ");
        int NValue = read.nextInt();

        if (NValue <= 0) System.out.println("Incorrect enter. It must be N > 0.");
        else {
            System.out.println("Fill array by values");
            int index = 0;
            int[] array = new int[NValue];
            for (index = 0; index < array.length; index++){
                System.out.println("Enter " + (index + 1) + "th value: ");
                array[index] = read.nextInt();
            }
            read.close();

            int arithmwticProgressionStep = 0;
            index = 1;
            int currentStep = 0, nextStep = 0;
            while (index < array.length - 1){
                arithmwticProgressionStep = currentStep = array[ index ] - array[ index - 1 ];
                nextStep = array[ index + 1 ] - array[ index ];
                if (currentStep != nextStep) {
                    arithmwticProgressionStep = 0;
                    break;
                }
                else index++;
            }

            String result = String.format("Arithmetic progression step is %d", arithmwticProgressionStep);
            System.out.println(result);
        }
    }
}