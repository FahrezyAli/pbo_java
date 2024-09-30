package com.ali.pbo.week5;

public class Mahasiswa
{
    private int nrp;
    private String nama;

    public Mahasiswa()
    {
        this.nrp = 0;
        this.nama = "";
    }

    public Mahasiswa(String nama)
    {
        this.nrp = 0;
        this.nama = nama;
    }

    public Mahasiswa(int nrp, String nama)
    {
        this.nrp = nrp;
        this.nama = nama;
    }

    public int getNrp()
    {
        return this.nrp;
    }

    public String getNama()
    {
        return this.nama;
    }

    public void setNrp(int nrp)
    {
        this.nrp = nrp;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }
}

