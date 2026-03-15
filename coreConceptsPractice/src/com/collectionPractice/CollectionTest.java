package com.collectionPractice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class Emp{
    private String name;
    private Double salary;
    private Integer age;
    private String department;
    private String gender;

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Emp(String name, Double salary, Integer age, String department) {
        this.name = name;
        this.salary = salary;
        this.age=age;
        this.department=department;
    }

    public Emp(String name, Double salary, Integer age, String department, String gender) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
        this.gender = gender;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Emp(String name, Double salary, Integer age) {
        this.name = name;
        this.salary = salary;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

public class CollectionTest {
    public static void main(String[] args) {
//        List<Emp> list= List.of(
//                new Emp("Manish",1000.0),
//                new Emp("Pandey",1000.0),
//                new Emp("Avinas",3000.0)
//        );
//        Map<String,Double> map=list.stream().collect(Collectors.toMap(Emp::getName,Emp::getSalary));
//        System.out.println(map);

       List<String> list=List.of("Manish","Pandey","Avinash","Kumar","Suprbha");
       Map<Integer,List<String>> map=list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);
    }
}
