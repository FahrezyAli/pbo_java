package com.ali.pbo.uas.soal4;

import com.ali.pbo.Helper;

public abstract class Departemen
{
    protected String nama_dep;

    protected Departemen(String nama_dep)
    {
        this.nama_dep = nama_dep;
    }

    public abstract void display();
}
