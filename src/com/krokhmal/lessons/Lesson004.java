package com.krokhmal.lessons;


import java.util.Random;
import java.util.Scanner;

/**
 * Created by User on 27.05.2017.
 */
public class Lesson004 {
    public static void main(String[] args) {
        long l = 5;
        float f = 5;

        if (0.3 == 0.2 + 0.1){
            // Будет false, т.к. 0.2 + 0.1 = 0.29999999999999999. Недостаток Java
        }

        int actualCase = 0;
        switch(actualCase){
            case 1:{

                    }
                    break;

            case 2:{

                    }
                    break;
            case 3:{

                    }
                    break;
            default: break;
        }
/*
        int b = 10;
        for(int i = 0; i < 10; i++){
            System.out.println("i = " + i);
            System.out.println("b = " + b);
        }

        for(int i = 0; i < 10; i++)
            for( int j = 0; j < 10; j++)
                System.out.println("i = " + i + "; j= " + j);
*/

     lab1:
        for(int i = 0; i < 10; i++){

            System.out.println("i = " + i);
            for (int j = 0; j < 10; j++){
                System.out.println("j = " + j);
                if (j >=5 && i > 5)
                    continue lab1;
            }
        }
        //////////////////////////////////////////////////////////
        //The same as for(int i = 0; i < 10; i++)
        {
            int i = 0;
            while (i < 10) {
                //code
                System.out.print(i);
                i++;
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Please give me a number: ");
        int n = sc.nextInt();

        Random r = new Random();

        for (int i = 0; i < n; i++){

            //System.out.println(r.nextInt(11) - 5);
            System.out.println(Math.random());
        }
        sc.close();
    }
}
