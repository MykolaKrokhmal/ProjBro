package com.krokhmal.lessons.lesson013;

import java.util.Date;

public class Student implements Cloneable {
    private int age;
    private String name;
    private Date birthday;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Student clone() {
        try {

            Student st = (Student) super.clone();

            st.address = address.clone();

            return st;
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public Student(int age, String name, Date birthday) {
        this.age = age;
        this.name = name;
        this.birthday = birthday;
    }
    public Student(Student original) {
        this.age = (original == null) ? 0 : original.getAge();
        this.name = (original == null) ? null : original.getName();
        this.birthday = (original == null) ? null : original.getBirthday();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
