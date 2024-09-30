package com.ali.pbo.week10.soal2;

import com.ali.pbo.Helper;

public class C extends B implements A
{
    public int c;

    public C(int c)
    {
        super(c);
        this.c = c;
    }

    public void tampilBC()
    {
        Helper.println("B : " + this.b);
        Helper.println("C : " + this.c);
    }

    public void tampilConstNilaiB()
    {
        Helper.println("Constant B : " + B.NILAI_B);
    }

    @Override
    public int hitungKali(int a, int b)
    {
        return a * b;
    }
}