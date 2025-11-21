package com.university.management;

public class Course 
{
    private String id;
    private String name;
    private double fee;

    public Course(String id, String name, double fee) 
    {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    public String toString() 
    {
        return id + ": " + name + " ( " + fee + " rs)";
    }
}
