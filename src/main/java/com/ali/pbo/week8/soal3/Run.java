package com.ali.pbo.week8.soal3;

import com.ali.pbo.Helper;

public class Run
{
    public static void main(String[] args)
    {
        final Tabung tb1 = new Tabung(5, 10, "hijau");
        tb1.display();
        Helper.newLine();

        final BendaBulat bb1 = (BendaBulat) tb1;
        bb1.display();
        Helper.newLine();

        final Tabung tb2 = (Tabung) bb1;
        tb2.display();
    }
}
