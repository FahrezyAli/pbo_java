package com.ali.pbo.week2.soal2;

import com.ali.pbo.Helper;

public class Pecahan
{
    private int pembilang;
    private int penyebut;

    Pecahan(int pembilang, int penyebut)
    {
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    public int getPembilang()
    {
        return this.pembilang;
    }

    public int getPenyebut()
    {
        return this.penyebut;
    }

    @Override
    public String toString()
    {
        return this.pembilang + "/" + this.penyebut;
    }

    public Pecahan tambah(Pecahan object)
    {
        return new Pecahan((this.pembilang * object.penyebut) + (object.pembilang * this.penyebut), this.penyebut * object.penyebut);
    }

    public Pecahan kurang(Pecahan object)
    {
        return new Pecahan((this.pembilang * object.penyebut) - (object.pembilang * this.penyebut), this.penyebut * object.penyebut);
    }

    public Pecahan kali(Pecahan object)
    {
        return new Pecahan(this.pembilang * object.pembilang, this.penyebut * object.penyebut);
    }

    public Pecahan bagi(Pecahan object)
    {
        return new Pecahan(this.pembilang * object.penyebut, this.penyebut * object.pembilang);
    }

    public Pecahan sederhanakan()
    {
        int fpb = Helper.fpb(this.pembilang, this.penyebut);
        return new Pecahan(this.pembilang / fpb, this.penyebut / fpb);
    }
}
