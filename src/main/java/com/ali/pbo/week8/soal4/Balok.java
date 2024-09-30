package com.ali.pbo.week8.soal4;

import com.ali.pbo.Helper;

public class Balok extends BendaPersegi
{
    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi, String warna)
    {
        super(panjang, lebar, warna);
        this.tinggi = tinggi;
    }

    public Balok(int panjang, int lebar, int tinggi)
    {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public int getTinggi()
    {
        return this.tinggi;
    }

    public int volumeBalok()
    {
        return this.panjang * this.lebar * this.tinggi;
    }

    @Override
    public void display()
    {
        super.display();
        Helper.println("Tinggi  : " + this.tinggi);
        Helper.println("Volume  : " + this.volumeBalok());
    }
}
