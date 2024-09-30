package com.ali.pbo.week10.soal1;

import com.ali.pbo.Helper;

public class Run
{
    public static void main(String[] args)
    {
        final B objB = new B(12);
        Helper.println("Hasil Kurang : " + objB.hitungKurang(10, 7));

        final C objC = new C(10);
        objC.tampilBC();
        objC.hitungKali(10, 5);
        Helper.println("Hasil Kali : " + objC.hitungKali(10, 5));
    }
}
