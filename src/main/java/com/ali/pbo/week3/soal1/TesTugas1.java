package com.ali.pbo.week3.soal1;

import com.ali.pbo.Helper;

public class TesTugas1
{
    public static void main(String[] args)
    {
        boolean status;
        Tabungan tabungan = new Tabungan(5000);
        Helper.println("Saldo awal : " + tabungan.getSaldo());
        tabungan.simpanUang(3000);
        Helper.println("Jumlah uang yang disimpan : 3000");
        status = tabungan.ambilUang(6000);
        Helper.print("Jumlah uang yang diambil : 6000");
        
        if (status) {
            Helper.println(" ok");
        } else {
            Helper.println(" gagal");
        }
        
        tabungan.simpanUang(3500);
        Helper.println("Jumlah uang yang disimpan : 3500");
        status = tabungan.ambilUang(4000);
        Helper.print("Jumlah uang yang diambil : 4000");
        
        if (status) {
            Helper.println(" ok");
        } else {
            Helper.println(" gagal");
        }
        
        status = tabungan.ambilUang(1600);
        Helper.print("Jumlah uang yang diambil : 1600");
        
        if (status) {
            Helper.println(" ok");
        } else {
            Helper.println(" gagal");
        }
        
        tabungan.simpanUang(2000);
        Helper.println("Jumlah uang yang disimpan : 2000");
        Helper.println("Saldo sekarang : " + tabungan.getSaldo());
    }
}
