package com.krokhmal.tests.classes2;

/**
 * Created by User on 12.07.2017.
 */
public class RootClass {
    private String param1 = setParam("Root.Param 1");
    private static String param2 = setStaticParam("Root.Static Param 2");
    private String param3;
    private final String param4 = setParam("Root.Final Param 4");
    private static String param5 = setStaticParam("Root.Static Param 5");

    public RootClass(){
        System.out.println("Root.Constructor begin");
        param3 = setParam("Root.Param 3");
    }

    public static String setStaticParam(String name){
        System.out.println(name);
        return name;
    }

    public String setParam(String name){
        System.out.println(name);
        return name;
    }

}
