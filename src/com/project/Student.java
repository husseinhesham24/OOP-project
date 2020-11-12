package com.project;
public class Student extends Person {


    private static int numofemployee;

    public Student(String name, String nationality , String gender , int age , String address , String mobilePhone , int ID , String email , String job , String time , int salary) {
        super(name, nationality , gender ,age , address , mobilePhone , ID , email , job , time , salary);
    }

    public static int getNumofemployee() {
        return numofemployee;
    }

    public static void setNumofemployee(int numofemployee) {
        Student.numofemployee = numofemployee;
    }
}