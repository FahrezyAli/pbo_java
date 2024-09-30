package com.ali.pbo.week13.teori.soal2;

import com.ali.pbo.Helper;

public class OperasiMatematika
{
    private int a;
    private int b;

    public OperasiMatematika(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int jumlah()
    {
        return this.a + this.b;
    }

    public int bagi()
    {
        if (b == 0)
        {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        else return this.a / this.b;
    }

    public static void main(String[] args)
    {
        OperasiMatematika operasiMatematika = new OperasiMatematika(10, 0);
        Helper.println(operasiMatematika.jumlah());
        try
        {
            Helper.println(operasiMatematika.bagi());
        } catch (Exception e)
        {
            Helper.printError(e);
        }
    }
}
