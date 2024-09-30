package com.ali.pbo.week7.perbankan;

public class PengambilanUang extends Tabungan
{
    private int proteksi = 0;

    public PengambilanUang(int saldo)
    {
        super(saldo);
    }

    public PengambilanUang(int saldo, int proteksi)
    {
        super(saldo);
        this.proteksi = proteksi;
    }

    public boolean ambilUang(int jumlah)
    {
        if (jumlah <= this.saldo - this.proteksi)
        {
            this.saldo -= jumlah;
            return true;
        }
        else return false;
    }
}
