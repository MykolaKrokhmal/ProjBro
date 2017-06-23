package com.krokhmal.practice.exerciseCase;

import java.util.Scanner;

/**
 * Created by NKrok on 09.06.2017.
 */
public class Case18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number in range 100-999: ");
        int number = sc.nextInt();

        sc.close();

        if(number < 100 || number > 999)
            System.out.println("Incorrect entered number. Restart the program.");
        else {
            System.out.println("--------------------------------------------------------------------------------");
            String hundreds = "";
            switch (number / 100){
                case  1: hundreds = "one hundred"; break;
                case  2: hundreds = "two hundred"; break;
                case  3: hundreds = "three hundred"; break;
                case  4: hundreds = "four hundred"; break;
                case  5: hundreds = "five hundred"; break;
                case  6: hundreds = "six hundred"; break;
                case  7: hundreds = "seven hundred"; break;
                case  8: hundreds = "eight hundred"; break;
                case  9: hundreds = "nine hundred"; break;
            }
            String tenth = "";
            String ones = "";

            if ((number / 10) % 10 == 1){
                switch ((number / 10) % 10){
                    case  1: tenth = "eleven"; break;
                    case  2: tenth = "twelve"; break;
                    case  3: tenth = "thirteen"; break;
                    case  4: tenth = "fourteen"; break;
                    case  5: tenth = "fifteen"; break;
                    case  6: tenth = "sixteen"; break;
                    case  7: tenth = "seventeen"; break;
                    case  8: tenth = "eighteen"; break;
                    case  9: tenth = "nineteen"; break;
                }
            }
            else{
                switch ((number / 10) % 10){
                    case  2: tenth = " twenty"; break;
                    case  3: tenth = " thirty"; break;
                    case  4: tenth = " forty"; break;
                    case  5: tenth = " fifty"; break;
                    case  6: tenth = " sixty"; break;
                    case  7: tenth = " seventy"; break;
                    case  8: tenth = " eighty"; break;
                    case  9: tenth = " ninety"; break;
                }

                switch (number % 10){
                    case  1: ones = " one"; break;
                    case  2: ones = " two"; break;
                    case  3: ones = " three"; break;
                    case  4: ones = " four"; break;
                    case  5: ones = " five"; break;
                    case  6: ones = " six"; break;
                    case  7: ones = " seven"; break;
                    case  8: ones = " eight"; break;
                    case  9: ones = " nine"; break;
                }

            }

            System.out.println("Entered number is " + hundreds + tenth + ones);
        }


    }
}
