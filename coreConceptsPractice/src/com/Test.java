package com;


import java.io.Serializable;

class Emp implements Serializable {
    private String name;
    private Integer age;

    private Character gender;

    public Emp(String name, Integer age, Character gender) {
        this.name = name;
        this.age = age;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Character getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

class Student implements Serializable{
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}

public class Test{
    public static void main(String[] args) {

    }
}
