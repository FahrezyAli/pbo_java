package com.ali.pbo.week10.soal3;

import com.ali.pbo.Helper;

public class D implements C
{

    public int d;

    public D(int d){
        this.d = d;
    }

    public void tampilD()
    {
        Helper.println("Nilai D" + this.d);
    }

    @Override
    public int hitungKali(int a, int b) {
        return a * b;
    }

    @Override
    public int hitungKurang(int a, int b) {
        return a - b;
    }

    @Override
    public int hitungJumlah(int a, int b) {
        return a + b;
    }    
}
