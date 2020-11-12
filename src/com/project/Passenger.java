package com.project;

public class Passenger {
    private String name;
    private int age;
    private String nationality;
    private String nationnalID;
    private String address;
    private String mobilePhone;
    private String email;

    public Passenger(String name, int age, String nationality, String nationnalID, String address, String mobilePhone, String email) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.nationnalID = nationnalID;
        this.address = address;
        this.mobilePhone = mobilePhone;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationnalID() {
        return nationnalID;
    }

    public void setNationnalID(String nationnalID) {
        this.nationnalID = nationnalID;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Passenger : "+"\n"+"----------------------"+ "\n" + "name: " + name + "\n" + "\n" + "age: "+  age +"\n" + "\n" + "nationality: " + nationality + "\n" + "\n" +  "nationnalID: " + nationnalID +"\n"+"\n"+ "address: " + address +"\n"+"\n" + "mobilePhone: " + mobilePhone +"\n"+"\n"+"email: " + email+"\n"+"\n" ;
    }

}

/*    public String getName()
    public void setName()
    public int getAge()
    public void setAge()
    public String getNationality()
    public void setNationality()
    public String getNationnalID()
    public void setNationnalID()
    public String getAddress()
    public void setAddress()
    public String getMobilePhone()
    public void setMobilePhone()
    public String getEmail()
    public void setEmail()
        */