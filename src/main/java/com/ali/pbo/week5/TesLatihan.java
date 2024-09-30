package com.ali.pbo.week5;

import com.ali.pbo.Helper;

public class TesLatihan
{
    public static String getTime (Kalender kal) {
        String tmp;
        tmp = kal.getTanggal () + "-" + kal.getBulan () + "-" + kal.getTahun ();
        return tmp;
    }
    
    public static void main(String args[])
    {
        Kalender kal = new Kalender (8);
        Helper.println("Waktu awal : " + getTime (kal));
        kal.setTanggal (9);
        Helper.println("1 hari setelah waktu awal : " + getTime (kal));
        kal = new Kalender (6,2003);
        Helper.println("Waktu berubah : " + getTime (kal));
        kal.setBulan (7);
        Helper.println("1 bulan setelah itu : " + getTime(kal));
        kal = new Kalender (20, 10,2004);
        Helper.println("Waktu berubah : " + getTime(kal));
        kal.setTahun (2005);
        Helper.println("1 tahun setelah itu : " + getTime (kal));
    }
}