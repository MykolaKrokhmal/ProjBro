package com.krokhmal.lessons;


import javax.sound.midi.Soundbank;
import java.util.*;

/**
 * Created by User on 27.05.2017.
 */
public class Lesson003 {
    private enum Size {SMALL,MEDIUM,LARGE, EXTRA_LARGE};
    public static void main(String[] args) {
        int i = 3;
        i = i++ + ++i + i++;
     // i =  3  +  5  + 5
        // 1. Отобразить i == 1
        // 2. Увеличить i на 1, i == 2.
        // 3. Получается 1 + 3. Цифра три потому, что ++i вначале увеличивает 2 в 3 а потом отдает.
        //
        System.out.println(i);
        System.out.println(String.format("i is equal to %d", i));
        Size s = Size.SMALL;

        String greeting = "Hello";
        String greeeting2 = "Hello";
        if (greeting == "Hello")
        {
            System.out.println("Hello");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number A: ");
        int A = scanner.nextInt();
        System.out.println("Enter number B: ");
        int B = scanner.nextInt();
        int sum = A + B;
        System.out.println("Result = " + sum);
    }
}
