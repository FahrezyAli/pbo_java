package com.ali.pbo.week11.animals.reptilia;

import com.ali.pbo.Helper;
import com.ali.pbo.week11.animals.mamalia.Kucing;

public class Ular
{
    private String name;
    private int age;

    public Ular(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void desis()
    {
        Helper.println("SStttttsss!!");
    }

    public static void main(String[] args)
    {
        final Ular sneki = new Ular("Sneki", 3);
        sneki.desis();

        final Kucing emboy = new Kucing("Emboy", 2);
        emboy.meow();
    }
}
