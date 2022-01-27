package com.alilestera.domain;

/**
 * @author Alilestera
 * @date 1/15/2022
 */
public class Student {
    private String name;
    private int id;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}
