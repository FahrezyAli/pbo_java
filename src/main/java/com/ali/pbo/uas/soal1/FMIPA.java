package com.ali.pbo.uas.soal1;

import com.ali.pbo.Helper;

public abstract class FMIPA
{
    protected String nama;
    protected int nim;

    protected FMIPA(String nama, int nim)
    {
        this.nama = nama;
        this.nim = nim;
    }

    public abstract void display();
}
