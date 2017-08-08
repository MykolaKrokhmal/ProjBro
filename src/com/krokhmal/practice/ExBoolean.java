package com.krokhmal.practice;

import java.lang.*;

/**
 * Created by NKrok on 25.05.2017.
 */
public class ExBoolean {
    public static void main(String[] args) {

        //Boolean 1
       // Scanner s = new Scanner(System.in);

        int A = 2;//s.nextInt();

        boolean b = (A >= 0);

        System.out.println("Boolean 1: " + A + " is positive  => condition is " + b);

        //Boolean 2
        System.out.print("Boolean 2: " + A + " is odd  => condition is ");
        if (A % 2 != 0)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 3
        System.out.print("Boolean 3: " + A + " is even  => condition is ");
        if (A % 2 == 0)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 4
        A = 5;
        int B = 2;
        System.out.print("Boolean 4: " + A + " > 2 and " + B + "  <= 3 is ");
        if (A > 2 && B <= 3)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 5
        A = 2;
        B = 8;
        System.out.print("Boolean 5: " + A + " >= 0 or " + B + "  < -2 is ");
        if (A >= 0 || B < -2)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 6
        A = 5;
        B = 3;
        int C = 2;
        System.out.print("Boolean 6: " + A + " < " + B + " < " + C + " is ");
        if (A < B && B < C)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 7
        A = 7;
        B = 9;
        C = 45;
        System.out.print("Boolean 7: " + B + " between " + A + " and " + C + " is ");
        if (A < B && B < C)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 8
        System.out.print("Boolean 8: " + A + " and " + B + " both are odd - ");
        if(A % 2 != 0 && B % 2 != 0)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 9
/*
        int a1 = s.nextInt();
        int a2 = s.nextInt();
        b = A % 2 != 0 || B % 2 != 0;
        System.out.print("Boolean 9: " + a1 + " or " + a2 + " is odd - " + b);
*/

        //Boolean 10
        A = 5;
        B = 4;
        System.out.print("Boolean 10: Only " + A + " or only " + B + " is odd - ");
        if(A % 2 != B % 2)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 11
        System.out.print("Boolean 11: " + A + " and " + B + " both even or odd is ");
        if(A % 2 == B % 2)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 12
        A = 7;
        B = 2;
        C = 9;
        System.out.print("Boolean 12: " + A + " and " + B + " and " + C + " are positive - ");
        if(A >= 0 && B >= 0 && C >= 0)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 13
        A = -1;
        B = 4;
        C = -8;
        System.out.print("Boolean 13: " + A + " or " + B + " or " + C + " are positive - ");
        if(A >= 0 && B >= 0 && C >= 0)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 14
        A = -867;
        B = -345;
        C = 695;
        System.out.print("Boolean 14: Only one of " + A + ", " + B + ", " + C + " is positive - ");
        if(( (A >> 31) + (B >> 31) + (C >> 31)) == -2)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 15
        A = 45;
        B = 3;
        C = -6;
        System.out.print("Boolean 15: Only two of " + (A >> 1) + ", " + B + ", " + C + " are positive - ");
        if(( (A >> 31) + (B >> 31) + (C >> 31)) == -1)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 16
        A = 65;
        System.out.print("Boolean 16: Number " + A + " is positive, 2 digit even number - ");
        if (A < 100 && A > 9 && A % 2 == 0)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 17
        A = 765;
        System.out.print("Boolean 17: Number " + A + " is odd three digit nubmer - ");
        if(A > 99 && A < 1000 && A % 2 == 1)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 18
        A = 123;
        B = 542;
        C = 123;
        System.out.print("Boolean 18: A == B or A == C or B == C is ");
        if (A == B || A == C || B == C)
            System.out.println("true");
        else
            System.out.println("false");

        //Boolean 19
        A = 123;
        B = 542;
        C = -123;
        b = A + B == 0 || A + C == 0 || B + C == 0;
        System.out.println("Boolean 19: A = -B or A == -C or B == -C is " + b);

        //Boolean 20
/*
        int input = s.nextInt();
        a1 = (input / 100);
        a2 = (input % 100) / 10;
        int a3 = input & 10;
        b = a1 != a2 && a1 != a3 && a2 != a3;
        System.out.print("Boolean 20: All digits of number " + input + " are different - " + b);
*/

        //Boolean 21
/*
        A = 246;
        System.out.print("Boolean 21: Digits in number " + A + " is a increasing sequence - ");
        a1 = (input / 100);
        a2 = (input % 100) / 10;
        a3 = input & 10;
        if (a1 < a2 && a2 - a1 == a3 - a2)
            System.out.println("true");
        else
            System.out.println("false");
*/

        //Boolean 22
/*
        A = 642;
        System.out.print("Boolean 22: Digits in number " + A + " is a increasing or decreasing sequence - ");
        a1 = (A / 100);
        a2 = (A % 100) / 10;
        a3 = (A % 10) * 10;
        if (Math.abs(a2 - a1) == Math.abs(a3 - a2))
            System.out.println("true");
        else
            System.out.println("false");
*/

        //Boolean 23
/*
        A = 1221;
        System.out.print("Boolean 23: Number " + A + " is a mirror number - ");
        a1 = (A / 1000);
        a2 = (A - a1 * 1000) / 100;
        a3 = (A - a1 * 1000 - a2 * 100) / 10;
        int a4 = A - a1 *1000 - a2 * 100 - a3 * 10;
        if (a4 == a1 && a2 == a3)
            System.out.println("true");
        else
            System.out.println("false");
*/

        //Boolean 24
        A = 12;
        B = 3;
        C = 5;
        double D = Math.pow(B, 2) + 4 * A * C;
        boolean answer = D >= 0;
        System.out.println("Boolean 24: A*x^2 + B*x + C = 0 is " + answer);

        //Boolean 25
        int x = -23;
        int y = 4;
        answer = x < 0 && y > 0;
        System.out.println("Boolean 25: (x,y) in second quarter is " + answer);

        //Boolean 26
        answer = x > 0 && y < 0;
        System.out.println("Boolean 26: (x,y) in fourth quarter is " + answer);

        //Boolean 27
        answer = (x < 0 && y > 0) || (x < 0 && y < 0);
        System.out.println("Boolean 27: (x,y) in second or third quarter is " + answer);

        //Boolean 28
        answer = (x > 0 && y > 0) || (x < 0 && y < 0);
        System.out.println("Boolean 28: (x,y) in first or third quarter is " + answer);

        //Boolean 29
        x = 5; y = 5;
        int x1 = 3; int y1 = 7;
        int x2 = 10; int y2 = 3;
        answer = x1 < x && x < x2 && y1 < y && y < y2;
        System.out.println("Boolean 29: x,y point is inside of rectangle is " + answer);

        //Boolean 30
        int a = 3;
        int b1 = 5;
        int c = 3;
        answer = a == b1 && b1 == c;
        System.out.println("Boolean 30: Rectangle with same sides is " + answer);

        //Boolean 31
        answer = a == b1 || b1 == c || a == c;
        System.out.println("Boolean 31: Rectangle with same two sides is " + answer);

        //Boolean 32
        answer = a * a == b1 * b1 + c * c || b1 * b1 == a * a + c * c || c * c == a * a + b1 * b1;
        System.out.println("Boolean 32: Rectangle this 90 degr. angle is " + answer);

        //Boolean 33
        answer = (a < b1 + c) && (b1 < a + c) && (c < a + b1);
        System.out.println("Boolean 33: Rectangle with sides a,b,c is possible " + answer);

        //Boolean 34
        x = 6;
        y = 8;
        answer = x % 2 == 1 && y % 2 == 1;
        System.out.println("Boolean 34: cell x,y on chess field is black " + answer);

        //Boolean 35
        x1 = 3;
        x2 = 7;
        y1 = 5;
        y2 = 8;
        answer = x1 % 2 == x2 % 2 && y1 % 2 == y2 % 2;
        System.out.println("Boolean 35: cells x1,y1 and x2,y2 with same color is " + answer);

        //Boolean 36
        answer = x1 == x2 || y1 == y2;
        System.out.println("Boolean 36: this move possible is " + answer);

        //Boolean 37
        answer = x1 == x2 && y2-y1==1 || x2-x1==1 && y1==y2;
        System.out.println("Boolean 37: this move possible is " + answer);

        //Boolean 38
        //Boolean 39
        //Boolean 40
    }
}
