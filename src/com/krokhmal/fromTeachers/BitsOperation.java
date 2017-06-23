package com.krokhmal.fromTeachers;

/**
 * @author Vasily Kononenko
 */
public class BitsOperation {
    public static void main(String[] args) {
        int a = 5;
        // we need to see binary representation
        System.out.println("int a=" + a + "  binary a=" + Integer.toBinaryString(a));
        int b = 10;
        System.out.println("int b=" + b + "  binary b=" + Integer.toBinaryString(b));

        // now do some manipulations
        // AND
        System.out.println("AND");
        b = 1;
        System.out.println("int b=" + b + "  binary b=" + Integer.toBinaryString(b));
        a = a & b;
        System.out.println("int a=" + a + "  binary a=" + Integer.toBinaryString(a));
        // another
        b = 3;
        System.out.println("int b=" + b + "  binary b=" + Integer.toBinaryString(b));
        a = a & b;
        System.out.println("int a=" + a + "  binary a=" + Integer.toBinaryString(a));



        // OR
        System.out.println("OR");
        b = 1;
        System.out.println("int b=" + b + "  binary b=" + Integer.toBinaryString(b));
        a = a | b;
        System.out.println("int a=" + a + "  binary a=" + Integer.toBinaryString(a));
        // another
        b = 3;
        System.out.println("int b=" + b + "  binary b=" + Integer.toBinaryString(b));
        a = a | b;
        System.out.println("int a=" + a + "  binary a=" + Integer.toBinaryString(a));


        // XOR
        System.out.println("XOR");
        b = 1;
        System.out.println("int b=" + b + "  binary b=" + Integer.toBinaryString(b));
        a = a ^ b;
        System.out.println("int a=" + a + "  binary a=" + Integer.toBinaryString(a));
        // another
        b = 3;
        System.out.println("int b=" + b + "  binary b=" + Integer.toBinaryString(b));
        a = a ^ b;
        System.out.println("int a=" + a + "  binary a=" + Integer.toBinaryString(a));


        // NOT inversion
        System.out.println("NOT");
        a = ~a;
        System.out.println("int a=" + a + "  binary a=" + Integer.toBinaryString(a));
        // another
        a = ~a;
        System.out.println("int a=" + a + "  binary a=" + Integer.toBinaryString(a));

        //  right shift
        System.out.println("right shift");
        a = a >> 1;
        System.out.println("int a=" + a + "  binary a=" + Integer.toBinaryString(a));
        // another
        a >>= 3;
        System.out.println("int a=" + a + "  binary a=" + Integer.toBinaryString(a));



        // signed left shift
        System.out.println("signed left shift");
        a = a << 1;
        System.out.println("int a=" + a + "  binary a=" + Integer.toBinaryString(a));
        // another
        a <<= 3;
        System.out.println("int a=" + a + "  binary a=" + Integer.toBinaryString(a));


        // unsigned right shift
        System.out.println("unsigned right shift");
        a = a >>> 1;
        System.out.println("int a=" + a + "  binary a=" + Integer.toBinaryString(a));
        // another
        a >>>= 3;
        System.out.println("int a=" + a + "  binary a=" + Integer.toBinaryString(a));

    }
}