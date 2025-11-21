package com.university.management;

import java.io.*;

public class FileManager 
{
    public static void save(String data) 
    {
        try (FileWriter fw = new FileWriter("courses.txt", true)) 
        {
            fw.write(data + "\n");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
