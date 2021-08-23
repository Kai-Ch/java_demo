package com.demo.Interview.reflect;

import java.io.Serializable;

public class Student implements Serializable {

    public Student() {
        super();
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String chineseName) {
        this.name = name;
        this.age = age;
        this.chineseName = chineseName;
    }

    Student(String chineseName) {
        this.chineseName = chineseName;
    }

    private String name;

    private int age;

    private String chineseName = "学生";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public static class clazz{

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chineseName='" + chineseName + '\'' +
                '}';
    }
}
