package com.ali.pbo.week9.latihan1;

import com.ali.pbo.Helper;

public class DoraMini extends Robot
{

    public DoraMini(String nama, String pemilik, int tahun)
    {
        super(nama, pemilik, tahun);
    }

    public void sayDora()
    {
        Helper.println("Halo, Saya Dora Mini");
    }
}
