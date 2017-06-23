package com.krokhmal.practice.exerciseArr;

import java.util.Arrays;
import java.util.Random;


public class Arr19 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int element = 0; element < array.length; element++) array[element] = random.nextInt(50);

        System.out.println(Arrays.toString(array));

        int index = 1;
        final int firstElement = 0;
        final int lastElement = array.length - 1;

        while (index < lastElement && (array[index] <= array[firstElement] & array[index] >= array[lastElement])) index++;
        
        String result = String.format("Index of first value, that greater %d and less %d is %d",
                                        array[firstElement], array[lastElement], array[index]);
        System.out.println(result);
    }
}