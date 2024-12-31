package com.onesa.SecurityEx.core.model;

public class Student {
    private String name;
    private String course;
    private int age;

    public Student(String name, String course, int age) {
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public void setAge(int age) {
        this.age = age;
    }   

    @Override
    public String toString() {
        return "Student [name=" + name + ", course=" + course + ", age=" + age + "]";
    }
}
