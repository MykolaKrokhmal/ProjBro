package com.krokhmal.lessons.lesson013;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        A a = new B("a1","b1");

        System.out.println(A.a);
        System.out.println(A.b);

        System.out.println(a.getValue(new B("a2","b2")));

        Address address = new Address("4", "srasovskogo","Brovary");
        Student firstStusent = new Student(18, "Petro", new Date());

        Student cloneStudent = firstStusent.clone();


        cloneStudent.setAddress(address);

        System.out.println(firstStusent);
        System.out.println(cloneStudent);

        firstStusent.setBirthday(new Date(100000000));
        address.setCity("Kyiv");

        System.out.println(firstStusent);
        System.out.println(cloneStudent);

    }

}
