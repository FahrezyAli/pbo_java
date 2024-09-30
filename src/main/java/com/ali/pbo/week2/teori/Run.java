package com.ali.pbo.week2.teori;

import com.ali.pbo.Helper;

public class Run
{

    public static final BendaBulat bola1 = new BendaBulat();

    public static final BendaBulatDua bola2 = new BendaBulatDua();

    public static final BidangSegi4 persegi = new BidangSegi4();

    public static final BidangSegi4Dua persegi_panjang = new BidangSegi4Dua();

    public static void main(String[] args)
    {
        Helper.println("Benda bulat satu dengan radius 10");
        Helper.println("Luas: " + bola1.luasLingkaran(10));
        Helper.println("Volume: " + bola1.volumeBola(10));
        Helper.newLine();

        Helper.println("Benda bulat dua dengan radius 10");
        bola2.setRadius(10);
        Helper.println("Luas: " + bola2.luasLingkaran());
        Helper.println("Volume: " + bola2.volumeBola());
        Helper.newLine();

        Helper.println("Bidang segi 4 satu dengan panjang 15");
        Helper.println("Luas: " + persegi.luasBujurSangkar(15));
        Helper.newLine();

        Helper.println("Bidang segi 4 dua dengan panjang 15 dan lebar 5");
        persegi_panjang.setPanjang(15);
        persegi_panjang.setLebar(5);
        Helper.println("Luas: " + persegi_panjang.luasPersegiPanjang());
    }
}
