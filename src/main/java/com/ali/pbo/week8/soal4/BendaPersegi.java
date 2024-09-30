package com.ali.pbo.week8.soal4;

import com.ali.pbo.Helper;

public class BendaPersegi
{
    protected int panjang;
    protected int lebar;
    protected String warna;

    public BendaPersegi(int panjang, int lebar, String warna)
    {
        this.panjang = panjang;
        this.lebar = lebar;
        this.warna = warna;
    }

    public BendaPersegi(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
        this.warna = "putih";
    }

    public int getPanjang()
    {
        return this.panjang;
    }

    public int getLebar()
    {
        return this.lebar;
    }

    public String getWarna()
    {
        return this.warna;
    }

    public void display()
    {
        Helper.println("Panjang : " + this.panjang);
        Helper.println("Lebar   : " + this.lebar);
        Helper.println("Warna   : " + this.warna);
    }
}
