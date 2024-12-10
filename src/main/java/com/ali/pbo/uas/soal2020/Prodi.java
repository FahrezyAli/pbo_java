package com.ali.pbo.uas.soal2020;

public class Prodi extends Universitas
{
    private int id;
    private String nama;

    public Prodi(int id, String nama, String nama_univ)
    {
        super(nama_univ);
        this.id = id;
        this.nama = nama;
    }

    public void setIdProdi(int id)
    {
        this.id = id;
    }

    public int getIdProdi()
    {
        return id;
    }

    public void setNamaProdi(String nama)
    {
        this.nama = nama;
    }

    public String getNamaProdi()
    {
        return nama;
    }

}
