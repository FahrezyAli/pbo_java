package com.ali.pbo.week7;

import com.ali.pbo.Helper;
import com.ali.pbo.week7.perbankan.PengambilanUang;

public class TesTugas
{
    public static void main(String[] args)
    {
        PengambilanUang tabungan = new PengambilanUang (5000, 1000);
        Helper.println("Uang yang ditabung : 5000");
        Helper.println("Uang yang diproteksi : 1000");
        Helper.printBorder(30);
        Helper.println("Uang yang akan diambil : 4500 " + tabungan.ambilUang(4500));
        Helper.println("Saldo sekarang : " + tabungan.getSaldo());
        Helper.printBorder(30);
        Helper.println("Uang yang akan diambil: 2500 " + tabungan.ambilUang (2500));
        Helper.println("Saldo sekarang : " + tabungan.getSaldo());  
    }
}
