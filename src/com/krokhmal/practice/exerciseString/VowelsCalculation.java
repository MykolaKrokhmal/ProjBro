package com.krokhmal.practice.exerciseString;

import java.util.Scanner;

/**
 * Created by User on 22.06.2017.
 */
public class VowelsCalculation {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter quantity of cases: ");
        int casesQuantity = Integer.parseInt(read.nextLine());

        if (casesQuantity < 1) System.out.println("Incorrect enter. Quantity must be greater 0");
        else{
            String[] test = new String[casesQuantity];
            char[] vowel = {'a','e','i','o','u'};
            int[] vowelsCount = new int[casesQuantity];

            for (int entryNumber = 0; entryNumber  < test.length; entryNumber++) {

                String header = String.format("Enter string number %d", entryNumber + 1);
                System.out.println(header);
                test[entryNumber] = read.nextLine();

                for (int index = 0; index < test[entryNumber].length(); index++){
                    for (int vowelIndex = 0; vowelIndex < vowel.length; vowelIndex++)
                    if(test[entryNumber].toCharArray()[index] == vowel[vowelIndex]) vowelsCount[entryNumber]++;
                }
            }
            System.out.println("-------------------------------------------------");
            System.out.print("Answer is: ");
            for (int index = 0; index < vowelsCount.length; index++)
                System.out.print(vowelsCount[index] + " ");
        }
        read.close();


    }
}
