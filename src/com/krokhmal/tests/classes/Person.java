package com.krokhmal.tests.classes;

/**
 * Created by User on 11.07.2017.
 */
public class Person {
    private String ns = rw();
    private static String s = rws();
    public Person(){
        System.out.println("Constructor Person");
    }
    private static String rws(){
        System.out.println("static 1 of Person");
        return "static 1 of Person";
    }
    private String rw(){
        System.out.println("non static 1 of Person");
        return "not static 1 of Person";
    }

    public boolean check(Person x){
        return this.ns == x.ns;
    }
}
