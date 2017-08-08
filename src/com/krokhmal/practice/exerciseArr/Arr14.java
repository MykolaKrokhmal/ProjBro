package com.krokhmal.practice.exerciseArr;

/**
 * Created by User on 10.06.2017.
 */
public class Arr14 {
    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) array[i] = i;


        for (int i = 2; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        for (int i = 1; i < array.length; i += 2){
            System.out.print(array[i] + " ");
        }
    }
}
