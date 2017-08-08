package com.krokhmal.lessons.lection009;

import java.util.Date;

/**
 * Created by User on 15.07.2017.
 */
public class Student {
    private int age;
    private String name;
    private String middleName;
    private String lastName;
    private String phone;
    private double averageMark;
    private Date birthDay;

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        Util.check(age <= 0, "Age can not be less then 15");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Util.check(name == null || name.isEmpty(), "Name can not be NULL");
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        Util.check(middleName == null || middleName.isEmpty(), "Middle name can not be NULL");
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        Util.check(lastName == null || lastName.isEmpty(), "Last name can not be NULL");
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        Util.check(averageMark < 0 || averageMark > 5, "Average mark can not be less then 0");

        this.averageMark = averageMark;
    }

    public Date getBirthDay() {
        return new Date(birthDay.getTime());
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    String getInfo(){
        return "Age = " + age + "\nname= " + name + "\nlast name = " + lastName + "\nmiddle name = " + middleName +
                "\nphone = " + phone + "\naverage mark = " + averageMark;
    }
}
