package com.project;

import java.util.ArrayList;

public class Trip{
    private int code;
    private String name;
    private String way;
    private String time;
    private String hotel;
    private int maxpassenger;
    private int cost;
    private ArrayList <Passenger> p;
    public Trip(int code, String name, String way, String time, String hotel, int maxpassenger, int cost) {
        this.code = code;
        this.name = name;
        this.way = way;
        this.time = time;
        this.hotel = hotel;
        this.maxpassenger = maxpassenger;
        this.cost = cost;
        p = new ArrayList<>();
    }

    public ArrayList<Passenger> getP() {
        return p;
    }

    public void setP(ArrayList<Passenger> p) {
        this.p = p;
    }



    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public int getMaxpassenger() {
        return maxpassenger;
    }

    public void setMaxpassenger(int maxpassenger) {
        this.maxpassenger = maxpassenger;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean addPassenger(Passenger a)
    {
        if(p.size()==maxpassenger)
        {
            return false;
        }
        else
        {
            p.add(a);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Trip " + "\n" +"----------------------"+"\n"+"code: " + code +"\n"+ "\n"+ "name: " + name + "\n"+ "\n" +"way: " + way +"\n"+ "\n"+"time: " + time +"\n"+ "\n"+ "hotel: " + hotel +"\n"+ "\n"+"maxpassenger: " + maxpassenger +"\n"+ "\n"+ "cost: " + cost +"\n"+"\n";
    }
}

/*  public ArrayList<Passenger> getP()
    public void setP(ArrayList<Passenger> p)
    public String getTime()
    public void setTime()
    public int getCode()
    public void setCode()
    public String getName()
    public void setName()
    public String getWay()
    public void setWay()
    public String getHotel()
    public void setHotel()
    public int getMaxpassenger()
    public void setMaxpassenger()
    public int getCost()
    public void setCost()
    public boolean addPassenger()

    */