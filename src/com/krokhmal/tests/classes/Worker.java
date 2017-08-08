package com.krokhmal.tests.classes;

/**
 * Created by User on 11.07.2017.
 */
public class Worker extends Employee{
    private String profession = init("profession Worker");
    private static String st1 = init("St1 Worker");
    public Worker(String name, String surName, Integer age, String profession){
        super(name, surName, age);
        System.out.println("Constructor Worker");
        this.profession = profession;
    }


}
