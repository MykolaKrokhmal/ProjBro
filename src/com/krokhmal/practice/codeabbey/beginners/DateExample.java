package com.krokhmal.practice.codeabbey.beginners;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by User on 04.07.2017.
 */
public class DateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);
        DayOfWeek weekDay = date.getDayOfWeek();
        int value = weekDay.getValue();
        System.out.println("Mon  Tue  Wed  Thu  Fri  Sat  Sun");
        for (int i = 1; i < value; i++) System.out.print("     ");
        while (date.getMonthValue() == month){
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today) System.out.print("* ");
            else System.out.print("  ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }

    }
}
