package com.ali.pbo.week13.teori.soal1;

import com.ali.pbo.Helper;

public class Time
{
    private int h;
    private int m;
    private int s;

    public Time(int h, int m, int s)
    {
        this.setTime(h, m, s);
    }

    private void setTime(int h, int m, int s)
    {
        if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60))
        {
            this.h = h;
            this.m = m;
            this.s = s;
        }
        else 
        {
            throw new IllegalArgumentException("Invalid time");
        }
    }

    public static void main(String[] args)
    {
        try
        {
            Time time = new Time(27, 74, 99);
        } catch (Exception e) 
        {
            Helper.printError(e);
        }
    }
}
