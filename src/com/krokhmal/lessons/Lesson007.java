package com.krokhmal.lessons;

import java.util.Arrays;
import java.util.Scanner;


public class Lesson007 {
    public static void main(String[] args) {
        test();
    }

    public static void exercise8() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter text line: ");

        String content = read.nextLine();
        read.close();

        int[] quantityOf = new int[128];
        for (int index = 0; index < content.length(); index++)
            quantityOf[content.charAt(index)]++;

        for (char symbol = 0; symbol < quantityOf.length; symbol++)
            if (quantityOf[symbol] > 1)
                System.out.println(symbol + " - " + quantityOf[symbol]);

    }

    public static void test(){
        Scanner read = new Scanner(System.in);
        String word1 = read.nextLine();
        String word2 = read.nextLine();
        int code1 = word1.charAt(0);
        for (int index = 1; index < word1.length(); index++) code1 ^= word1.charAt(index);
        int code2 = word2.charAt(0);
        for (int index = 1; index < word2.length(); index++) code2 ^= word2.charAt(index);

        System.out.println(code1 + " - " + code2);
    }

    public static void exercise9() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter word for anagram calculation: ");
        //For testing enter "qwerty"
        String testingWord = read.nextLine();
        read.close();

        int testingWordCheckSum = 0;

        for (int position = 0; position < testingWord.length(); position++)
            testingWordCheckSum ^= Character.toLowerCase(testingWord.charAt(position));

        int anagramCount = 0;

        final int DICTIONARY_WORDS_COUNT = 10;
        String[] dictionary = new String[DICTIONARY_WORDS_COUNT];
        dictionary[0] = "twyQre"; //anagram 1 to qwerty
        dictionary[1] = "ytrewq"; //anagram 2 to qwerty
        dictionary[2] = "about";
        dictionary[3] = "askIt";
        dictionary[5] = "hello";
        dictionary[4] = "rETWyq"; //anagram 3 to qwerty
        dictionary[6] = "lesson";
        dictionary[7] = "onless";
        dictionary[8] = "rtyewq"; //anagram 4 to qwerty
        dictionary[9] = "season";

        for (int word = 0; word < dictionary.length; word++) {

            if (testingWord.length() == dictionary[word].length()) {

                int compareWordCheckSum = 0;
                for (char position = 0; position < dictionary[word].length(); position++)
                    compareWordCheckSum ^= Character.toLowerCase(dictionary[word].charAt(position));

                if (testingWordCheckSum == compareWordCheckSum && !testingWord.equals(dictionary[word]))
                    anagramCount++;
            }
        }
        String answer = String.format("It is %d anagrams to word %s", anagramCount, testingWord);
        System.out.println("------------------------------------------------------------------");
        System.out.println(answer);
    }
}