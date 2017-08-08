package com.krokhmal.lessons.lection009;

/**
 * Created by User on 15.07.2017.
 */
public class Util {
    public static void check(boolean b, String message){
        if (b) throw new IllegalArgumentException(message);
    }
}
