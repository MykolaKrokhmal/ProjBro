package com.krokhmal.lessons.lection009;


import java.util.Date;

/**
 * Created by User on 15.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        Student studentA = new Student();
        studentA.setBirthDay(new Date());

        System.out.println(studentA.getInfo());

        Date date = studentA.getBirthDay();


/*        studentA.setAge(16);
        studentA.setName("Petro");
        studentA.setMiddleName("Ivanovish");
        studentA.setLastName("Ivanov");
        studentA.setPhone("067-937-07-11");
        studentA.setAverageMark(5.0);

        Student studentB = new Student();
        studentB.setAge(18);
        studentB.setName("Vanya");
        studentB.setMiddleName("Petrovich");
        studentB.setLastName("Didulya");
        studentB.setPhone("067-937-07-11");
        studentB.setAverageMark(4.0);

        System.out.println(studentA.getInfo());

        Group group = new Group();
        group.setName("PM81");
        group.addStudent(studentA);
        group.addStudent(studentB);

        System.out.println(group.getCount());
        group.getGroupInfo();*/
    }
}
