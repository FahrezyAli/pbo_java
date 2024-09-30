package com.ali.pbo.week9.latihan1;

import com.ali.pbo.Helper;

public abstract class Robot
{
    protected String nama;
    protected String pemilik;
    protected int tahun;

    protected Robot(String nama, String pemilik, int tahun)
    {
        this.nama = nama;
        this.pemilik = pemilik;
        this.tahun = tahun;
    }

    public void setTahunPembuatan(int tahun)
    {
        this.tahun = tahun;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public void displayData()
    {
        Helper.println("Nama Robot:      " + this.nama);
        Helper.println("Pemilik Robot:   " + this.pemilik);
        Helper.println("Tahun Pembuatan: " + this.tahun);
    }
}
