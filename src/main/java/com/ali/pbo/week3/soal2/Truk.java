package com.ali.pbo.week3.soal2;

public class Truk
{
    private double muatan;
    private double muatanmaks;

    public Truk(double beratmaks)
    {
        this.muatanmaks = this.kiloToNewts(beratmaks);
    }

    public double getMuatan()
    {
        return this.newtsToKilo(this.muatan);
    }

    public double getMuatanMaks()
    {
        return this.newtsToKilo(this.muatanmaks);
    }

    public boolean tambahMuatan(double berat)
    {
        berat = this.kiloToNewts(berat);
        if (this.muatan + berat <= this.muatanmaks)
        {
            this.muatan += berat;
            return true;
        } else return false;
    }

    public double newtsToKilo(double berat)
    {
        return berat / 9.8;
    }

    public double kiloToNewts(double berat)
    {
        return berat * 9.8;
    }
}
