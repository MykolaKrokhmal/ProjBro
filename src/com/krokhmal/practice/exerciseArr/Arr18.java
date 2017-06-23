package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Arr18 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        for (int index = 0; index < array.length; index++) array[index] = random.nextInt(50);
        System.out.println(Arrays.toString(array));
        int index = 0;
        while (index < array.length  && array[index] >= array[array.length - 1]) index++;
        String result = String.format("Index of first value, that less last array element is %d", array[index]);
        System.out.println(result);
    }
}