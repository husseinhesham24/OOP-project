package com.project;

import javax.swing.JOptionPane;
import java.util.*;

class Main {
    public static void main(String[] args) {
        String nameofcompany = JOptionPane.showInputDialog(null,"please enter the name of company");
        JOptionPane.showMessageDialog(null, "Welcome to "+nameofcompany);
        String ownername = JOptionPane.showInputDialog(null,"please enter onwer name");


        String address = JOptionPane.showInputDialog(null,"please enter "+nameofcompany+"'s "+ "address");
        String mobile = JOptionPane.showInputDialog(null,"please enter "+nameofcompany+"'s "+"mobilephone");
        String email = JOptionPane.showInputDialog(null,"please enter "+nameofcompany+"'s "+" email");
        Company c = new  Company(address, mobile, email);

        ArrayList <Person> e = new ArrayList<>();
        int numofemployees = Integer.parseInt(JOptionPane.showInputDialog(null,"please enter the number of employees"));
        for(int i=0; i<numofemployees;i++)
        {
            String name2 = JOptionPane.showInputDialog(null,"please enter employee's name number "+(i+1));
            String nationality = JOptionPane.showInputDialog(null,"please enter emoployee's nationality number "+(i+1));
            String gander = JOptionPane.showInputDialog(null,"please enter employee's gander number "+(i+1));
            int age = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter emoployee's age number "+(i+1)));
            String address2 = JOptionPane.showInputDialog(null,"please enter employee's address number "+(i+1));
            String mobilephone = JOptionPane.showInputDialog(null,"please enter emoployee's mobilephone number "+(i+1));
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter emoployee's id number "+(i+1)));
            String email2 = JOptionPane.showInputDialog(null,"please enter employee's email number "+(i+1));
            String job = JOptionPane.showInputDialog(null,"please enter employee's job number "+(i+1));
            String time = JOptionPane.showInputDialog(null,"please enter employee's time number "+(i+1));
            int salary = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter emoployee's salary number "+(i+1)));
            Person a = new Employee(name2, nationality, gander, age, address2, mobilephone, id, email2, job, time, salary);
            e.add(a);
        }


        ArrayList <Person> s = new ArrayList<>();
        int numofstudents= Integer.parseInt(JOptionPane.showInputDialog(null,"please enter the number of students"));
        for(int i=0; i<numofstudents;i++)
        {
            String name2 = JOptionPane.showInputDialog(null,"please enter student's name number "+(i+1));
            String nationality = JOptionPane.showInputDialog(null,"please enter student's nationality number "+(i+1));
            String gander = JOptionPane.showInputDialog(null,"please enter student's gander number "+(i+1));
            int age = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter student's age number "+(i+1)));
            String address2 = JOptionPane.showInputDialog(null,"please enter student's address number "+(i+1));
            String mobilephone = JOptionPane.showInputDialog(null,"please enter student's mobilephone number "+(i+1));
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter student's id number "+(i+1)));
            String email2 = JOptionPane.showInputDialog(null,"please enter student's email number "+(i+1));
            String job = JOptionPane.showInputDialog(null,"please enter student's job number "+(i+1));
            String time = JOptionPane.showInputDialog(null,"please enter student's time number "+(i+1));
            int salary = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter student's salary number "+(i+1)));
            Person a = new Student(name2, nationality, gander, age, address2, mobilephone, id, email2, job, time, salary);
            s.add(a);

        }

        ArrayList <Trip> t = new ArrayList<>();
        int numoftrips= Integer.parseInt(JOptionPane.showInputDialog(null,"please enter the number of trips"));
        for(int i=0; i<numoftrips;i++)
        {
            String name2 = JOptionPane.showInputDialog(null,"please enter trip's name number "+(i+1));
            int code = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter trip's code number "+(i+1)));
            String way = JOptionPane.showInputDialog(null,"please enter trip's way number "+(i+1));
            String time = JOptionPane.showInputDialog(null,"please enter trip's time number "+(i+1));
            String hotel = JOptionPane.showInputDialog(null,"please enter trip's hotel number "+(i+1));
            int maxpassenger = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter trip's maxpassenger number "+(i+1)));
            int cost = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter trip's cost number "+(i+1)));

            Trip p = new Trip(code, name2, way, time, hotel, maxpassenger, cost);
            t.add(p);
        }


        while(true)
        {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Hello "+ownername+"\n"+"my name is topy ^-^"+"\n"+"can i help you?? "+"\n"+"---------------------------"+"\n"+"1- Add employee"+"\n"+"2- Remove employee"+"\n"+"3- Edit employee"+"\n"+"4- Add student"+"\n"+"5- Remove student"+"\n"+"6- Edit student"+"\n"+"7- Add trip"+"\n"+"8- remove trip"+"\n"+"9- edit trip's time"+"\n"+"10- Add passenger"+"\n"+"11- remove passenger"+"\n"));
            if(n==0)
                break;
            else if(n==1)
            {
                int numofaddemp = Integer.parseInt(JOptionPane.showInputDialog(null,"please enter the number of employee which you will add"));
                for(int i=0; i<numofaddemp;i++)
                {
                    String name2 = JOptionPane.showInputDialog(null,"please enter employee's name number "+(i+1));
                    String nationality = JOptionPane.showInputDialog(null,"please enter emoployee's nationality number "+(i+1));
                    String gander = JOptionPane.showInputDialog(null,"please enter employee's gander number "+(i+1));
                    int age = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter emoployee's age number "+(i+1)));
                    String address2 = JOptionPane.showInputDialog(null,"please enter employee's address number "+(i+1));
                    String mobilephone = JOptionPane.showInputDialog(null,"please enter emoployee's mobilephone number "+(i+1));
                    int id = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter emoployee's id number "+(i+1)));
                    String email2 = JOptionPane.showInputDialog(null,"please enter employee's email number "+(i+1));
                    String job = JOptionPane.showInputDialog(null,"please enter employee's job number "+(i+1));
                    String time = JOptionPane.showInputDialog(null,"please enter employee's time number "+(i+1));
                    int salary = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter emoployee's salary number "+(i+1)));
                    Person a = new Employee(name2, nationality, gander, age, address2, mobilephone, id, email2, job, time, salary);
                    e.add(a);
                }

                JOptionPane.showMessageDialog(null, e+"\n"+"^-^"+"\n"+"Done");
            }

            else if(n==2)
            {
                int fire = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the id of the person you want to remove"));
                boolean flag = false;
                int index = 0;
                for(int i=0;i<e.size();i++)
                {
                    if(e.get(i).getID()==fire)
                    {
                        flag = true;
                        index = i;
                        break;
                    }
                }
                if(flag)
                {
                    e.remove(e.get(index));
                    JOptionPane.showMessageDialog(null, e+"\n"+"^-^"+"\n"+"Done");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                }
            }
            else if(n==3)
            {
                int fire = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the id of the person you want to edit"));
                boolean flag = false;
                int index = 0;
                for(int i=0;i<e.size();i++)
                {
                    if(e.get(i).getID()==fire)
                    {
                        flag = true;
                        index = i;
                        break;
                    }
                }


                while(true)
                {
                    int a = Integer.parseInt(JOptionPane.showInputDialog(null, "1- salary"+"\n"+"2- time"+"\n"+"3- job"+"\n"+"4- address"+"\n"+"5- mobile phone"+"\n"+"6- email"));
                    if(a==0)
                        break;
                    else if(a==1)
                    {

                        int newi = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the new salary"));

                        if(flag)
                        {
                            e.get(index).setSalary(newi);
                            JOptionPane.showMessageDialog(null, e+"\n"+"^-^"+"\n"+"Done");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                        }
                    }

                    else if(a==2)
                    {

                        String newi = JOptionPane.showInputDialog(null, "please enter the new time");

                        if(flag)
                        {
                            e.get(index).setTime(newi);
                            JOptionPane.showMessageDialog(null, e+"\n"+"^-^"+"\n"+"Done");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                        }
                    }

                    else if(a==3)
                    {


                        String newi = JOptionPane.showInputDialog(null, "please enter the new job");

                        if(flag)
                        {
                            e.get(index).setTime(newi);
                            JOptionPane.showMessageDialog(null, e+"\n"+"^-^"+"\n"+"Done");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                        }
                    }

                    else if(a==4)
                    {

                        String newi = JOptionPane.showInputDialog(null, "please enter the new address");

                        if(flag)
                        {
                            e.get(index).setTime(newi);
                            JOptionPane.showMessageDialog(null, e+"\n"+"^-^"+"\n"+"Done");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                        }
                    }

                    else if(a==5)
                    {


                        String newi = JOptionPane.showInputDialog(null, "please enter the new mobile phone");

                        if(flag)
                        {
                            e.get(index).setTime(newi);
                            JOptionPane.showMessageDialog(null, e+"\n"+"^-^"+"\n"+"Done");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                        }
                    }

                    else if(a==6)
                    {

                        String newi = JOptionPane.showInputDialog(null, "please enter the new email");

                        if(flag)
                        {
                            e.get(index).setTime(newi);
                            JOptionPane.showMessageDialog(null, e+"\n"+"^-^"+"\n"+"Done");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                        }
                    }
                }
            }

            else if(n==4)
            {
                int numofaddemp = Integer.parseInt(JOptionPane.showInputDialog(null,"please enter the number of student which you will add"));
                for(int i=0; i<numofaddemp;i++)
                {
                    String name2 = JOptionPane.showInputDialog(null,"please enter student's name number "+(i+1));
                    String nationality = JOptionPane.showInputDialog(null,"please enter student's nationality number "+(i+1));
                    String gander = JOptionPane.showInputDialog(null,"please enter student's gander number "+(i+1));
                    int age = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter student's age number "+(i+1)));
                    String address2 = JOptionPane.showInputDialog(null,"please enter student's address number "+(i+1));
                    String mobilephone = JOptionPane.showInputDialog(null,"please enter student's mobilephone number "+(i+1));
                    int id = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter student's id number "+(i+1)));
                    String email2 = JOptionPane.showInputDialog(null,"please enter student's email number "+(i+1));
                    String job = JOptionPane.showInputDialog(null,"please enter student's job number "+(i+1));
                    String time = JOptionPane.showInputDialog(null,"please enter student's time number "+(i+1));
                    int salary = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter student's salary number "+(i+1)));
                    Person a = new Student(name2, nationality, gander, age, address2, mobilephone, id, email2, job, time, salary);
                    s.add(a);
                }

                JOptionPane.showMessageDialog(null, s+"\n"+"^-^"+"\n"+"Done");
            }

            else if(n==5)
            {
                int fire = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the id of the person you want to remove"));
                boolean flag = false;
                int index = 0;
                for(int i=0;i<s.size();i++)
                {
                    if(s.get(i).getID()==fire)
                    {
                        flag = true;
                        index = i;
                        break;
                    }
                }
                if(flag)
                {
                    s.remove(s.get(index));
                    JOptionPane.showMessageDialog(null, s+"\n"+"^-^"+"\n"+"Done");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                }
            }

            else if(n==6)
            {
                int fire = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the id of the person you want to edit"));
                boolean flag = false;
                int index = 0;
                for(int i=0;i<s.size();i++)
                {
                    if(s.get(i).getID()==fire)
                    {
                        flag = true;
                        index = i;
                        break;
                    }
                }


                while(true)
                {
                    int a = Integer.parseInt(JOptionPane.showInputDialog(null, "1- salary"+"\n"+"2- time"+"\n"+"3- job"+"\n"+"4- address"+"\n"+"5- mobile phone"+"\n"+"6- email"));
                    if(a==0)
                        break;
                    else if(a==1)
                    {

                        int newi = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the new salary"));

                        if(flag)
                        {
                            s.get(index).setSalary(newi);
                            JOptionPane.showMessageDialog(null, s+"\n"+"^-^"+"\n"+"Done");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                        }
                    }

                    else if(a==2)
                    {

                        String newi = JOptionPane.showInputDialog(null, "please enter the new time");

                        if(flag)
                        {
                            s.get(index).setTime(newi);
                            JOptionPane.showMessageDialog(null, s+"\n"+"^-^"+"\n"+"Done");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                        }
                    }

                    else if(a==3)
                    {


                        String newi = JOptionPane.showInputDialog(null, "please enter the new job");

                        if(flag)
                        {
                            s.get(index).setTime(newi);
                            JOptionPane.showMessageDialog(null, s+"\n"+"^-^"+"\n"+"Done");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                        }
                    }

                    else if(a==4)
                    {

                        String newi = JOptionPane.showInputDialog(null, "please enter the new address");

                        if(flag)
                        {
                            s.get(index).setTime(newi);
                            JOptionPane.showMessageDialog(null, s+"\n"+"^-^"+"\n"+"Done");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                        }
                    }

                    else if(a==5)
                    {


                        String newi = JOptionPane.showInputDialog(null, "please enter the new mobile phone");

                        if(flag)
                        {
                            s.get(index).setTime(newi);
                            JOptionPane.showMessageDialog(null, s+"\n"+"^-^"+"\n"+"Done");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                        }
                    }

                    else if(a==6)
                    {

                        String newi = JOptionPane.showInputDialog(null, "please enter the new email");

                        if(flag)
                        {
                            s.get(index).setTime(newi);
                            JOptionPane.showMessageDialog(null, s+"\n"+"^-^"+"\n"+"Done");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                        }
                    }
                }
            }

            else if(n==7)
            {
                int numofaddemp = Integer.parseInt(JOptionPane.showInputDialog(null,"please enter the num of trips which you will add"));
                for(int i=0; i<numofaddemp;i++)
                {
                    String name2 = JOptionPane.showInputDialog(null,"please enter trip's name number "+(i+1));
                    int code = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter trip's code number "+(i+1)));
                    String way = JOptionPane.showInputDialog(null,"please enter trip's way number "+(i+1));
                    String time = JOptionPane.showInputDialog(null,"please enter trip's time number "+(i+1));
                    String hotel = JOptionPane.showInputDialog(null,"please enter trip's hotel number "+(i+1));
                    int maxpassenger = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter trip's maxpassenger number "+(i+1)));
                    int cost = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter trip's cost number "+(i+1)));

                    Trip p = new Trip(code, name2, way, time, hotel, maxpassenger, cost);
                    t.add(p);
                }

                JOptionPane.showMessageDialog(null, t+"\n"+"^-^"+"\n"+"Done");
            }

            else if(n==8)
            {
                int fire = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the code of trip you want to remove"));
                boolean flag = false;
                int index = 0;
                for(int i=0;i<t.size();i++)
                {
                    if(t.get(i).getCode()==fire)
                    {
                        flag = true;
                        index = i;
                        break;
                    }
                }
                if(flag)
                {
                    t.remove(t.get(index));
                    JOptionPane.showMessageDialog(null, t+"\n"+"^-^"+"\n"+"Done");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                }
            }

            else if(n==9)
            {
                int fire = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the code of trip you want to edit"));
                boolean flag = false;
                int index = 0;
                for(int i=0;i<t.size();i++)
                {
                    if(t.get(i).getCode()==fire)
                    {
                        flag = true;
                        index = i;
                        break;
                    }
                }

                String newi = JOptionPane.showInputDialog(null, "please enter the new time");

                if(flag)
                {
                    t.get(index).setTime(newi);
                    JOptionPane.showMessageDialog(null, t+"\n"+"^-^"+"\n"+"Done");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                }
            }

            else if(n==10)
            {
                int fire = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the code of trip which you want to add passenger on"));
                boolean flag = false;
                int index = 0;
                for(int i=0;i<t.size();i++)
                {
                    if(t.get(i).getCode()==fire)
                    {
                        flag = true;
                        index = i;
                        break;
                    }
                }

                int numofPassenger = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the number of passenger which you want to add"));
                for(int i=0; i<numofPassenger;i++)
                {
                    String name2 = JOptionPane.showInputDialog(null,"please enter passenger's name number "+(i+1));
                    String nationality = JOptionPane.showInputDialog(null,"please enter passenger's nationality number "+(i+1));
                    String nationalid = JOptionPane.showInputDialog(null,"please enter passenger's nationalid number "+(i+1));
                    int age = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter student's age number "+(i+1)));
                    String address2 = JOptionPane.showInputDialog(null,"please enter passenger's address number "+(i+1));
                    String mobilephone = JOptionPane.showInputDialog(null,"please enter student's mobilephone number "+(i+1));
                    String email2 = JOptionPane.showInputDialog(null,"please enter student's email number "+(i+1));
                    Passenger p = new Passenger(name2, age, nationality, nationalid, address, mobilephone, email);
                    if(!t.get(index).addPassenger(p))
                    {
                        JOptionPane.showMessageDialog(null, "Trip is full -_-");
                        break;
                    }
                    else
                    {
                        t.get(index).addPassenger(p);
                        JOptionPane.showMessageDialog(null, t.get(index).getP()+"\n"+"^-^"+"\n"+"Done");
                    }
                }
            }

            if(n==11)
            {
                int fire = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the code of trip which you want to add passenger on"));
                boolean flag = false;
                int index = 0;
                for(int i=0;i<t.size();i++)
                {
                    if(t.get(i).getCode()==fire)
                    {
                        flag = true;
                        index = i;
                        break;
                    }
                }

                String nationalid = JOptionPane.showInputDialog(null, "please enter the code of trip which you want to add passenger on");
                boolean sign = false;
                int at = 0;
                for(int i=0;i<t.size();i++)
                {
                    if(t.get(index).getP().get(i).getNationnalID().equalsIgnoreCase(nationalid))
                    {
                        sign = true;
                        at = i;
                        break;
                    }
                }

                if(flag)
                {
                    t.get(index).getP().remove(t.get(index).getP().get(at));
                    JOptionPane.showMessageDialog(null, t.get(index).getP()+"\n"+"^-^"+"\n"+"Done");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Not found"+"\n"+"\n"+" -_-");
                }
            }
        }
    }
}







