package com.krokhmal.tests.classes2;

import java.util.ArrayList;

/**
 * Created by User on 12.07.2017.
 */
public class SonClass extends GrandClass {
    private final String param1 = setParam("      Son.Param1");
    public SonClass(){
        super("CreateGrandClass");
        System.out.println("      Son.Constructor ");

    }

    public static void main(String[] args) {
        new SonClass();
    }
}
