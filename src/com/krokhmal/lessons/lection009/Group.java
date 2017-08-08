package com.krokhmal.lessons.lection009;

/**
 * Created by User on 15.07.2017.
 */
public class Group {
    private String name;
    private int count;
    public Student[] students;

    public Student[] getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Util.check(name == null, "Name can not be NULL");
        this.name = name;
    }

    public void addStudent(Student student){
        Util.check(student == null, "Student can not be NULL");

        if (students == null){
            students = new Student[25];
        }
        Util.check(count >= 24, "Max students count already reached");
        students[++count] = student;
    }

    public int getCount() {
        return count;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    void getGroupInfo(){
        System.out.println(name);
        for (Student s : students) {
            System.out.println(s.getInfo());
            System.out.println();
        }
    }
}
