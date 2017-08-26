package com.krokhmal.lessons.lesson013;

public class B extends A{
    {
        System.out.println("this is non static block");
    }

/*
    Topic for next lesson:
    inner nested anonimous classes and exception
*/
    private String a;
    private String b;


    public B(String a, String b){
        System.out.println("this is constructor");
        this.a = a;
        this.b = b;
    }

    public String getValue(B b){
        return "B";
    }
}
