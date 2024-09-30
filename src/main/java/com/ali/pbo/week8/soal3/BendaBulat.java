package com.ali.pbo.week8.soal3;

import com.ali.pbo.Helper;

public class BendaBulat
{
    protected int radius;
    protected String warna;

    public BendaBulat(int radius, String warna)
    {
        this.radius = radius;
        this.warna = warna;
    }

    public int getRadius()
    {
        return this.radius;
    }

    public String getWarna()
    {
        return this.warna;
    }

    public void display()
    {
        Helper.println("Radius         : " + this.radius);
        Helper.println("Warna          : " + this.warna);
    }
}
