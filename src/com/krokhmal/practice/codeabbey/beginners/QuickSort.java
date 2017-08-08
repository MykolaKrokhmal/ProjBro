package com.krokhmal.practice.codeabbey.beginners;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int index = 0; index < 20; index++)
            array[index] = random.nextInt(50);
        System.out.println(Arrays.toString(array));
        System.out.println(System.currentTimeMillis());
        quickSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(System.currentTimeMillis());


    }

    static void quickSort(int[] array) {
        int pivot = array.length / 2;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            while (array[left] < array[pivot]) left++;
            while (array[pivot] < array[right]) right--;

            if (left <= right) array[left] = array[left] + array[right] - (array[right] = array[left]);
            left++;
            right--;
            if (0 < right) quickSort(array, 0, right);
            if ((array.length - 1) > left) quickSort(array, left, array.length - 1);
        }

    }

    static void quickSort(int[] array, int begin, int end) {
        int pivot = (begin + (end - begin) / 2);
        int left = begin;
        int right = end;

        while (left <= right) {
            while (array[left] < array[pivot]) left++;
            while (array[pivot] < array[right]) right--;

            if (left <= right) array[left] = array[left] + array[right] - (array[right] = array[left]);
            left++;
            right--;
            if (begin < right) quickSort(array, 0, right);
            if (end > left) quickSort(array, left, end);
        }
    }
}

