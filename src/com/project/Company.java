package com.project;

public class Company {
    private String address;
    private String mobilePhone;
    private String email;
    static private int numberOfEmployees;
    static private int numberOfStudents;
    //constructor
    public Company(String address, String mobilePhone, String email) {
        this.address = address;
        this.mobilePhone = mobilePhone;
        this.email = email;
    }

    //empty constructor
    public Company() {
    }

    //getters and setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public String toString() {
        return "Company"+"\n" +"---------------"+"\n"+ "Address:  " + address +"\n" +"\n"+ "MobilePhone:  " + mobilePhone +"\n"+"\n" +"Email:  " + email;
    }


}