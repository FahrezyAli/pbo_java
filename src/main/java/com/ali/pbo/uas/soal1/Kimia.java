package com.ali.pbo.uas.soal1;

import com.ali.pbo.Helper;

public class Kimia extends FMIPA
{
    private String nama_prodi;
    private String jenjang;

    public Kimia(String nama, int nim, String nama_prodi, String jenjang)
    {
        super(nama, nim);
        this.nama_prodi = nama_prodi;
        this.jenjang = jenjang;
    }

    @Override
    public void display()
    {
        Helper.println("Nama: " + this.nama);
        Helper.println("NIM: " + this.nim);
        Helper.println("Nama Prodi: " + this.nama_prodi);
        Helper.println("Jenjang:" + this.jenjang);
    }
}
