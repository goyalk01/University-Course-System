package com.university.management;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("-----------------------------------------");
        System.out.println(" University Course Management System (UCMS) ");
        System.out.println("-----------------------------------------");

        CourseManager manager = new CourseManager();

        manager.addCourse(new Course("CSE2006", "PROGRAMMING-IN-JAVA", 5000.0));
        manager.addCourse(new Course("CSE2002", "DATA-STRUCTURES-AND-ALGORITHMS", 4500.0));
        manager.addCourse(new Course("CSE3001", "DATABASE-MANAGEMENT-SYSTEMS", 4000.0));
        manager.addCourse(new Course("CSE2001", "OBJECT-ORIENTED-PROGRAMMING-WITH-C++", 3500.0));
        manager.addCourse(new Course("CSE1021", "INTRODUCTION-TO-PROBLEM-SOLVING-AND-PROGRAMMING", 2500.0));
        manager.addCourse(new Course("CSA2001", "FUNDAMENTALS-IN-AI-AND-ML", 6000.0));
        manager.addCourse(new Course("CSE4001", "INTERNET-AND-WEB-PROGRAMMING", 5000.0));

        manager.listCourses();

        System.out.println("\n--- Student Enrollment Module ---\n");

        Student s1 = new Student("24BCE11020", "Krish Goyal");
        System.out.println("Student Detected: " + s1.getName());
        System.out.println("Action: Registering for [CSE2006]...");
        System.out.println("\nSuccess: Enrollment Confirmed. Fee Pending: 5000.0 rs");

        System.out.println("\nSystem Data Saved. Shutting down.");

    }
}
