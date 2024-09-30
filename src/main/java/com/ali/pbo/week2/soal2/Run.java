package com.ali.pbo.week2.soal2;

import com.ali.pbo.Helper;

public class Run
{
    public static final Pecahan tigaperdua = new Pecahan(3, 2);
    public static final Pecahan limaperenam = new Pecahan(5, 6);
    
    public static void main(String[] args)
    {
        //Penjumlahan
        Pecahan jumlah = tigaperdua.tambah(limaperenam);
        Helper.println(tigaperdua.toString() + " + " + limaperenam.toString() + " = " + jumlah.toString() + " = " + jumlah.sederhanakan().toString());

        //Pengurangan
        Pecahan kurang = tigaperdua.kurang(limaperenam);
        Helper.println(tigaperdua.toString() + " - " + limaperenam.toString() + " = " + kurang.toString() + " = " + kurang.sederhanakan().toString());

        //Pengkalian
        Pecahan kali = tigaperdua.kali(limaperenam);
        Helper.println(tigaperdua.toString() + " * " + limaperenam.toString() + " = " + kali.toString() + " = " + kali.sederhanakan().toString());

        //Pembagian
        Pecahan bagi = tigaperdua.bagi(limaperenam);
        Helper.println(tigaperdua.toString() + " / " + limaperenam.toString() + " = " + bagi.toString() + " = " + bagi.sederhanakan().toString());
    }
}
