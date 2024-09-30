package com.ali.pbo.week8.soal4;

import com.ali.pbo.Helper;

public class Run
{
    public static void main(String[] args)
    {
        final Balok bl1 = new Balok(5, 7, 10, "biru");
        bl1.display();
        Helper.newLine();

        final BendaPersegi bp1 = (BendaPersegi) bl1;
        bp1.display();
        Helper.newLine();

        final Balok bl2 = (Balok) bp1;
        bl2.display();
    }
}
