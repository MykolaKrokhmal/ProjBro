package com.krokhmal.practice;

/**
 * Created by User on 23.05.2017.
 */
public class ExInteger {

    public static void main(String[] args) {
        //Integer 1
        int L = 1235;
        System.out.println("Integer 1: In " + L + " cm it is " + (L / 100) + " full m");

        //Integer 2
        int M = 12538;
        System.out.println("Integer 2: In " + M + " kg it is " + (M / 1000) + " full ton");

        //Integer 3
        int Kb = 8200;
        System.out.println("Integer 3: In " + Kb + " Kb it is " + (Kb / 1024) + " full Mb");

        //Integer 4
        int A = 56;
        int B = 12;
        System.out.println("Integer 4: In segment " + A + " it is " + (A / B) + " full segments");

        //Integer 5
        A = 56;
        B = 12;
        System.out.println("Integer 5: In segment " + A + " it is " + (A - (A / B)) + " seft free segments");

        //Integer 6
        A = 54;
        System.out.println("Integer 6: Number  " + A + " consist of " + (A / 10) + " and " + (A - (A / 10) * 10) + " digit");

        //Integer 7
        A = 32;
        System.out.println("Integer 7: For digits of number " + A + ": sum is " +
                            ((A / 10) + (A - (A / 10) * 10)) +
                            "; product is " + ((A / 10) * (A - (A / 10) * 10)));

        //Integer 8
        A = 34;
        System.out.print("Integer 8: if change digits in number " + A);
        A = (A - (A / 10) * 10) * 10 + A / 10;
        System.out.println(" will be number " + A);

        //Integer 9
        A = 321;
        System.out.println("Integer 9: First digit in number " + A + " is " + (A / 100));

        //Integer 10
        int A1 = (A - (A / 100) * 100);
        System.out.print("Integer 10: middle digit of number " + A + " is " + (A - (A / 10) * 10));
        System.out.println(" middle numerical is " + (A1 / 10));

        //Integer 11
        System.out.print("Integer 11: Sum of number " + A + " digits is ");
        System.out.print((A / 100) + (A1 / 10) + (A - (A / 10) * 10) + "; Product is ");
        System.out.println((A / 100) * (A1 / 10) * (A - (A / 10) * 10));

        //Integer 12
        System.out.print("Integer 12: From right to left number " + A + " is ");
        System.out.println((A / 100) + ((A1 / 10) * 10) + ((A - ((A / 10) * 10)) * 100));

        //Integer 13
        System.out.print("Integer 13: If move left digit to right in number " + A);
        System.out.println(" will be number " + ((A / 100) + (A - (A / 100) * 100) * 10));

        //Integer 14
        System.out.print("Integer 14: If move right digit to left in number " + A);
        System.out.println(" will be number " + ((A / 10) + (A - (A / 10) * 10) * 100));

        //Integer 15
        System.out.print("Integer 15: If change right and middle digits place in number " + A);
        System.out.println(" will be number " + ((A1 / 10) * 100 + ((A / 100) * 10) + (A - (A / 10) * 10)));

        //Integer 16
        System.out.print("Integer 16: If change left and middle digits place in number " + A);
        System.out.println(" will be number " + ((A1 / 10) + ((A / 100) * 100) + (A - (A / 10) * 10) * 10));

        //Integer 17
        A = 1234;
        System.out.println("Integer 17: If change left and middle digits place in number " + (A / 100) % 10);

        //Integer 18
        System.out.println("Integer 18: If change left and middle digits place in number " + (A / 1000) % 100);

        // Integer 19
        int sec = 123;
        int min = sec / 60;
        System.out.println("Integer 19: In  " + sec + " seconds full " + min + " minutes.");

        //Integer 20
        sec = 12345;
        System.out.println("Integer 20: In  " + sec + " seconds full " + sec / 60 / 60 + " hours.");

        //Integer 21
        System.out.println("Integer 21: In " + sec + " seconds passed " + (sec % 60) + " seconds after last minute");

        //Integer 22
        System.out.println("Integer 22: In " + sec + " seconds passed " + (sec % (60 * 60)) + " seconds after last hour");

        //Integer 23
        System.out.println("Integer 23: In " + sec + " seconds passed " + (sec % (60 * 60) / 60) + " full minutes after last hour");

        //Integer 24
        int K = 132;
        System.out.print("Integer 24: If 1st January is Sunday, " + K + "th day of year is ");
        switch((K - 1) % 7){
            case 0:
                System.out.println("Sunday"); break;
            case 1:
                System.out.println("Monday"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday"); break;
            case 4:
                System.out.println("Thursday"); break;
            case 5:
                System.out.println("Friday"); break;
            case 6:
                System.out.println("Saturday"); break;
            default:
                System.out.println("Noneday"); break;
        }

        //Integer 25
        K = 15;
        System.out.print("Integer 25: If 1st January is Thursday, " + K + "th day of year is ");
        switch((K + 3) % 7){
            case 0:
                System.out.println("Sunday"); break;
            case 1:
                System.out.println("Monday"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday"); break;
            case 4:
                System.out.println("Thursday"); break;
            case 5:
                System.out.println("Friday"); break;
            case 6:
                System.out.println("Saturday"); break;
            default:
                System.out.println("Noneday"); break;
        }

        //Integer 26
        K = 8;
        System.out.print("Integer 26: If 1st January is Tuesday, " + K + "th day of year is ");
        switch((K + 1) % 7){
            case 7:
                System.out.println("Sunday"); break;
            case 1:
                System.out.println("Monday"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday"); break;
            case 4:
                System.out.println("Thursday"); break;
            case 5:
                System.out.println("Friday"); break;
            case 6:
                System.out.println("Saturday"); break;
            default:
                System.out.println("Noneday"); break;
        }

        //Integer 27
        K = 54;
        System.out.print("Integer 27: If 1st January is Saturday, " + K + "th day of year is ");
        switch((K + 5) % 7){
            case 7:
                System.out.println("Sunday"); break;
            case 1:
                System.out.println("Monday"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday"); break;
            case 4:
                System.out.println("Thursday"); break;
            case 5:
                System.out.println("Friday"); break;
            case 6:
                System.out.println("Saturday"); break;
            default:
                System.out.println("Noneday"); break;
        }

        //Integer 28
        K = 154;
        int N = 3;
        System.out.print("Integer 28: If 1st January is Saturday, " + K + "th day of year is ");
        switch((K + N) % 7){
            case 7:
                System.out.println("Sunday"); break;
            case 1:
                System.out.println("Monday"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday"); break;
            case 4:
                System.out.println("Thursday"); break;
            case 5:
                System.out.println("Friday"); break;
            case 6:
                System.out.println("Saturday"); break;
            default:
                System.out.println("Noneday"); break;
        }

        //Integer 29
        A = 40;
        B  = 35;
        int C = 10;
        int CCount = (A / C) * (B / C);
        int Sq = A * B - CCount * C * C;

        System.out.print("Integer 29: It is possible to place " + CCount + " squares with border length " + C);
        System.out.println(" in rectangle with border length (A, B) = (" + A + ", " + B + ").");
        System.out.println("            Remaining area is " + Sq);

        //Integer 30
        A = 1901;
        System.out.println("Integer 30: year " + A + " belongs to " + (A / 100 + 1) + " century");
    }
}
