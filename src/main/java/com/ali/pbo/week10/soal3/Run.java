package com.ali.pbo.week10.soal3;

import com.ali.pbo.Helper;

public class Run
{
    public static void main(String[] args)
    {
        final D objD = new D(15);
        objD.tampilD();
        Helper.println("Hasil Kali : " + objD.hitungKali(5, 2));
        Helper.println("Hasil Jumlah : " + objD.hitungJumlah(15, 10));
        Helper.println("Hasil Kurang : " + objD.hitungKurang(10, 7));
    }
}
