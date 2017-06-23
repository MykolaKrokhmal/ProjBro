package com.krokhmal.lessons;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by User on 10.06.2017.
 */
public class Lesson005 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,6,1,2,8,4,5,0};

        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {

                    /*int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;*/

                    arr[j] = arr[j] + arr[j + 1] - (arr[j + 1] = arr[j]);
                }
            }
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arrayOdds = new int[10];
        int number = 1;
        for(int i = 0; i < arrayOdds.length; i++ ) {
            arrayOdds[i] = number;
            number += 2;
        }

        for (int i = 0; i < arrayOdds.length; i++){
            System.out.print(i);
            if(i < arrayOdds.length - 1)
                System.out.print(", ");
        }
        System.out.println();




        String s = new String("He    ll o");

        String[] stringMass = s.split(" ");
        System.out.println(String.format("%s - %s", "one", 2 ));
        System.out.println(Arrays.toString(stringMass));
        //
        // Алгоритмы сортировки
    }
}
