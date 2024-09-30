package com.ali.pbo.week11.animals.mamalia;

import com.ali.pbo.Helper;

public class Kucing
{
    private String name;
    private int age;

    public Kucing(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void meow()
    {
        Helper.println("Meooooow!!");
    }

    public static void main(String[] args)
    {
        final Kucing keti = new Kucing("Keti", 1);
        keti.meow();
    }
}
