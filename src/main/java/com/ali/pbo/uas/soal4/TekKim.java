package com.ali.pbo.uas.soal4;

import com.ali.pbo.Helper;

public class TekKim extends Prodi
{
    private String nama;
    private String nim;

    protected TekKim(String nama, String nim, String nama_prod, String nama_dep) {
        super(nama_prod, nama_dep);
    }

    @Override
    public void display() {
        Helper.println("Nama: " + this.nama);
        Helper.println("NIM: " + this.nim);
        Helper.println("Prodi: " + this.nama_prod);
        Helper.println("Departemen: " + this.nama_dep); 
    }
}
