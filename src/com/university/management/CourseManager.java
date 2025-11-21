package com.university.management;

import java.util.ArrayList;
import java.util.List;

public class CourseManager 
{
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course c) 
    {
        courses.add(c);
        FileManager.save(c.toString());
    }

    public void listCourses() 
    {
        for (Course c : courses)
            System.out.println(c);
    }
}
