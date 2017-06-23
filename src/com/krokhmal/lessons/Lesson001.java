package com.krokhmal.lessons;

/**
 * Created by Крохмаль on 20.05.17.
 */
public class Lesson001 {
    public static void main(String[] args) {
        //Homework. Change two variables values in best way
        int x = 3, y = 5;
        System.out.print("x = " + x);
        System.out.println("; y = " + y);
        //Var. 1
        y = (x = x + y) - y;
        x = x - y;

        System.out.print("x = " + x);
        System.out.println("; y = " + y);}

}
