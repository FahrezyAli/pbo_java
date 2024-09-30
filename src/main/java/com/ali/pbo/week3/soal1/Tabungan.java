package com.ali.pbo.week3.soal1;

public class Tabungan
{
    private int saldo;

    public Tabungan(int initsaldo)
    {
        this.saldo = initsaldo;
    }

    public int getSaldo()
    {
        return this.saldo;
    }

    public void simpanUang(int jumlah)
    {
        this.saldo += jumlah;
    }

    public boolean ambilUang(int jumlah)
    {
        if (this.saldo >= jumlah)
        {
            this.saldo -= jumlah;
            return true;
        } else return false;
    }
}
