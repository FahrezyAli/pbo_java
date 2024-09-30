package com.ali.pbo.week10.soal1;

import com.ali.pbo.Helper;

public class C implements A
{
    public int c;

    public C(int c)
    {
        this.c = c;
    }

    public void tampilBC()
    {
        B objB = new B(this.c);
        Helper.println("B : " + objB.b);
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