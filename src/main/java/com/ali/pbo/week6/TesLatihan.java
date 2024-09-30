package com.ali.pbo.week6;

import com.ali.pbo.Helper;

public class TesLatihan
{
    public static void main(String[] args)
    {
        Matriks a = new Matriks(new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}}); // array
        Matriks b = new Matriks(new int[][]{{1, 2, 3},{5, 6, 7}}); // array
        Matriks c = new Matriks(a); // object Matriks
        Matriks d = new Matriks(); // tanpa parameter
        Matriks e = new Matriks(5, 3); // dua parameter column dan row

        Helper.newLine();
        a.tampilMatriks();

        Helper.newLine();
        b.tampilMatriks();

        Helper.newLine();
        c.tampilMatriks();

        Helper.newLine();
        Matriks.tampilMatriks(d);

        Helper.newLine();
        e.tampilMatriks();

        Helper.newLine();
        a.jumlah2Matriks(c).tampilMatriks();

        Helper.newLine();
        Matriks.tampilMatriks(Matriks.jumlah2Matriks(a, b));

        Helper.newLine();
        a.selisih2Matriks(c).tampilMatriks();

        Helper.newLine();
        Matriks.tampilMatriks(Matriks.selisih2Matriks(b, c));
    }
}