package com.xenon.demo.student;

import java.time.LocalDate;

@SuppressWarnings("unused")
public class Student {

    private long id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private int age;

    public Student() {
    }

    public Student(String name, String email, LocalDate dateOfBirth, int age) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    public Student(long id, String name, String email, LocalDate dateOfBirth, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                '}';
    }
}