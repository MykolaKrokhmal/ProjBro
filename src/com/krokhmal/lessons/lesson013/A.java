package com.krokhmal.lessons.lesson013;

public class A {
    static {
        a = "fff";

    }

    public final static String a;
    public static String b = "1111" + a;


    public String getValue(A a){
        return"A";
    }
}
