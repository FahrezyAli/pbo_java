package com.ali.pbo.week2.teori;

public class BendaBulatDua
{
    private int radius;

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public int getRadius()
    {
        return this.radius;
    }

    public float luasLingkaran()
    {
        return 3.14f * this.radius * this.radius;
    }

    public float volumeBola()
    {
        return (3/4f) * 3.14f * this.radius * this.radius * this.radius;
    }
}
