package com.ali.pbo.week13.teori.soal4;

import com.ali.pbo.Helper;

public class OpMat
{

    private double a;

    public OpMat(double a)
    {
        this.a = a;
    }

    public double sqrt()
    {
        if (a < 0.0)
        {
            throw new ArithmeticException("Negative number");
        } else return Math.sqrt(a);
    }

    public static void main(String[] args)
    {
        OpMat opMat = new OpMat(-1.0);
        try
        {
            opMat.sqrt();
        } catch (ArithmeticException e)
        {
            Helper.printError(e);
        }
    }
}
