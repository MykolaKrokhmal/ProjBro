package com.krokhmal.lessons.lesson012;

public enum Month{
    JAN(31,"January","Січень"),
    FEB(28, "February", "Лютий");
    private int days;
    private String nameEn;
    private String nameUa;
    Month(int days, String nameEn, String nameUa) {
        this.days = days;
        this.nameEn = nameEn;
        this.nameUa = nameUa;
    }

   /* public String getMonthName(int number){
        return number;
    }*/
}
