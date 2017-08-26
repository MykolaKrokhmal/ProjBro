package com.krokhmal.tests.classes2;

import java.util.ArrayList;

/**
 * Created by User on 12.07.2017.
 */
public class SonClass extends GrandClass {
    private final String param1 = setParam("      Son.Param1");
    private final static String param2 = setStaticParam("      Son.","Static Param2");

    public SonClass(){
        super("CreateGrandClass");
        System.out.println("      Son.Constructor ");

    }

    public static void main(String[] args) {
        Object s = new SonClass();
        System.out.println(s.getClass());
    }
}
