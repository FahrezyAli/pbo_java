package com.ali.pbo.week3.soal2;

import com.ali.pbo.Helper;

public class TesTugas2
{
    public static void main(String[] args)
    {
        Truk truk = new Truk(900.0); 
        Helper.println("Muatan maksimal : " + truk.getMuatanMaks());
        boolean status = truk.tambahMuatan(500.0);
        Helper.println("Tambah muatan : 500");
        
        if (status) {
            Helper.println("ok");
        } else {
            Helper.println("gagal");
        }
        
        status = truk.tambahMuatan(300.0);
        Helper.println("Tambah muatan : 300");

        if (status) {
            Helper.println("ok");
        } else {
            Helper.println("gagal");
        }

        status = truk.tambahMuatan(150.0);
        Helper.println("Tambah muatan : 150");

        if(status){
            Helper.println("ok");
        } else {
            Helper.println("gagal");
        }
        
        status = truk.tambahMuatan(50.0);
        Helper.println("Tambah muatan : 50");

        if(status){
            Helper.println("ok");
        } else {
            Helper.println("gagal");
        }
        
        Helper.println("muatan sekarang : " + truk.getMuatan());
    }
}
