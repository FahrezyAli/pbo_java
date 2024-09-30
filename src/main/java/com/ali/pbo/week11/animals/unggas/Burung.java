package com.ali.pbo.week11.animals.unggas;

import com.ali.pbo.Helper;

public class Burung
{
    private String name;
    private int age;

    public Burung(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void decit()
    {
        Helper.println("Cit cit cit cit!!");
    }

    public static void main(String[] args)
    {
        final Burung bajo = new Burung("Bajo", 2);
        bajo.decit();
    }
}
