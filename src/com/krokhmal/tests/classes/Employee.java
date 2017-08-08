package com.krokhmal.tests.classes;

public class Employee extends Person{
    private static String s1 = init("S1 Employee");
    private String name = init("name Employee");
    private String surName;
    private static String s2 = init("S2 Employee");
    private int age = Integer.parseInt(init("5"));

    public Employee(String n, String s, int a){
        System.out.println("Constructor Employee");
        name = n;
        surName = s;
        age = a;
    }

    private static String s4;
    public static String init(String s){
        System.out.println(s);
        return s;
    }

    {
        System.out.println(surName);
        init("Init part Employee");
        surName = init("surName Employee");
    }

    static {
        System.out.println(s4);
            init("Static init part Employee");
        s4 = init("S4 Employee");}
    public String toString(){
        return (name + " " + surName + " has age " + age);
    }

    private static String s3 = init("S3 Employee");
}
