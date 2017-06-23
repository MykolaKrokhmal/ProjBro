package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 30.05.2017.
 */
public class If22 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------");
        System.out.println("Enter coordinate point not on (X,0) or (0,Y) lines.");
        System.out.println("define coordinate quarter number.0-4.");
        System.out.println("-------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X: ");
        int xValue = scanner.nextInt();
        System.out.print("Enter Y: ");
        int yValue = scanner.nextInt();

        int coordinateQuarter = 0;

        if(yValue >= 0){
            if (xValue < 0) {
                coordinateQuarter = 0;
            }
            else {
                coordinateQuarter = 1;
            }
        }
        else{
            if (xValue < 0) {
                coordinateQuarter = 3;
            }
            else {
                coordinateQuarter = 2;
            }
        }

        System.out.println("=======================================================");
        System.out.println("Coordinate quarter is " + coordinateQuarter);
    }
}
