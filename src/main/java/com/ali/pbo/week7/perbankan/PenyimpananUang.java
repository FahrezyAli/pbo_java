package com.ali.pbo.week7.perbankan;

public class PenyimpananUang extends Tabungan
{
    public PenyimpananUang(int saldo, double tingkatBunga)
    {
        super((int) (saldo + (saldo * tingkatBunga)));
    }
}
