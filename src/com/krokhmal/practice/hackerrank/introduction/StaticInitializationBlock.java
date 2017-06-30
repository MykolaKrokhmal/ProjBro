package com.krokhmal.practice.hackerrank.introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializationBlock {
    static int B;
    static int H;
    static boolean flag = true;

    static {
        Scanner read = new Scanner(System.in);
        try {
            B = read.nextInt();
            H = read.nextInt();
            if (B <= 0 || H <= 0)
                throw new Exception("Breadth and height must be positive");
        } catch (Exception e) {
            flag = false;
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

