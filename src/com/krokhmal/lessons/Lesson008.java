package com.krokhmal.lessons;


/*Topic - Static methods*/

import java.util.Arrays;

public class Lesson008 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        inc(a);
        int[][] array = {{1,2,3,4,5,6}, {6,5,4,3,2,1}};
        print(array);
        System.out.println(calc(new double[]{1,2,3}, new String[]{"+", "+"}));

        System.out.println(invertLong(12345));
        System.out.println(factorialValue(5));
        System.out.println(factorialRecursion(5));
    }
    /*
    private - available only inside class
    default - available only inside of the package
    protected - available inside of the class and inherit classes
    public - available anywhere
    static - do NOT work with class parameters
    */
    public static void print(String s){
        System.out.println(s);
    }

    public static long sum (int a, int b){
        return a + b;
    }
    private static double calc(double a, double b, String operator){
        switch (operator){
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a * b;
            default : throw new IllegalArgumentException("No such operator");
        }
    }

    private static int inc(int a) {
        return a++;
    }

    private static void print(int[][] array){
        StringBuilder out = new StringBuilder();
        out.append("<");
        for (int i =  0; i < array.length; i++){
            out.append("<");
            for (int j =  0; j < array[0].length; j++) {
                out.append(String.format("%3d", array[i][j]));
            }
            if (i < array.length - 1) {
                out.append(">,");
                System.out.println(out);
            } else {
                out.append(">");
                System.out.print(out);
            }
            out = new StringBuilder(" ");
        }
        System.out.println(">");
    }

    private static void ff(int s, String... s1){}

    private static double calc(double[] value, String[] operation){
        System.out.println(Arrays.toString(value));
        System.out.println(Arrays.toString(operation));
        if(value.length - 1 != operation.length)
            throw new IllegalArgumentException("Operation quantity must be " + (value.length - 1));
        if(value.length == 0)
            throw new IllegalArgumentException("Number array must be not null");
        if(operation.length == 0)
            throw new IllegalArgumentException("Operation array must be not null");

        double result = value[0];
        for (int i = 1; i < value.length; i++) {
            switch (operation[i - 1]){
                case "+" : result += value[i]; break;
                case "-" : result -= value[i]; break;
                case "*" : result *= value[i]; break;
                case "/" : result /= value[i]; break;
                case "%" : result %= value[i]; break;
                default: throw new IllegalArgumentException("Illegal operation character");
            }
        }
        return result;
    }

    private static long invertLong(long inValue){
        long result = 0;
        while(inValue > 0){
            result = (result * 10) + inValue % 10;
            inValue /= 10;
        }
        return result;
    }

    private static long factorialValue(long n){
        long result = 1;
        if (n > 0)
            for (int i = 1; i <= n; i++)
                result *= i;

        return result;
    }
    private static long factorialRecursion(long n){
        if (n == 0) return 1;
        return n * factorialRecursion(n-1);
    }
}