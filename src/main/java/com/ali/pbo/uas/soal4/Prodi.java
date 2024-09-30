package com.ali.pbo.uas.soal4;

public abstract class Prodi extends Departemen
{
    protected String nama_prod;

    protected Prodi(String nama_prod, String nama_dep) {
        super(nama_dep);
        this.nama_prod = nama_prod;
    }
}
