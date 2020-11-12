package com.project;

public class Person {

    private String name;
    private int age;
    private int ID;
    private int salary;
    private String gender;
    private String Time;
    private String job;
    private String address;
    private String mobilePhone;
    private String email;
    private String nationality;
    //constructor

    public Person(String name, String nationality , String gender , int age , String address , String mobilePhone , int ID , String email , String job , String time , int salary) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.salary = salary;
        this.gender = gender;
        Time = time;
        this.job = job;
        this.address = address;
        this.mobilePhone = mobilePhone;
        this.nationality = nationality;
        this.email = email;
    }
    //getters and setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String jop) {
        this.job = job;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override

    public String toString() {
        return "person: "+"\n"+"----------------------"+"\n" +"name: "+ name +"\n"+"\n"+ "age: "+  age +"\n" + "ID: " + ID + "\n" + "\n" +  "salary: " + salary + "\n" + "\n" + "gender: " + gender +"\n" + "\n" + "Time: " + Time +"\n" + "\n" +"job: " + job + "\n" + "\n" + "address: " + address +"\n" + "\n" +"mobilePhone: " + mobilePhone + "\n" + "\n" +"nationality: " + nationality+"\n"+"\n";
    }



}
/*  public String getEmail()
    public void setEmail()
    public String getName()
    public void setName()
    public int getAge()
    public void setAge()
    public int getID()
    public void setID()
    public int getSalary()
    public void setSalary()
    public String getGender()
    public void setGender()
    public String getTime()
    public void setTime()
    public String getJob()
    public void setJob(String jop)
    public String getAddress()
    public void setAddress()
    public String getMobilePhone()
    public void setMobilePhone()
    public String getNationality()
    public void setNationality()
    }
 */