package com.ali.pbo.week8.soal3;

import com.ali.pbo.Helper;

public class Tabung extends BendaBulat
{
    private int tinggi;

    public Tabung(int radius, int tinggi, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public int getTinggi()
    {
        return this.tinggi;
    }

    public double luasPermukaanTabung()
    {
        return 2 * Math.PI * this.radius * (this.radius + this.tinggi);
    }

    @Override
    public void display()
    {
        super.display();
        Helper.println("Tinggi         : " + this.tinggi);
        Helper.println("Luas Permukaan : " + this.luasPermukaanTabung());
    }
}
