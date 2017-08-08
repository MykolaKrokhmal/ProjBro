package com.krokhmal.tests.classes2;

public class GrandClass extends RootClass{
    private String param1 = setParam("Grand.","Param1");
    private static String param2 = setStaticParam("Grand.","Param2");
    private final String param3;

    public String setParam(String f, String s){
        System.out.println("   "+f+s);
        return f+s;
    }
    public static String setStaticParam(String f, String s){
        System.out.println("   "+f+s);
        return f+s;
    }

    public GrandClass(String name){
        System.out.println("   Grand.Constructor " + name);
        param3 = setParam("Grand.","FinalParam3");
    }
}
