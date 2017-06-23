package com.krokhmal.practice.exerciseArr;

/**
 * Created by User on 10.06.2017.
 */
public class Arr08 {
    public static void main(String[] args) {
        int[] array = new int[20];

        for(int i = 0; i < array.length; i++) array[i] = i;

        int count = 0;
        for(int i = array.length-1; i >= 0; i--){
            if(array[i] % 2 == 1) {
                System.out.print(array[i]);
                count++;
                if(i > 0) System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Total count is " + count);
    }
}
